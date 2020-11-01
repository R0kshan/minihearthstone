import { Component, OnInit } from '@angular/core';
import { FacadeImpl } from '../webclientfacade/facade-impl.service';
import { Hero } from '../hero/hero';
import { Player } from '../player/player';
import * as $ from 'jquery';


@Component({
  selector: 'app-lobby',
  templateUrl: './lobby.component.html',
  styleUrls: ['./lobby.component.css']
})
/**
 * Lobby component
 */
export class LobbyComponent implements OnInit {

  /**
   * List of heroes
   */
  heroes: Hero[];

  /**
   * Player
   */
  player: Player;

  /**
   * Constructor
   * @param facade web client facade
   */
  constructor(private facade: FacadeImpl) {

  }

  /**
   * Lifecycle hook of the component
   */
  ngOnInit() {
    this.player = this.facade.getPlayer();

    if (this.player == null) {
      window.location.href = '/';
    }

    this.heroes = this.facade.getHeroes();

    this.facade.checkConnection();
  }

  /**
   * Set hero choice
   * @param hero chosen hero
   */
  chooseHero(hero: Hero) {
    console.log('Hero id : ' + hero.id);
    this.facade.setHero(hero);
    this.facade.chooseHero(hero.id);
  }

  /**
   * Send logout to server
   */
  logout() {
    this.facade.logout();
  }

  /**
   * Hide the notification modal
   */
  hideGameStartNotificationModal() {
    $('#gameStartNotificationModal').hide();
  }

  heroHoverSound() {
    this.facade.playHoverOrSelectSound();
  }
}
