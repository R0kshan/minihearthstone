import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

// Component imports for routing definition
import { DashboardComponent } from './dashboard/dashboard.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { LobbyComponent } from './lobby/lobby.component';
import { GameboardComponent } from './gameboard/gameboard.component';

// Add routes to components
const routes: Routes = [
  { path: '', component: MainMenuComponent },
  { path: 'dashboard', component: DashboardComponent},
  { path: 'lobby', component: LobbyComponent},
  { path: 'gameboard', component: GameboardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
