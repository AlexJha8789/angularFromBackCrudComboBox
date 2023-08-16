import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarMotorComponent } from './listar-motor.component';

describe('ListarMotorComponent', () => {
  let component: ListarMotorComponent;
  let fixture: ComponentFixture<ListarMotorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarMotorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarMotorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
