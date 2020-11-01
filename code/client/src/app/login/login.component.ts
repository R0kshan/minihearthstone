import { Component, OnInit } from '@angular/core';
import { FacadeImpl } from '../webclientfacade/facade-impl.service';
import * as $ from 'jquery';
import '../../../node_modules/font-awesome/css/font-awesome.css';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
/**
 * Login component
 */
export class LoginComponent implements OnInit {

  /**
   * Boolean indicate whether username has been taken or not
   */
  showmessage = true;

  /**
   * LoginComponent constructor
   * @param facade web client facade
   */
  constructor(private facade: FacadeImpl) { }

  /**
   * Lifecycle hook
   */
  ngOnInit() {
    this.facade.isConnectionEstablished();
  }

  /**
   * Login with username
   * @param playername Player name entered in login interface
   */
  login() {
    // this.showmessage = this.facade.login(playername);
    const playername = $('#playername').val();
    this.facade.login(playername);
  }

}
