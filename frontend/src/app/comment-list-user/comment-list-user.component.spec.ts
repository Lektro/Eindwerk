import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentListUserComponent } from './comment-list-user.component';

describe('CommentListUserComponent', () => {
  let component: CommentListUserComponent;
  let fixture: ComponentFixture<CommentListUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentListUserComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CommentListUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
