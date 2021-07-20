import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LifecyclechieldComponent } from './lifecyclechield.component';

describe('LifecyclechieldComponent', () => {
  let component: LifecyclechieldComponent;
  let fixture: ComponentFixture<LifecyclechieldComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LifecyclechieldComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LifecyclechieldComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
