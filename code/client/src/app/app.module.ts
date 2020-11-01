import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { FacadeImpl } from './webclientfacade/facade-impl.service';
import { ServerProxyComponent } from './server/serverproxy.component';
import { LobbyComponent } from './lobby/lobby.component';
import { GameboardComponent } from './gameboard/gameboard.component';
import { RouterModule } from '@angular/router';
import { AngularFontAwesomeModule } from 'angular-font-awesome';


@NgModule({
  declarations: [
    AppComponent,
    MainMenuComponent,
    DashboardComponent,
    LoginComponent,
    LobbyComponent,
    GameboardComponent,
    ServerProxyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot([]),
  ],
  providers: [FacadeImpl, ServerProxyComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
