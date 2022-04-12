/* tslint:disable:no-unused-variable */
import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { ComponentComponent } from './component.component';

describe('ComponentComponent', () => {
  let component: ComponentComponent;
  let fixture: ComponentFixture<ComponentComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ ComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

// describe('Teste do Component', () => {
//   it('Validar valor enviado', () => {
//     expect(20).toBe(20)
//   })

//   it('Validando boolean', () => {
//     expect(true).toBe(true)
//   })

//   it('Validando string', () => {
//     expect('true').toBe('true')
//   })
// })
