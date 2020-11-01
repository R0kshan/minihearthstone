import { Component } from '@angular/core';
import { Server } from './server';

// Web socket imports
import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
import { Router } from '@angular/router';
import { Location, LocationStrategy, PathLocationStrategy } from '@angular/common';

import * as FacadeProperties from '../webclientfacade/facade-properties';

import * as $ from 'jquery';
import { Observable } from 'rxjs';
import { Player } from '../player/player';
import { setPlayer, gameBoard, player, setLastRequestSentToOther, getState } from '../webclientfacade/facade-properties';
import { Card } from '../card/card';
import { Message } from '../message/message';


@Component({
  selector: 'app-path-location',
  providers: [Location, { provide: LocationStrategy, useClass: PathLocationStrategy }],
  template: `
    <!--<h1>PathLocationStrategy</h1>
    Current URL is: <code>{{location.path()}}</code><br>
    Normalize: <code>/foo/bar/</code> is: <code>{{location.normalize('foo/bar')}}</code><br>-->
  `
})

/**
 * Server proxy component
 */
export class ServerProxyComponent implements Server {

  serverURL: string;
  private stompClient;
  private playerId;
  router: Router;
  connected = false;

  /**
   * ServerProxyComponent constructor
   * @param router change url route to switch components without reloading the page
   */
  constructor(router: Router) {

    // Set router
    this.router = router;

    // Set server URL
    // this.serverURL = 'http://localhost:8090/'; // Localhost
    this.serverURL = 'https://minihearthstone-server.herokuapp.com/'; // Deployed on heroku

    // Generate unique playerId
    const date = new Date();
    const time = date.getTime();
    this.playerId = Math.floor(Math.random() * 1000) + 1 + '' + time;

    // Connect websocket to server
    this.connect(this.router);

    // Check whether connected to server is established
    this.isConnectionEstablished();

  }

  /**
   * Check whether web socket connection to server is established. If not, show message to player that the client can't get
   * connected to the server
   */
  isConnectionEstablished() {
    const that = this;
    if (this.stompClient.connected) {
      // $('#serverLoginMsg').hide();
      // window.location.href = '/';
      $('#serverLoginMsg').html('Connected to server <i class="fa fa-check"></i>');
    } else {
      setTimeout(function () {
        that.isConnectionEstablished();
      }, 1000);
    }
  }

  /**
   * Check connection every 5s to see if the connection is still established. If not notify the player and return to login page
   */
  checkConnection() {
    const that = this;
    // console.log(this.stompClient);
    if (this.stompClient.connected) {
      setTimeout(function () {
        that.checkConnection();
      }, 10000);
    } else {
      // Notifiy user
      $('.modal').hide(); // hide all other opponened modals
      this.showGeneralNotificationModal('Lost connection to server. You will be redirected to login screen.');
      $('#serverLoginMsg').html('Server is down. Try again later.');

      console.log('Connection lost');
      // Then navigate to login page
      setTimeout(function () {

        that.hideGeneralNotificationModal();
      }, 3000);
      console.log('Navigating to login page');
      // this.router.navigate([''], { queryParams: { reconnect: 'true' } });
      FacadeProperties.stopGameBoardBackgroundMusic();
      // this.router.navigate(['']);
      window.location.href = '/';
    }
  }

  /**
   * Connect web socket to server
   * @param router router (used to switch between components)
   */
  connect(router: Router) {

    console.log('Trying to establish connection to server ...');

    // Configure the web socket
    const ws = new SockJS(this.serverURL);
    this.stompClient = Stomp.over(ws);
    const that = this;

    // $('#serverLoginMsg').hide();

    // Send connection
    this.stompClient.connect({}, function (frame) {

      console.log(that.stompClient);

      // In case web socket previously subscribed to these subcriptions
      console.log('Number of subscriptions ' + that.stompClient.subscriptions.length);
      if (that.stompClient.subscriptions.length > 0) {
        that.stompClient.unsubscribe();
      }

      // BELOW : all the subscriptions to receive messages sent from the other player
      that.preSubscriptionToMsgFromOtherPlayer();
      that.preSubscriptionToReplyFromServer();

    }, () => {
      console.log('Socket connection lost. Reconnecting ...');
      this.reconnect();
    });
  }


  /**
   * Reconnect the web socket evevery 1s
   * @param socketUrl socket url
   * @param successCallback function to call once reconnected to web socket
   */
  reconnect() {
    let connected = false;
    const reconInv = setInterval(() => {

      const ws = new SockJS(this.serverURL);
      this.stompClient = Stomp.over(ws);
      const that = this;

      this.stompClient.connect({}, (frame) => {
        clearInterval(reconInv);
        connected = true;
        that.preSubscriptionToMsgFromOtherPlayer();
        that.preSubscriptionToReplyFromServer();
      }, () => {
        if (connected) {
          this.reconnect();
        }
      });
    }, 1000);
  }

  /**
   * Pre subscribe to to urls to receive messages sent from the other player to this player
   */
  preSubscriptionToMsgFromOtherPlayer() {

    const that = this;
    const playerId = this.playerId;

    // Subscribe to url : /client/{playerId}
    this.stompClient.subscribe('/client/' + playerId, (response) => {
      if (response.body) {
        console.log(response.body);
      }
    });

    // Receive notification that other player has chosen their hero and that game can start
    this.stompClient.subscribe('/client/haschosenhero/player/' + playerId, (response) => {
      if (response.body) {

        // Parse to JSON
        const match = JSON.parse(response.body);

        // If match contains both players id then send init game
        if (match.p1ClientId !== null && match.p2ClientId !== null) {
          console.log('Calling initgame');
          if (FacadeProperties.getState() !== 'starting-game' && FacadeProperties.getState() !== 'in-game') {
            that.initGame();
          }
        }
      }
    });


    // Receive other player's hero
    this.stompClient.subscribe('/client/receivehero/player/' + playerId, (response) => {
      if (response.body) {
        const hero = JSON.parse(response.body);
        FacadeProperties.setOpponentHero(hero);
        console.log('Init game ennemy hero : ' + FacadeProperties.opponentHero.name);
      }
    });

    // Receive notification that other player has logged out
    this.stompClient.subscribe('/client/receivenotifylogout/player/' + playerId, (response) => {
      if (response.body) {

        // Show message in modal
        $('.modal').hide(); // hide all other opponened modals

        this.showGeneralNotificationModal(response.body);

        FacadeProperties.setPlayerOpponent(null);
        FacadeProperties.setState('in-dashboard');

        // Redirect to dashboard
        setTimeout(function () {
          FacadeProperties.stopGameBoardBackgroundMusic();
          console.log('Redirect to dashboard');
          that.router.navigate(['/dashboard']);
          FacadeProperties.resetAllProperties();
          $('#generalNotificationModal').hide();
        }, 2000);
      }
    });

    // Receive gameboard update from other player
    this.stompClient.subscribe('/client/receivegameboardupdate/player/' + playerId, (response) => {
      if (response.body) {

        // Update gameboard in properties
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Indicate that gameboard update from server has been received by setting reception to true
        console.log('Received gameboard update from other player');
        FacadeProperties.setReception(true);
      }
    });

    // Receive end of turn signal from other player
    this.stompClient.subscribe('/client/receiveendofturn/player/' + playerId, (response) => {
      if (response.body) {

        // Update gameboard in properties
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Notify player that turn has been ended
        that.showGameBoardMessageModal('It\'s now your turn!');

        // Indicate that gameboard update from server has been received by setting reception to true
        console.log('Received gameboard update from other player');
        FacadeProperties.setReception(true);

      }
    });


    this.stompClient.subscribe('/client/receivemessage/player/' + playerId, (response) => {
      if (response.body) {

        // Update gameboard in properties
        console.log('Player : ' + JSON.stringify(FacadeProperties.getPlayer(this.playerId)));
        const newMessage: Message = new Message(FacadeProperties.getPlayer(this.playerId).name, response.body, '');

        FacadeProperties.setReceivedMessage(newMessage);
        FacadeProperties.setMsgReception(true);
        $('#unreadMessages').show();

        console.log('Receive message from opponent : ' + JSON.stringify(newMessage));

      }
    });

    // Receive random match from server
    this.stompClient.subscribe('/client/receiverandommatch/player/' + this.playerId, (response) => {
      if (response.body) {
        const match = JSON.parse(response.body);

        // Save gameId in properties
        FacadeProperties.setGameId(match.id);

        if (match.p1ClientId !== null && match.p2ClientId !== null) {

          FacadeProperties.setState('match-found');
          console.log('Set state to : ' + FacadeProperties.getState());

          // Set opponent id
          let opponentId = '';
          if (match.p1ClientId === this.playerId) {
            opponentId = match.p2ClientId;
          } else if (match.p2ClientId === this.playerId) {
            opponentId = match.p1ClientId;
          }

          // Get opponent player object
          that.getOpponentPlayerById(opponentId);
        }
      }
    });

    // Receive match cancelation from other player
    this.stompClient.subscribe('/client/receivecancelmatch/player/' + this.playerId, (response) => {
      if (response.body) {
        console.log('Received match canceled from other player. Looking for random match...');
        that.findRandomMatch();
      }
    });

    // receive quit game notification from other player
    this.stompClient.subscribe('/client/receivequitgame/player/' + this.playerId, (response) => {
      if (response.body) {

        this.showGeneralNotificationModal(response.body);

        // Unset states and opponent
        FacadeProperties.setPlayerOpponent(null);
        FacadeProperties.setState('in-dashboard');

        setTimeout(function () {
          FacadeProperties.stopGameBoardBackgroundMusic();
          $('#generalNotificationModal').hide();
          FacadeProperties.resetAllProperties();
          that.router.navigate(['/dashboard']);
        }, 1500);

      }
    });

    // receive quit game notification from other player
    this.stompClient.subscribe('/client/receiveacknowledgmentofreceipt/player/' + this.playerId, (response) => {
      if (response.body) {
        console.log('Received acknowledgment of receipt ' + response.body);
        FacadeProperties.setAcknowlegmentOfReceipt(true);
      }
    });

  }

  /**
   * Pre subscribe to urls to receive replies sent from this player to the server
   */
  preSubscriptionToReplyFromServer() {

    const that = this;


    // Subscribe to url: /client/login/player/{playerId}
    this.stompClient.subscribe('/client/login/player/' + this.playerId, (response) => {
      if (response.body) {
        const currPlayer = JSON.parse(response.body);

        if (currPlayer.clientId !== -1) {
          // Store player info in FacadeProperties
          FacadeProperties.setPlayer(currPlayer);

          // Switch to waiting room
          this.router.navigate(['/dashboard']);

        } else {
          $('#serverLoginMsg').html('This username is already taken');
          $('#serverLoginMsg').show();
          console.log('Please choose another username');
        }
      }
    });

    // Subscribe to url: /client/removeplayer/player/{playerId}
    this.stompClient.subscribe('/client/logout/player/' + this.playerId, (response) => {
      if (response.body) {
        FacadeProperties.setState('in-dashboard');
        that.router.navigate(['/']);
        FacadeProperties.resetAllProperties();
      }
    });

    // Subscribe to url: /client/playerinfo/player/{playerId}
    this.stompClient.subscribe('/client/playerinfo/player/' + this.playerId, (response) => {
      if (response.body) {
        const currPlayer = JSON.parse(response.body);
        FacadeProperties.setPlayer(currPlayer);
      }
    });

    // Subscribe to url: /client/getallplayers/player/{playerId}
    this.stompClient.subscribe('/client/getallplayers/player/' + this.playerId, (response) => {
      if (response.body) { }
    });

    // Receive list of all heroes sent from server
    this.stompClient.subscribe('/client/getallheroes/player/' + this.playerId, (response) => {
      if (response.body) {
        const heroes = JSON.parse(response.body);
        FacadeProperties.setHeroes(heroes);
        console.log('Stored in client : ' + FacadeProperties.heroes);
        this.router.navigate(['/lobby']);
      }
    });

    // Subscribe to url: /client/choosehero/player/{playerId}
    this.stompClient.subscribe('/client/choosehero/player/' + this.playerId, (response) => {
      if (response.body) {
        const match = JSON.parse(response.body);

        // Notify player of server response
        $('#serverMessageForHeroChoice').html('You\'ve chosen ' +
          FacadeProperties.hero.name +
          '. Waiting for other player to choose their hero ...');
        $('#gameStartNotificationModal').show();
        FacadeProperties.playModalAppearSound();

        console.log('Checking state for initgame. State : ' + FacadeProperties.getState());

        // If match contains both players id then send init game
        if (match.p1ClientId !== null && match.p2ClientId !== null) {

          if (FacadeProperties.getState() !== 'starting-game' && FacadeProperties.getState() !== 'in-game') {
            this.initGame();
          }
          console.log('From choose hero subscribe');
        }

        const opponentId = FacadeProperties.playerOpponent.clientId;

        // Send my hero to opponent
        this.stompClient.send('/server/sendmyhero/player/' + this.playerId + '/opponent/' + opponentId);

        // Notify other player that I have chosen my hero
        this.stompClient.send('/server/haschosenhero/player/' + opponentId + '/game/' + FacadeProperties.gameId);
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/gethero/player/' + this.playerId, (response) => {
      if (response.body) {
        const hero = JSON.parse(response.body);
        FacadeProperties.setOpponentHero(hero);
        // console.log('Init game ennemy hero : ' + FacadeProperties.opponentHero.name);
      }
    });

    // Receive game initialize
    this.stompClient.subscribe('/client/initgame/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);
        // console.log('Player : ' + FacadeProperties.getPlayer(this.playerId));
        // console.log('Receive game initialization');
        this.getFirstHandOfCards();
      }
    });

    // Receive the card deck from
    this.stompClient.subscribe('/client/getfirsthand/player/' + this.playerId, (response) => {
      if (response.body) {

        const gameboard = JSON.parse(response.body);

        // console.log('Current state : ' + FacadeProperties.getState());

        FacadeProperties.setGameBoard(gameboard);
        FacadeProperties.setState('getfirsthand');
        // console.log('Stored gameboard in client' + FacadeProperties.gameBoard.id);
        // console.log('Set game state to : ' + FacadeProperties.getState());


        this.initGameSuccessCallback();
      }
    });

    // Receive the card deck from
    this.stompClient.subscribe('/client/choosecard/player/' + this.playerId, (response) => {
      if (response.body) {

        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/cardattackservant/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/spellcardattackservant/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/spellcardonfriendlyservant/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/cardattackhero/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/spellcardattackhero/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/heroattackservant/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/heroattackhero/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/useherospecial/player/' + this.playerId, (response) => {
      if (response.body) {
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);

        // Update my gameboard
        this.updateGameBoard();
      }
    });

    // Get hero of opponent player
    this.stompClient.subscribe('/client/updategameboard/player/' + this.playerId, (response) => {
      if (response.body) {

        // Save gameboard and indicate that update has been received with setReception(true)
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);
        FacadeProperties.setReception(true);

        // Update other player's interface
        const opponentId = FacadeProperties.playerOpponent.clientId;
        const gameId = FacadeProperties.gameId;
        this.stompClient.send('/server/sendgameboardupdate/player/' + opponentId + '/game/' + gameId);

      }
    });

    // Receive confirmation from server that my turn has ended
    this.stompClient.subscribe('/client/endmyturn/player/' + this.playerId, (response) => {
      if (response.body) {

        // Save gameboard
        const gameboard = JSON.parse(response.body);
        FacadeProperties.setGameBoard(gameboard);
        FacadeProperties.setReception(true);

        // Notify player that turn has been ended
        that.showGameBoardMessageModal('It \'s the end of your turn. ' + FacadeProperties.playerOpponent.name + ' is playing.');

        const gameId = FacadeProperties.gameId;
        const opponentId = FacadeProperties.playerOpponent.clientId;

        // Notify other player that I've ended my turn
        this.stompClient.send('/server/sendendofturn/player/' + opponentId + '/game/' + gameId);

      }
    });

    // Receive response for getting random match from server
    this.stompClient.subscribe('/client/findrandommatch/player/' + this.playerId, (response) => {
      if (response.body) {
        const match = JSON.parse(response.body);

        // Save gameId in properties
        FacadeProperties.setGameId(match.id);

        if (match.p1ClientId !== null && match.p2ClientId !== null) {

          // Set status
          FacadeProperties.setState('match-found');
          console.log('Set state to : ' + FacadeProperties.getState());

          // Set opponent id
          let opponentId = '';
          if (match.p1ClientId === this.playerId) {
            opponentId = match.p2ClientId;
          } else if (match.p2ClientId === this.playerId) {
            opponentId = match.p1ClientId;
          }

          // Get opponent player object
          that.getOpponentPlayerById(opponentId);

          // Notify other player that match has been found
          that.sendRandomMatchToOpponent(opponentId, match.id);
        }
      }
    });

    // Receive opponent from server
    this.stompClient.subscribe('/client/receiveopponent/player/' + this.playerId, (response) => {
      if (response.body) {
        const opponent = JSON.parse(response.body);
        FacadeProperties.setPlayerOpponent(opponent);

        $('#serverMessage').html('<p>Match found! Redirecting to lobby ...</p>');
        $('#acceptMatchBtn').hide();
        $('#acceptMatchRequestBtn').hide();
        $('#rejectMatchBtn').hide();
        $('#okBtn').hide();
        this.showMatchProposalModal();

        // Opponent player received, redirect to lobby after getting all heroes
        setTimeout(function () {

          // Get all heroes
          that.getAllHeroes();

          that.hideGeneralNotificationModal();
        }, 1500);

      }
    });

    // Cancel match
    this.stompClient.subscribe('/client/cancelmatch/player/' + this.playerId, (response) => {
      if (response.body) {
        $('#serverMessage').html('<p>Match canceled.</p>');
        this.showMatchProposalModal();
        $('#cancelMatchRequestBtn').hide();

        that.sendCancelMatch();
      }
    });

    // receive reply for quitgame
    this.stompClient.subscribe('/client/quitgame/player/' + this.playerId, (response) => {
      if (response.body) {

        this.showGeneralNotificationModal(response.body);

        // Notify other player this player is quitting the game
        that.notifyQuitGame();

        setTimeout(function () {
          $('#generalNotificationModal').hide();
          that.router.navigate(['/dashboard']);
        }, 1500);
      }
    });

  }

  /**
   * Login with username to server (user will be saved in JPAPersistence until disconnection)
   * @param playername Player name entered in login interface
   */
  login(playername) {
    this.stompClient.send('/server/login/player/' + this.playerId + '/playername/' + playername);
  }

  /**
   * Send player logout to server
   */
  logout() {
    const playerId = this.playerId;

    FacadeProperties.setState('in-dashboard');

    // If current in lobby or in-game send a message to the other player that i've logged out
    if (FacadeProperties.playerOpponent != null) {
      const opponentId = FacadeProperties.playerOpponent.clientId;
      this.stompClient.send('/server/notifylogout/player/' + playerId + '/opponent/' + opponentId);
    }

    // Logout this user and delete in jpa
    this.stompClient.send('/server/logout/player/' + playerId);

  }

  /**
   * Get player object from serveur using playerId
   */
  getPlayer() {
    this.stompClient.send('/server/playerinfo/player/' + this.playerId);
  }

  /**
   * Get all players from server
   */
  getAllPlayers() {
    this.stompClient.send('/server/getallplayers/player/' + this.playerId);
  }

  /**
   * Get the list of all heroes from server
   */
  getAllHeroes() {
    this.stompClient.send('/server/getallheroes/player/' + this.playerId);
  }

  /**
   * Send hero choice to server
   * @param heroId id of selected hero
   */
  chooseHero(heroId: number) {
    const playerId = this.playerId;

    if (FacadeProperties.gameId !== null && FacadeProperties.playerOpponent != null) {
      this.stompClient.send('/server/choosehero/player/' + playerId + '/hero/' + heroId +
        '/game/' + FacadeProperties.gameId);
    }
  }

  /**
   * Get the hero of opponent player from server
   * @param opponentId id of opponent player
   */
  getOpponentHero(opponentId: number) {
    this.stompClient.send('/server/gethero/player/' + this.playerId + '/opponent/' + opponentId);
  }

  /**
   * Get game initialization from server
   */
  initGame() {
    FacadeProperties.setState('starting-game');
    // Ask for game initialisation
    this.stompClient.send('/server/initgame/player/' + this.playerId + '/game/' + FacadeProperties.gameId);
  }

  /**
   * Set client state to 'in-game' and redirect player to the gameboard
   */
  initGameSuccessCallback() {

    // Redirect to gameboard
    FacadeProperties.setState('in-game');
    this.router.navigate(['/gameboard']);
  }

  /**
   * Get the card deck of my hero from server
   */
  getFirstHandOfCards() {
    // Send the request to get first hand
    const heroId = FacadeProperties.hero.id;
    const gameId = FacadeProperties.gameId;
    this.stompClient.send('/server/getfirsthand/player/' + this.playerId + '/hero/' + heroId + '/game/' + gameId);
  }

  /**
   * Send card choice to server
   * @param cardUniqueId  unique id of chosen card
   */
  chooseCard(cardUniqueId: string) {

    // Send chosen card to server
    const gameId = FacadeProperties.gameId;
    this.stompClient.send('/server/choosecard/player/' + this.playerId + '/game/' + gameId, {}, cardUniqueId);
  }

  /**
   * Send request to server to apply my card's effect on target
   * @param myCard my card unique id
   * @param opponentCard opponent card unique id
   */
  applyCardOnTargetServant(myCardUniqueId: string, opponentCardUniqueId: string) {

    console.log('Called applyCardOnTargetServant()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/cardattackservant/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId, {},
      JSON.stringify([myCardUniqueId, opponentCardUniqueId])
    );
  }

  /**
   * Send request to server to apply my spell card on servant
   * @param myTargetSpellCardUniqueId  my spell card's unique id
   * @param opponentCardUniqueId  my opponent's card unique id
   */
  applySpellCardOnServant(myTargetSpellCardUniqueId: string, opponentCardUniqueId: string) {

    console.log('Called applySpellCardOnServant()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/spellcardattackservant/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId, {},
      JSON.stringify([myTargetSpellCardUniqueId, opponentCardUniqueId])
    );
  }

  /**
   * Send request to server to apply my spell card on friendly servant
   * @param myTargetSpellCardUniqueId  my spell card's unique id
   * @param friendlyCardUniqueId my friendly servant's card unique id
   */
  applySpellCardOnFriendlyServant(myTargetSpellCardUniqueId: string, friendlyCardUniqueId: string) {

    console.log('Called applySpellCardOnFriendlyServant()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/spellcardonfriendlyservant/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId, {},
      JSON.stringify([myTargetSpellCardUniqueId, friendlyCardUniqueId])
    );
  }

  /**
   * Send request to server to attack target hero
   * @param myCardUniqueId my servant card unique id
   */
  applyCardOnTargetHero(myCardUniqueId: string) {
    console.log('Called applyCardOnTargetServant()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/cardattackhero/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId,
      {}, myCardUniqueId);
  }

  /**
   * Send resquest to server to apply my spell card on opponent hero
   * @param myTargetSpellCardUniqueId my spell card's unique id
   */
  applySpellCardOnHero(myTargetSpellCardUniqueId: string) {
    console.log('Called applySpellCardOnHero()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;


    this.stompClient.send('/server/spellcardattackhero/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId,
      {}, myTargetSpellCardUniqueId);

  }

  /**
   * Send request to apply hero special on servant
   * @param opponentServantUniqueId opponent servant card unique id
   */
  applyHeroSpecialOnServant(opponentServantUniqueId: string) {
    console.log('Called applyHeroSpecialOnServant()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/heroattackservant/player/' + this.playerId + '/opponent/' + opponentId + '/game/' + gameId,
      {}, opponentServantUniqueId);
  }

  /**
   * Send request to apply my hero special on opponent's hero
   */
  applyHeroSpecialOnHero() {
    console.log('Called applyHeroSpecialOnHero()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/heroattackhero/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId, {});
  }

  /**
   * Send request to apply my hero special skill on self
   */
  useHeroSpecial() {
    console.log('Called useHeroSpecial()');

    const gameId = FacadeProperties.gameId;
    const opponentId = FacadeProperties.playerOpponent.clientId;

    this.stompClient.send('/server/useherospecial/player/' + this.playerId + '/opponent/' + opponentId + ' /game/' + gameId, {});
  }

  /**
   * Send request to server to get updated gameboard
   */
  updateGameBoard() {

    // Request gameboard update from server
    const gameId = FacadeProperties.gameId;
    this.stompClient.send('/server/updategameboard/player/' + this.playerId + '/game/' + gameId);
  }

  /**
   * Send request to server to end my turn
   */
  endMyTurn() {

    if (FacadeProperties.playerOpponent) {
      const opponentId = FacadeProperties.playerOpponent.clientId;

      // Send to server that i've ended my turn
      const gameId = FacadeProperties.gameId;
      this.stompClient.send('/server/endmyturn/player/' + this.playerId + '/opponent/' + opponentId + '/game/' + gameId);
    } else {
      console.log('Player opponent is null.');
    }
  }

  /**
   * Disconnect web socket connexion
   */
  disconnect() {
    if (this.stompClient != null) {
      this.stompClient.disconnect(true);
    }
    console.log('Disconnected');
  }

  /**
   * Find a random match
   */
  findRandomMatch() {
    FacadeProperties.setState('looking-for-match');
    this.stompClient.send('/server/findrandommatch/player/' + this.playerId);
    this.resendFindRandomMatch();
  }

  resendFindRandomMatch() {
    const that = this;
    setTimeout(function () {
      if (FacadeProperties.getState() === 'looking-for-match') {
        console.log('State : ' + FacadeProperties.getState() + '. Random match not found, resending request ...');
        that.stompClient.send('/server/findrandommatch/player/' + that.playerId);
        that.resendFindRandomMatch();
      }
    }, 5000);
  }

  /**
   * Send updated random match to opponent for them to get the opponent player object
   * @param opponentId opponent player's id
   * @param matchId match id
   */
  sendRandomMatchToOpponent(opponentId: string, matchId: string) {
    this.stompClient.send('/server/sendrandommatch/player/' + this.playerId + '/opponent/' + opponentId + '/match/' + matchId);
  }

  /**
   * Get opponent player object by their client id
   * @param opponentId client id
   */
  getOpponentPlayerById(opponentId: string) {
    this.stompClient.send('/server/getopponent/player/' + this.playerId + '/opponent/' + opponentId);
  }

  /**
   * Cancel a searching for a random match : deletes the associated match stored in JPA
   */
  cancelMatch() {
    FacadeProperties.setState('in-dashboard');
    const matchId = FacadeProperties.gameId;
    this.stompClient.send('/server/cancelmatch/player/' + this.playerId + '/match/' + matchId);
  }

  /**
   * Send match cancellation to the other player
   */
  sendCancelMatch() {
    // console.log(FacadeProperties.playerOpponent);
    if (FacadeProperties.playerOpponent) {
      const opponentId = FacadeProperties.playerOpponent.clientId;
      const matchId = FacadeProperties.gameId;
      this.stompClient.send('/server/sendcancelmatch/player/' + this.playerId + '/opponent/' + opponentId + '/match/' + matchId);
    }
  }

  /**
   * Send a text message to the other player
   * @param message message content
   */
  sendMessage(message: string) {
    if (FacadeProperties.playerOpponent) {
      const opponentId = FacadeProperties.playerOpponent.clientId;
      this.stompClient.send('/server/sendmessage/player/' + this.playerId + '/opponent/' + opponentId + '/message/' + message);
    }
  }

  /**
   * Send request to server to quit game
   */
  quitGame() {
    if (FacadeProperties.getGameBoard()) {
      const gameId = FacadeProperties.getGameBoard().gameId;
      const opponentId = FacadeProperties.playerOpponent.clientId;
      this.stompClient.send('/server/quitgame/player/' + this.playerId + '/opponent/' + opponentId + '/game/' + gameId);
    }
  }

  /**
   * Send notification to other player that this player has quit the game
   */
  notifyQuitGame() {
    const opponentId = FacadeProperties.playerOpponent.clientId;
    this.stompClient.send('/server/notifyquitgame/player/' + this.playerId + '/opponent/' + opponentId);
  }

  sendAcknowledgementOfReceipt(opponentId: number, requestUrl: string) {
    console.log('Sending to ' + opponentId + ' the acknowlegement receipt of url ' + requestUrl);
    this.stompClient.send('/server/sendacknowledgmentofreceipt/player/' + this.playerId + '/opponent/' + opponentId);
  }

  checkAcknowledgementOfReceipt() {

    const that = this;

    setTimeout(function () {
      if (!FacadeProperties.getAckknowlegmentOfReceipt()) {
        console.log('The other player has not sent an acknowledgement of receipt. Resending request : ' +
          FacadeProperties.getLastRequestSentToOther());
        that.stompClient.send(FacadeProperties.getLastRequestSentToOther());
        that.checkAcknowledgementOfReceipt();
      }
    }, 10000);
  }

  // Modal appearence methods

  /**
   * Show general notification modal for server messages or connection lost. (Needs to be moved to FacadeImpl)
   * @param message message to display in modal
   */
  showGeneralNotificationModal(message: string) {
    $('#serverNotificationMessage').html(message);
    $('#generalNotificationModal').show();
    FacadeProperties.playModalAppearSound();
  }

  /**
   * Hide general notification modal for server messages or connection lost. (Needs to be moved to FacadeImpl)
   */
  hideGeneralNotificationModal() {
    $('#generalNotificationModal').hide();
  }

  /**
   * Show match proposal modal
   */
  showMatchProposalModal() {
    $('#matchProposalModal').show();
    FacadeProperties.playModalAppearSound();
  }

  /**
   * Show gameboard message modal
   * @param message message content
   */
  showGameBoardMessageModal(message: string) {
    $('#serverMessageGameBoard').html(message);
    $('#gameboardMessagesModal').show();
    FacadeProperties.playModalAppearSound();
  }

}
