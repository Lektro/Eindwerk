import {Component, Input, OnInit} from '@angular/core';
import {User} from "../models/User";
import {PostService} from "../services/post.service";
import {Post} from "../models/Post";
import {UserService} from "../services/user.service";

@Component({
  selector: 'app-post-create',
  templateUrl: './post-create.component.html',
  styleUrls: ['./post-create.component.css']
})
export class PostCreateComponent implements OnInit {

  @Input() id: number = 1; //user id
  currentUser: User = new User();
  content: string = "";
  title: string = "";

  constructor(
    private postService: PostService,
    private userService: UserService
  ) { }

  ngOnInit(): void {
    this.userService.findUserByID(this.id).toPromise().then(user =>{
      this.currentUser = user;
    });
  }

  public createPost() :boolean{
    let post:Post = new Post(null,this.currentUser,this.title,this.content);

    this.postService.createPost(post).toPromise().then(post => {
      console.log(post);
    });

    return true;
  }


}
