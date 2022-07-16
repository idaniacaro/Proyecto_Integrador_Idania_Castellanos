import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoheaderComponent } from './logoheader.component';

describe('LogoheaderComponent', () => {
  let component: LogoheaderComponent;
  let fixture: ComponentFixture<LogoheaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoheaderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoheaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
