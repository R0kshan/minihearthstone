import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GameboardComponent } from './gameboard.component';

describe('GameboardComponent', () => {
  let component: GameboardComponent;
  let fixture: ComponentFixture<GameboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GameboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GameboardComponent);
    component = fixture.componentInstance;
    expect(component).toBeTruthy();
    fixture.detectChanges();
  });

});
