import { Component, OnInit } from '@angular/core';
import { FacadeImpl } from '../webclientfacade/facade-impl.service';
import { Player } from '../player/player';
import { Hero } from '../hero/hero';
import { Card } from '../card/card';
import * as $ from 'jquery';
import { delay } from 'q';
import '../../../node_modules/font-awesome/css/font-awesome.css';
import { Facade } from '../webclientfacade/facade';
import { playVictorySound } from '../webclientfacade/facade-properties';





@Component({
  selector: 'app-gameboard',
  templateUrl: './gameboard.component.html',
  styleUrls: ['./gameboard.component.css']
})
/**
 * Gameboard component
 */
export class GameboardComponent implements OnInit {

  player: Player;
  hero: Hero;
  opponent: Player;
  opponentHero: Hero;
  handOfCards: Card[];
  cardsOnGround: Card[] = [];
  opponentCardsOnGround: Card[] = [];
  myturn: boolean;
  mytimer;
  timer: number;
  gameDuration = 120;  // game lasts 60s
  restartTimerCallingEndOfTurn = false;
  restartTimerSimple = false;
  selectedServant: Card;          // selected card on figthing ground (my card)
  selectedOpponentServant: Card;  // selected card on figthing ground (opponent's card card)
  selectedOpponentHero: Hero;     // selected opponent hero
  selectedHeroSpecial = false;    // selected hero special skill
  selectedCardInHand: Card;
  facade: FacadeImpl;

  /**
   * Constructor
   * @param newFacade Web client facade
   */
  constructor(private newFacade: FacadeImpl) {
    this.facade = newFacade;
  }

  /**
   * Lifecycle hook
   */
  ngOnInit() {

    this.facade.playGameBoardBackgroundMusic();

    this.player = this.facade.getPlayer();

    if (this.player == null) {
      window.location.href = '/';
    }

    this.opponent = this.facade.getPlayerOpponent();
    this.hero = this.facade.getHero(this.player.clientId);
    this.opponentHero = this.facade.getHero(this.opponent.clientId);
    this.handOfCards = this.facade.getHandOfCards(this.player.clientId);

    // Temporary solution to solve rare bug from server where there are more than 3 cards in hand from first hand
    // console.log('Hand of cards received : ' + JSON.stringify(this.handOfCards));

    if (this.handOfCards.length > 3) {
      // console.log('There are ' + this.handOfCards.length + ' cards. Removing the extra cards from hand.');
      this.handOfCards = this.handOfCards.slice(0, 2);
    }

    this.countdownCallingEndOfTurn();

    console.log('Current turn : ' + this.facade.getTurn());

    // If it's not my turn continously wait for gameboard update from the server
    if (this.facade.getTurn() !== this.player.clientId) {
      this.facade.setReception(false);
      this.waitForGameBoardUpdate();
      this.myturn = false;
      $('#serverMessageGameBoard').html(this.opponent.name + ' is playing');
      $('#serverMessageGameBoard').show();

    } else {
      this.myturn = true;
    }

    this.facade.checkConnection();
  }

  /**
   * Automatically ends the player's turn when the countdown reaches 0
   */
  async countdownCallingEndOfTurn() {

    this.restartTimerCallingEndOfTurn = false;
    this.restartTimerSimple = true;

    this.timer = this.gameDuration;
    // console.log('Countdown at : ' + this.timer);
    // console.log('this.timer >= 0 ? ' + (this.timer >= 0));

    while (this.timer > 0 && this.facade.getState() === 'in-game') {
      if (this.restartTimerCallingEndOfTurn) {
        break;
      }
      await delay(1000);
      this.timer = this.timer - 1;
      // console.log(this.timer);
    }

    if (this.myturn) {
      this.endMyTurn();
    }

  }

  /**
   * Start simple coutdown while other player is player (to show how much time left before this player can play)
   */
  async simpleCountdown() {

    this.restartTimerCallingEndOfTurn = true;
    this.restartTimerSimple = false;
    this.timer = this.gameDuration;

    while (this.timer > 0 && this.facade.getState() === 'in-game') {
      if (this.restartTimerSimple) {
        break;
      }
      await delay(1000);
      this.timer = this.timer - 1;
    }
  }

  /**
   * If still hasn't received gameboard update, wait 1000ms before resending gameboard update request
   */
  waitForGameBoardUpdate() {
    const that = this;
    setTimeout(function () {
      // console.log('Waiting for server response...');
      // console.log('Current game state : ' + that.facade.getState());
      // console.log('Current turn in gameboard : ' + that.facade.getTurn());
      // console.log('My turn : ' + that.myturn);

      if (that.facade.getReception() === true) {

        // Remove all %20 from card names
        that.decodeAllURICardNames(that.facade.getHandOfCards(that.player.clientId));
        that.decodeAllURICardNames(that.facade.getCardsOnGround(that.player.clientId));
        that.decodeAllURICardNames(that.facade.getOpponentCardsOnGround(that.player.clientId));

        // Update this component's interface with server response
        that.handOfCards = that.facade.getHandOfCards(that.player.clientId);
        that.cardsOnGround = that.facade.getCardsOnGround(that.player.clientId);
        that.opponentCardsOnGround = that.facade.getOpponentCardsOnGround(that.player.clientId);
        that.player = that.facade.getPlayerById(that.player.clientId);
        that.hero = that.facade.getHero(that.player.clientId);
        that.opponentHero = that.facade.getOpponentHero(that.player.clientId);
        that.opponent = that.facade.getPlayerById(that.opponent.clientId);



        // If server gave more than 7 cards in hand make sure there are no more then 7
        if (that.handOfCards.length > 7) {
          that.handOfCards = that.handOfCards.slice(0, 6);
        }

        that.facade.setReception(false);

        // enable end of turn button if it's my turn
        if (that.facade.getTurn() === that.player.clientId && that.myturn === false) {
          that.myturn = true;

          // End my turn in 60 secondes
          that.countdownCallingEndOfTurn();
        }

        // Check if it's the end of the game
        if (that.facade.getWinner() !== null) {
          if (that.facade.getWinner() === that.player.clientId) {
            that.facade.playVictorySound();
            $('#serverMessageGameBoard').html('You win! Congratulations!');
            that.handOfCards = [];
            that.cardsOnGround = [];
            that.opponentCardsOnGround = [];
          } else {
            that.facade.playDefeatSound();
            $('#serverMessageGameBoard').html('You loose :( Better luck next time! ');
            that.handOfCards = [];
            that.cardsOnGround = [];
            that.opponentCardsOnGround = [];
          }
          $('#gameboardMessagesModal').show();
        }

        that.launchAttackAnimation();
        console.log('Gameboard updated');


        // If it's still not my turn to play that set reception to false and recall the function
        if (that.facade.getTurn() !== that.player.clientId) {
          that.facade.setReception(false);
          that.waitForGameBoardUpdate();
        }
      } else {

        if (that.facade.getState() === 'in-game') {
          // Wait for gameboard update
          that.waitForGameBoardUpdate();
        }
      }
    }, 1000);
  }

  /**
   * Update the component view using properties from gameboard sent from server
   * @param that reference this 'this'
   */
  updateBrowserInteface(that) {
    // Update this component's interface with server response
    that.handOfCards = this.facade.getHandOfCards(that.player.clientId);
    that.cardsOnGround = this.facade.getCardsOnGround(that.player.clientId);
    that.opponentCardsOnGround = this.facade.getOpponentCardsOnGround(that.player.clientId);
    that.player = this.facade.getPlayerById(that.player.clientId);
    that.hero = this.facade.getHero(that.player.clientId);
    that.opponentHero = this.facade.getOpponentHero(that.player.clientId);
    that.opponent = this.facade.getPlayerById(that.opponent.clientId);
    this.facade.setReception(false);


  }

  /**
   * End my turn and clear timeout for next round
   */
  endMyTurn() {

    if (this.facade.getGameBoard()) {
      // If it's my turn, send end my turn request to server and restart countdown
      if (this.facade.getGameBoard().turn === this.facade.getPlayer().clientId && this.facade.getState() === 'in-game') {
        this.myturn = !this.myturn;
        console.log('End my turn : ' + this.timer);
        console.log('Resetting countdown');

        this.simpleCountdown();

        this.facade.setReception(false);
        this.facade.endMyTurn();


        // Wait for gameboard update from other player
        this.waitForGameBoardUpdate();
      } else {
        this.resetSelection();
        $('#serverMessageGameBoard').html('It\'s not your turn yet!');
        $('#gameboardMessagesModal').show();
      }
    } else {
      console.log('Cannot end turn -> gameboard is null');
    }
  }

  /**
   * Select hero special skill
   */
  selectHerospecial() {

    // Check if it's my turn to play
    if (this.facade.getGameBoard().turn === this.facade.getPlayer().clientId) {

      // Check if player has enough mana
      if (this.player.mana - 2 >= 0) {

        if (this.hero.canUseSpecialSkill) {
          if (this.hero.skillType === 'self') {

            // Send skill activation to server
            this.facade.useHeroSpecial();
            this.facade.setReception(false);
            this.resetSelection();
            this.waitForGameBoardUpdate();

          } else if (this.hero.skillType === 'targeted') {
            this.selectedHeroSpecial = true;
          }
        } else {
          $('#serverMessageGameBoard').html('Special skill already used. Please wait for next round');
          $('#gameboardMessagesModal').show();
        }

      } else {
        this.resetSelection();
        $('#serverMessageGameBoard').html('Not enough mana!');
        $('#gameboardMessagesModal').show();
      }

    } else {
      this.resetSelection();
      $('#serverMessageGameBoard').html('It\'s not your turn yet!');
      $('#gameboardMessagesModal').show();
    }

  }

  /**
   * Select my servant
   * @param servant my servant card
   */
  selectServant(servant: Card) {
    // Check if it's my turn to play
    if (this.facade.getGameBoard().turn === this.facade.getPlayer().clientId) {

      this.selectedServant = servant;

      if (this.selectedCardInHand == null) {
        if (this.selectedServant.canAttack === true) {
          console.log('Selected servant : ' + this.selectedServant.name);
        } else {
          this.selectedServant = null;
          $('#serverMessageGameBoard').html('This servant can\'t fight yet! Please wait for the next round');
          $('#gameboardMessagesModal').show();
        }
      } else {
        console.log('applySpellCardOnServant()');
        // If selected servant is not null then call server method to apply the card's in hand skill to servant
        this.facade.applySpellCardOnFriendlyServant(this.selectedCardInHand.uniqueId, this.selectedServant.uniqueId);
        this.facade.setReception(false);
        this.resetSelection();
        this.waitForGameBoardUpdate();
      }
    } else {
      this.resetSelection();
      $('#serverMessageGameBoard').html('It\'s not your turn yet!');
      $('#gameboardMessagesModal').show();
    }
  }

  /**
   * Select target servant (belonging to opponent)
   * @param target target card
   */
  selectTargetServant(target: Card) {

    // Check if it's my turn to play
    if (this.facade.getGameBoard().turn === this.facade.getPlayer().clientId) {

      this.selectedOpponentServant = target;

      console.log('Selected opponent servant : ' + this.selectedOpponentServant.name);

      // Check if it's an attack on servant -> servant
      if (this.selectedServant != null && this.selectedOpponentServant != null) {

        // If checkPreActionEffects returns true, then no provocation effect
        if (this.checkPreActionEffects(this.selectedOpponentServant)) {
          console.log('No provocation effects blocking');

          console.log('card select card');
          this.facade.applyCardOnTargetServant(this.selectedServant.uniqueId, this.selectedOpponentServant.uniqueId);
          this.facade.setReception(false);
          this.selectedServant.canAttack = false;
          this.resetSelection();
          this.waitForGameBoardUpdate();
        } else {
          this.resetSelection();
          $('#serverMessageGameBoard').html('A servants\'s effect is blocking your attack');
          $('#gameboardMessagesModal').show();
        }
      } else if (this.selectedHeroSpecial && this.selectedOpponentServant != null) {

        if (this.checkPreActionEffects(this.selectedOpponentServant)) {

          // Else check if it's an attack on hero spell -> servant
          console.log('hero select card');
          this.facade.applyHeroSpecialOnServant(this.selectedOpponentServant.uniqueId);
          this.facade.setReception(false);
          this.resetSelection();
          this.waitForGameBoardUpdate();
        } else {
          $('#serverMessageGameBoard').html('A servant with provocation effect is blocking your attack');
          $('#gameboardMessagesModal').show();
        }
      } else if (this.selectedCardInHand && this.selectedOpponentServant != null) {

        if (this.checkPreActionEffects(this.selectedOpponentServant)) {

          // Else check if it's an attack on targeted spell card -> servant
          console.log('targeted spell select card');
          this.facade.applySpellCardOnServant(this.selectedCardInHand.uniqueId, this.selectedOpponentServant.uniqueId);
          this.facade.setReception(false);
          this.resetSelection();
          this.waitForGameBoardUpdate();
        } else {
          this.resetSelection();
          $('#serverMessageGameBoard').html('A servants\'s effect is blocking your attack');
          $('#gameboardMessagesModal').show();
        }
      }
    } else {
      this.resetSelection();
      $('#serverMessageGameBoard').html('It\'s not your turn yet!');
      $('#gameboardMessagesModal').show();
    }
  }

  /**
   * Select opponent hero as target
   * @param target opponent hero
   */
  selectTargetHero(target: Hero) {

    if (this.facade.getGameBoard().turn === this.facade.getPlayer().clientId) {
      this.selectedOpponentHero = target;

      console.log('Selected opponent hero : ' + this.selectedOpponentHero.name);

      if (this.selectedServant != null && this.selectedOpponentHero != null) {

        if (this.checkPreActionEffects(null)) {
          console.log('card select hero');
          this.facade.applyCardOnTargetHero(this.selectedServant.uniqueId);
          this.facade.setReception(false);
          this.selectedServant.canAttack = false;
          this.resetSelection();
          this.waitForGameBoardUpdate();
        } else {
          this.resetSelection();
          $('#serverMessageGameBoard').html('A servants\'s effect is blocking your attack');
          $('#gameboardMessagesModal').show();
        }
      } else if (this.selectedHeroSpecial && this.selectedOpponentHero != null) {
        // Else check if it's an attack on hero spell  -> hero
        if (this.checkPreActionEffects(null)) {
          console.log('hero select hero');
          this.facade.applyHeroSpecialOnHero();
          this.facade.setReception(false);
          this.resetSelection();
          this.waitForGameBoardUpdate();
        } else {
          this.resetSelection();
          $('#serverMessageGameBoard').html('A servants\'s effect is blocking your attack');
          $('#gameboardMessagesModal').show();
        }
      } else if (this.selectedCardInHand && this.selectedOpponentHero != null) {

        if (this.checkPreActionEffects(null)) {
          // Else check if it's an attack on targeted spell card -> hero
          console.log('targeted spell selected hero');
          this.facade.applySpellCardOnHero(this.selectedCardInHand.uniqueId);
          this.facade.setReception(false);
          this.resetSelection();
          this.waitForGameBoardUpdate();
        } else {
          this.resetSelection();
          $('#serverMessageGameBoard').html('A servants\'s effect is blocking your attack');
          $('#gameboardMessagesModal').show();
        }
      }
    } else {
      this.resetSelection();
      $('#serverMessageGameBoard').html('It\'s not your turn yet!');
      $('#gameboardMessagesModal').show();
    }
  }

  /**
   * Select card in hand
   * @param card  select my card in hand
   */
  selectCardInHand(card: Card) {

    console.log('selected card: ' + card.name);

    if (this.facade.getTurn() === this.facade.getPlayer().clientId) {

      // Check if it's a targetSpell
      if (card.nature === 'targetedSpell') {
        this.selectedCardInHand = card;
        console.log('Selected target spell : ' + this.selectedCardInHand.name);
      } else {
        console.log('choose card : ' + card.name);

        // Check if player has enough mana
        if (this.player.mana - card.manacost >= 0) {

          // Check if number of cards on ground does not exceed the limit
          if (this.cardsOnGround.length < 7) {
            // Update gameboard
            this.facade.setReception(false);

            // Send choice to facade
            this.facade.chooseCard(card.uniqueId, card.nature);

            // Wait for gameboard update from server
            this.waitForGameBoardUpdate();
          } else {
            this.resetSelection();
            $('#serverMessageGameBoard').html('You can\'t have more then 7 cards on ground.');
            $('#gameboardMessagesModal').show();
          }

        } else {
          this.resetSelection();
          $('#serverMessageGameBoard').html('Not enough mana!');
          $('#gameboardMessagesModal').show();
        }

      }
    } else {
      this.resetSelection();
      $('#serverMessageGameBoard').html('It\'s not your turn yet!');
      $('#gameboardMessagesModal').show();
    }
  }

  /**
   * Reset all object selection in interface
   */
  resetSelection() {
    this.selectedServant = null;
    this.selectedOpponentServant = null;
    this.selectedOpponentHero = null;
    this.selectedHeroSpecial = false;
    this.selectedCardInHand = null;
  }

  /**
   * Logout
   */
  logout() {
    this.facade.stopGameBoardBackgroundMusic();
    this.facade.logout();
  }

  /**
   * Hide gameboard message modal
   */
  hideGameboardMessagesModal() {
    $('#gameboardMessagesModal').hide();
  }

  /**
   * Hide the card information modal
   */
  hideCardInformation() {
    $('#cardInformationModal').hide();
  }

  /**
   * Show gameboard messaged modal
   */
  showGameboardMessagesModal() {
    $('#gameboardMessagesModal').show();
  }

  /**
   * Check if there are any blocking effects before performing an attack on target card
   * @param target target card
   */
  checkPreActionEffects(target: Card): boolean {
    let effectName = '';
    if (target !== null) {
      if (target.effect !== null) {
        effectName = target.effect.name;
      }
    }
    return this.facade.performPreActionPlayerCardEffects(this.player.clientId, target, effectName);
  }

  /**
   * Replace all %20 by whitespaces in card names
   * @param cards list of cards
   */
  decodeAllURICardNames(cards: Card[]) {
    cards.forEach(card => {
      card.name = decodeURI(card.name);
      console.log(card.name);
    });
  }

  /**
   * Show help modal
   */
  showHelp() {
    $('#helpModal').show();
  }

  /**
   * Hide help modal
   */
  hideHelp() {
    $('#helpModal').hide();
  }

  /**
   * Show chat modal
   */
  showChatModal() {
    $('#chatModal').show();
    $('#unreadMessages').hide();
  }

  /**
   * Send quit game request to server
   */
  quitGame() {
    this.facade.stopGameBoardBackgroundMusic();
    this.facade.quitGame();
  }

  // Tooltips

  showCardTooltip(card: Card) {
    $('#cardInformationModalTitle').html(card.name);
    $('#cardInformationTooltip').html(card.clientTooltip);
    $('#cardInformationModal').show();
  }

  // Sounds and music

  playCardInfo(card: Card) {
    this.facade.playCardInfo(card.name);
  }

  playServantCardInfo() {
    this.facade.playServantCardInfo();
  }

  // Graphics

  targetedCardOnMouseEnterEffect(card: Card) {
    $('#enemy_' + this.removeSpacings(card.uniqueId)).addClass('targeted-card');
    $('#servant_swordClash_' + this.removeSpacings(card.uniqueId)).show();
  }

  targetedCardOnMouseLeaveEffect(card: Card) {
    $('#enemy_' + this.removeSpacings(card.uniqueId)).removeClass('targeted-card');
    $('#servant_swordClash_' + this.removeSpacings(card.uniqueId)).hide();
  }

  cardInHandOnMouseEnterEffect(card: Card) {
    $('#card_in_hand_' + this.removeSpacings(card.uniqueId)).addClass('selected-card-in-hand');
  }

  cardInHandOnMouseLeaveEffect(card: Card) {
    $('#card_in_hand_' + this.removeSpacings(card.uniqueId)).removeClass('selected-card-in-hand');
  }

  showHeroSwordClash() {
    $('#hero_swordClash').show();
  }

  hideHeroSwordClash() {
    $('#hero_swordClash').hide();
  }

  showHeroWound(heroUniqueId: string) {
    $('#hero_wound_' + this.removeSpacings(heroUniqueId)).show();
  }

  hideHeroWound(heroUniqueId: string) {
    $('#hero_wound_' + this.removeSpacings(heroUniqueId)).hide();
  }

  showServantWound(card: Card) {
    $('#servant_wound_' + this.removeSpacings(card.uniqueId)).show();
  }

  hideServantWound(card: Card) {
    $('#servant_wound_' + this.removeSpacings(card.uniqueId)).hide();
  }

  launchAttackAnimation() {
    console.log('Attack animation launched!');
    const that = this;
    const heroAttacked = this.facade.getHeroAttacked();
    const attackedServants = this.facade.getAttackedServants();
    console.log('Opponent hero : ' + heroAttacked + ' is attacked');

    if (heroAttacked) {
      console.log('Opponent hero is attacked!');
      that.showHeroWound(heroAttacked);
      that.facade.playDamageSound();
      setTimeout(function () {
        that.hideHeroWound(heroAttacked);
      }, 1000);
    }
    attackedServants.forEach(attackedServantUniqueId => {
      that.facade.playDamageSound();
      // $('#servant_wound_' + that.removeSpacings(attackedServantUniqueId)).show();
      console.log('#servant_wound_' + that.removeSpacings(attackedServantUniqueId));
      setTimeout(function () {
        // $('#servant_wound_' + that.removeSpacings(attackedServantUniqueId)).hide();
      }, 1000);
    });
  }


  // Utilities

  removeSpacings(str: string) {
    return str.replace(/\s/g, '');
  }

}


/**
 * Close modal if click detected is outside of modal
 */
window.onclick = function (event) {

  if (event.target === document.getElementById('cardInformationModal')) {
    $('#cardInformationModal').hide();
  }
  if (event.target === document.getElementById('gameboardMessagesModal')) {
    $('#gameboardMessagesModal').hide();
  }
  if (event.target === document.getElementById('helpModal')) {
    $('#helpModal').hide();
  }

};

