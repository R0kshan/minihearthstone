import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FacadeImpl } from '../webclientfacade/facade-impl.service';

@Component({
  selector: 'app-main-menu',
  templateUrl: './main-menu.component.html',
  styleUrls: ['./main-menu.component.css']
})

/**
 * Main menu component
 */
export class MainMenuComponent implements OnInit {


  /**
   * Default constructor
   */
  constructor(private facade: FacadeImpl, private activRoute: ActivatedRoute) { }

  /**
   * Component's lifecycle hook
   */
  ngOnInit() {
    this.activRoute
      .queryParams
      .subscribe(params => {
        // Defaults to 0 if no query param provided.

        if (params['reconnect'] === 'true') {
          this.facade.reconnect();
        }
      });
  }

}
