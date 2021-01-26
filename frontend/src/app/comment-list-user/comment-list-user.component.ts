import {Component, Input, OnInit} from '@angular/core';
import {User} from "../models/User";
import {CommentService} from "../services/comment.service";
import {Comment} from "../models/Comment"
import {UserService} from "../services/user.service";

@Component({
  selector: 'app-comment-list-user',
  templateUrl: './comment-list-user.component.html',
  styleUrls: ['./comment-list-user.component.css']
})
export class CommentListUserComponent implements OnInit {

  @Input() id: number = 1; //user id
  user:User = new User();
  comments:Comment[] = [];


  constructor(
    public commentService:CommentService,
    public userService:UserService
  ) { }

  ngOnInit(): void {
    this.refreshUser();
    this.refreshComments();
  }

  public refreshUser(){
    this.userService.findUserByID(this.id).toPromise().then(user=>{
      this.user = user;
      this.refreshComments();
    })
  }

  public refreshComments(){
    this.commentService.findCommentsByUser(this.user).toPromise().then(comments =>{
      this.comments = comments;
    })
  }

}
