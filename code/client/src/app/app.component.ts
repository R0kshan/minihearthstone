import { Component, OnInit, HostListener } from '@angular/core';

import * as $ from 'jquery';
import { Message } from './message/message';
import { FacadeImpl } from './webclientfacade/facade-impl.service';
import { Facade } from './webclientfacade/facade';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  /**
   * Title to be displayed
   */
  title = 'MiniHearthStone';

  /**
   * List of messages from both players
   */
  messages: Message[] = [];

  /**
   * Component constructor
   * @param facade web client facade
   */
  constructor(private facade: FacadeImpl) { }

  @HostListener('window:beforeunload', ['$event']) unloadHandler(event: Event) {
    console.log('Processing beforeunload...');
    // Do more processing...
    event.returnValue = false;
    this.facade.logout();
  }

  /**
   * Operations to do on component intilization
   */
  ngOnInit() {
    this.facade.isConnectionEstablished();
    this.waitForOtherPlayerMessages();
  }

  /**
   * Show general notification modal
   * @param message message to be displayed in modal
   */
  showGeneralNotificationModal(message: string) {
    $('#serverNotificationMessage').html(message);
    $('#generalNotificationModal').show();
  }

  /**
   * Hide the general notification modal
   */
  hideGeneralNotificationModal() {
    $('#generalNotificationModal').hide();
  }

  /**
   * Show the chat modal
   */
  showChatModal() {
    $('#chatModal').show();
    $('#unreadMessages').hide();
  }

  /**
   * Hide the chat modal
   */
  hideChatModal() {
    $('#chatModal').hide();
  }

  /**
   * Send a message to the other player
   */
  sendMessage() {
    const message = $('#message').val() as string;
    if (message !== '') {
      console.log('Sending message to other player : ' + message);
      this.messages.push(new Message(this.facade.getPlayer().name, message, ''));
      this.facade.sendMessage(message);
      $('#message').val('');
    }
  }

  /**
   * Check whether other player has sent a message
   */
  waitForOtherPlayerMessages() {
    const that = this;
    setTimeout(function () {
      if (that.facade.gotMessageReception() === true) {
        const message: Message = that.facade.getReceivedMessage();
        that.messages.push(message);
        console.log('Received message from other player : ' + message);
        that.facade.setMessageReception(false);
        that.facade.playNewMessageSound();
      } else {
        // console.log('Waiting for other player message');
        that.waitForOtherPlayerMessages();
      }
    }, 800);
  }
}
