import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginComponent } from './login.component';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    expect(component).toBeTruthy();
    fixture.detectChanges();
  });

  /*it('should call login function', async(() => {
    spyOn(component, 'login');
    fixture.detectChanges();
    let button = fixture.debugElement.queryAll(By.css('button')).nativeElement;
    button.click();
    fixture.detectChanges();
    expect(component.login).toHaveBeenCalled();
 }));*/

});
