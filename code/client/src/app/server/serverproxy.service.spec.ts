import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { ServerProxyComponent } from './serverproxy.component';

describe('ServerProxyComponent', () => {

  let component: ServerProxyComponent;
  let fixture: ComponentFixture<ServerProxyComponent>;

  beforeEach(() => TestBed.configureTestingModule({}));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServerProxyComponent);
    component = fixture.componentInstance;
    expect(component).toBeTruthy();
    fixture.detectChanges();
  });
});
