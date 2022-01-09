import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MycheckComponent } from './mycheck.component';

describe('MycheckComponent', () => {
  let component: MycheckComponent;
  let fixture: ComponentFixture<MycheckComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MycheckComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MycheckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
