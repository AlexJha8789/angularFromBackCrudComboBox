import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarColorComponent } from './listar-color.component';

describe('ListarColorComponent', () => {
  let component: ListarColorComponent;
  let fixture: ComponentFixture<ListarColorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarColorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarColorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
