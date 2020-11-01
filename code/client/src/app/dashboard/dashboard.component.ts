import { Component, OnInit } from '@angular/core';
import { FacadeImpl } from '../webclientfacade/facade-impl.service';
import { Player } from '../player/player';
import * as $ from 'jquery';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
/**
 * Dashboard component
 */
export class DashboardComponent implements OnInit {

  /**
   * Player
   */
  player: Player;

  /**
   * Constructor of DashboardComponent
   * @param facade use FacadeImpl
   */
  constructor(private facade: FacadeImpl) {
  }

  /**
   * Instructions to execute on component intialization
   */
  ngOnInit() {
    this.player = this.facade.getPlayer();

    if (this.player == null) {
      window.location.href = '/';
    }

    // Modal initialisation
    $('#modalTitle').html('Matchmaking proposal');

    this.facade.checkConnection();
  }

  /**
   * Find a random match from server
   */
  findRandomMatch() {
    this.facade.findRandomMatch();
    this.displayMatchProposalModal();
  }

  /**
   * Reject match proposed by the server
   */
  rejectMatch() {
    this.facade.rejectMatch();
    this.hideMatchProposalModal();
  }

  /**
   * Logout -> remove player from JPA Persistance and disconnect web socket
   */
  logout() {
    this.facade.logout();
  }

  /**
   * Get player info using facade
   */
  getPlayer() {
    this.facade.getPlayer();
  }

  /**
   * Get all players from JPA Persistance
   */
  getAllPlayers() {
    this.facade.getAllPlayers();
  }

  /**
   * Get all Cards from JPA
   */
  getFirstHandOfCards() {
    this.facade.getFirstHandOfCards();
  }

  // Interface interaction functions

  /**
   * Opens match proposal modal
   */
  displayMatchProposalModal() {
    $('#serverMessage').html('<p>Looking for a match ... </p>');
    $('#rejectMatchBtn').hide();
    $('#matchProposalModal').show();
    this.facade.playModalAppearSound();
  }

  /**
   * Hides match proposal modal
   */
  hideMatchProposalModal() {
    $('#matchProposalModal').hide();
  }
}

/**
 * Close modal if click detected is outside of modal
 */
window.onclick = function (event) {
  if (event.target === document.getElementById('matchProposalModal')) {
    $('#matchProposalModal').hide();
  }
};



