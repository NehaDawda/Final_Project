import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApproveloansComponent } from './approveloans.component';

describe('ApproveloansComponent', () => {
  let component: ApproveloansComponent;
  let fixture: ComponentFixture<ApproveloansComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApproveloansComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApproveloansComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
