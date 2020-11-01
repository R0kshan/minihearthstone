import { Injectable } from '@angular/core';
import { ServerProxyComponent } from '../server/serverproxy.component';
import { Player } from '../player/player';
import { Router } from '@angular/router';
import { Facade } from './facade';
import * as FacadeProperties from '../webclientfacade/facade-properties';
import { Hero } from '../hero/hero';
import { setOpponentHero, getHeroes, getReceivedMessage, gameBoardBgMusic, getHero } from './facade-properties';
import { GameBoard } from '../gameboard/gameboard';
import { Card } from '../card/card';
import { Message } from '../message/message';

/**
 * FacadeImpl service class, allows all other components to use its methods to access serverproxy methods
 */
@Injectable()
export class FacadeImpl implements Facade {

  /**
   * Server proxy component
   */
  server: ServerProxyComponent;

  /**
   * Router object to swtich between component views without needing to reload the page
   */
  router: Router;

  /**
   * Player object needed to contain the player's id
   */
  player: Player;

  /**
   * FacadeImpl constructor
   * @param server instance of ServerProxyComponent
   */
  constructor(server: ServerProxyComponent, router: Router) {
    this.server = server;
    this.router = router;
  }

  isConnectionEstablished() {
    this.server.isConnectionEstablished();
  }

  checkConnection() {
    this.server.checkConnection();
  }

  // PROPERTIES GETTERS AND SETTERS
  setPlayer(newPlayer: Player) {
    FacadeProperties.setPlayer(newPlayer);
  }

  getGameBoard(): GameBoard {
    return FacadeProperties.getGameBoard();
  }

  getReception(): boolean {
    return FacadeProperties.reception;
  }

  getHeroes(): Hero[] {
    return FacadeProperties.getHeroes();
  }

  getPlayer(): Player {
    return FacadeProperties.player;
  }

  getPlayerById(playerId: number): Player {
    return FacadeProperties.getPlayer(playerId);
  }

  getPlayerOpponent(): Player {
    return FacadeProperties.playerOpponent;
  }

  setOpponentHero(newHero: Hero) {
    FacadeProperties.setOpponentHero(newHero);
  }

  setHero(newHero: Hero) {
    FacadeProperties.setHero(newHero);
  }

  setHeroes(newHeroes: Hero[]) {
    FacadeProperties.setHeroes(newHeroes);
  }

  getHero(playerId: number): Hero {
    return FacadeProperties.getHero(playerId);
  }

  setPlayerOpponent(newPlayerOpponent: Player) {
    FacadeProperties.setPlayerOpponent(newPlayerOpponent);
  }

  setGameId(newGameId: String) {
    FacadeProperties.setGameId(newGameId);
  }

  setReception(newReception: boolean) {
    FacadeProperties.setReception(newReception);
  }

  setGameBoard(newGameBoard: GameBoard) {
    FacadeProperties.setGameBoard(newGameBoard);
  }

  getHandOfCards(playerId: number): Card[] {
    return FacadeProperties.getHandOfCards(playerId);
  }

  getCardsOnGround(playerId: number): Card[] {
    return FacadeProperties.getCardsOnGround(playerId);
  }

  getOpponentCardsOnGround(playerId: number): Card[] {
    return FacadeProperties.getOpponentCardsOnGround(playerId);
  }

  getTurn(): number {
    return FacadeProperties.getTurn();
  }

  getOpponentHero(playerId: number): Hero {
    return FacadeProperties.getOpponentHero(playerId);
  }

  performPreActionPlayerCardEffects(playerId: number, targetCard: Card, targetCardEffectName: string): boolean {
    return FacadeProperties.performPreActionPlayerCardEffects(playerId, targetCard, targetCardEffectName);
  }

  getWinner(): number {
    return FacadeProperties.getWinner();
  }

  getState(): String {
    return FacadeProperties.getState();
  }

  setState(state: String) {
    FacadeProperties.setState(state);
  }

  getHeroAttacked(): string {
    return FacadeProperties.getHeroAttacked();
  }

  getAttackedServants(): string[] {
    return FacadeProperties.getAttackedServants();
  }

  // METHODS TO COMMUNICATE WITH SERVER

  login(playername) {
    this.server.login(playername);
  }

  logout() {
    this.server.logout();
  }

  reconnect() {
    this.server.disconnect();
    this.server.reconnect();
  }

  findRandomMatch() {
    this.server.findRandomMatch();
  }

  rejectMatch() {
    // this.server.rejectMatch();
    this.server.cancelMatch();
  }

  getPlayerFromServer() {
    this.server.getPlayer();
  }

  getAllPlayers() {
    this.server.getAllPlayers();
  }

  getAllHeroes() {
    this.server.getAllHeroes();
  }

  getFirstHandOfCards() {
    this.server.getFirstHandOfCards();
  }

  chooseHero(heroId: number) {
    this.server.chooseHero(heroId);
  }

  chooseCard(cardUniqueId: string, cardNature: string) {

    // Play sound according to the nature of the card
    if (cardNature === 'servant') {
      FacadeProperties.playChooseServantCardSound();
    } else if (cardNature === 'spell') {
      FacadeProperties.playChooseSpellCardSound();
    }
    // Send the card choice to the server
    this.server.chooseCard(cardUniqueId);
  }

  endMyTurn() {
    this.server.endMyTurn();
  }

  applyCardOnTargetServant(myCardUniqueId: string, opponentCardUniqueId: string) {
    this.server.applyCardOnTargetServant(myCardUniqueId, opponentCardUniqueId);
  }

  applyCardOnTargetHero(myCardUniqueId: string) {
    this.server.applyCardOnTargetHero(myCardUniqueId);
  }

  applyHeroSpecialOnServant(opponentServantUniqueId: string) {
    this.server.applyHeroSpecialOnServant(opponentServantUniqueId);
  }

  applyHeroSpecialOnHero() {
    this.server.applyHeroSpecialOnHero();
  }

  applySpellCardOnServant(myTargetSpellCardUniqueId: string, opponentCardUniqueId: string) {
    this.server.applySpellCardOnServant(myTargetSpellCardUniqueId, opponentCardUniqueId);
    FacadeProperties.playChooseSpellCardSound();
  }

  applySpellCardOnFriendlyServant(myTargetSpellCardUniqueId: string, opponentCardUniqueId: string) {
    this.server.applySpellCardOnFriendlyServant(myTargetSpellCardUniqueId, opponentCardUniqueId);
    FacadeProperties.playChooseSpellCardSound();
  }

  applySpellCardOnHero(myTargetSpellCardUniqueId: string) {
    this.server.applySpellCardOnHero(myTargetSpellCardUniqueId);
  }

  useHeroSpecial() {
    this.server.useHeroSpecial();
  }

  // Send messages
  sendMessage(message: string) {
    this.server.sendMessage(message);
  }

  gotMessageReception(): boolean {
    return FacadeProperties.getMsgReception();
  }

  setMessageReception(bool: boolean) {
    FacadeProperties.setMsgReception(bool);
  }

  getReceivedMessage(): Message {
    return FacadeProperties.getReceivedMessage();
  }

  quitGame() {
    this.server.quitGame();
  }

  // SOUND METHODS
  playChooseServantCardSound() {
    FacadeProperties.playChooseServantCardSound();
  }

  playChooseSpellCardSound() {
    FacadeProperties.playChooseSpellCardSound();
  }

  playVictorySound() {
    FacadeProperties.playVictorySound();
  }

  playDefeatSound() {
    FacadeProperties.playDefeatSound();
  }

  playModalAppearSound() {
    FacadeProperties.playModalAppearSound();
  }

  playHoverOrSelectSound() {
    FacadeProperties.playHoverOrSelectSound();
  }

  playCardInfo(cardName: string) {
    FacadeProperties.playCardInfo(cardName);
  }

  playServantCardInfo() {
    FacadeProperties.playServantCardInfo();
  }

  playGameBoardBackgroundMusic() {
    FacadeProperties.playGameBoardBackgroundMusic();
  }

  stopGameBoardBackgroundMusic() {
    FacadeProperties.stopGameBoardBackgroundMusic();
  }

  playDamageSound() {
    FacadeProperties.playDamageSound();
  }

  playNewMessageSound() {
    FacadeProperties.playNewMessageSound();
  }

}
