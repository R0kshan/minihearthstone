import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

/**
 * Server interface
 */
export interface Server {
  serverURL: string;

  /**
   * Connect web socket to server
   * @param router router (used to switch between components)
   */
  connect(router: Router);

  /**
   * Login with username to server (user will be saved in JPAPersistence until disconnection)
   * @param playername Player name entered in login interface
   */
  login(playername);

  /**
   * Send player logout to server
   */
  logout();

  /**
   * Get player object from serveur using playerId
   */
  getPlayer();

  /**
   * Get all players from server
   */
  getAllPlayers();

  /**
   * Get the list of all heroes from server
   */
  getAllHeroes();

  /**
   * Send hero choice to server
   * @param heroId id of selected hero
   */
  chooseHero(heroId: number);

  /**
   * Get the hero of opponent player from server
   * @param opponentId id of opponent player
   */
  getOpponentHero(opponentId: number);

  /**
  * Get game initializatio from server
  */
  initGame();

  /**
   * Get the card deck of my hero from server
   */
  getFirstHandOfCards();

  /**
   * Send card choice to server
   * @param cardUniqueId  unique id of chosen card
   */
  chooseCard(cardUniqueId: string);

  /**
   * Send request to server to apply my card's effect on target
   * @param myCard my card unique id
   * @param opponentCard opponent card unique id
   */
  applyCardOnTargetServant(myCardUniqueId: string, opponentCardUniqueId: string);


  /**
   * Send request to server to apply my spell card on servant
   * @param myTargetSpellCardUniqueId  my spell card's unique id
   * @param opponentCardUniqueId  my opponent's card unique id
   */
  applySpellCardOnServant(myTargetSpellCardUniqueId: string, opponentCardUniqueId: string);

  /**
   * Send request to server to attack target hero
   * @param myCardUniqueId my servant card unique id
   */
  applyCardOnTargetHero(myCardUniqueId: string);

  /**
   * Send resquest to server to apply my spell card on opponent hero
   * @param myTargetSpellCardUniqueId my spell card's unique id
   */
  applySpellCardOnHero(myTargetSpellCardUniqueId: string);

  /**
   * Send request to apply hero special on servant
   * @param opponentServantUniqueId opponent servant card unique id
   */
  applyHeroSpecialOnServant(opponentServantUniqueId: string);


  /**
   * Send request to apply my hero special on opponent's hero
   */
  applyHeroSpecialOnHero();

  /**
   * Send request to apply my hero special skill on self
   */
  useHeroSpecial();

  /**
   * Send request to server to get updated gameboard
   */
  updateGameBoard();

  /**
   * Send request to server to end my turn
   */
  endMyTurn();

  /**
   * Disconnect web socket connexion
   */
  disconnect();

  /**
    * Find a random matcv
    */
  findRandomMatch();

  /**
   * Send updated random match to opponent for them to get the opponent player object
   * @param opponentId opponent player's id
   * @param matchId match id
   */
  sendRandomMatchToOpponent(opponentId: string, matchId: string);

  /**
   * Get opponent player object by their client id
   * @param opponentId client id
   */
  getOpponentPlayerById(opponentId: string);

  /**
   * Cancel a searching for a random match : deletes the associated match stored in JPA
   */
  cancelMatch();

  /**
   * Send match cancellation to the other player
   */
  sendCancelMatch();

  /**
   * Send a text message to the other player
   * @param message message content
   */
  sendMessage(message: string);

  /**
   * Send request to quit game
   */
  quitGame();

  /**
   * Send notification to other player that this player has quit the game
   */
  notifyQuitGame();

}

