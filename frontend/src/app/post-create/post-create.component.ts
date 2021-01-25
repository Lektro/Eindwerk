import {Component, Input, OnInit} from '@angular/core';
import {User} from "../models/User";
import {PostService} from "../services/post.service";
import {Post} from "../models/Post";

@Component({
  selector: 'app-post-create',
  templateUrl: './post-create.component.html',
  styleUrls: ['./post-create.component.css']
})
export class PostCreateComponent implements OnInit {

  @Input() currentUser: User = new User();
  content: string = "";
  title: string = "";

  constructor(private postService: PostService) { }

  ngOnInit(): void {

  }

  public mockUser(){
    this.currentUser = new User();
    this.currentUser.id = 1;
  }

  public createPost() :boolean{
    this.mockUser();
    let post:Post = new Post(0,this.currentUser,this.title,this.content);

    this.postService.createPost(post).toPromise().then(post => {
      console.log(post);
    });

    // this.postService.createPost(this.currentUser.id,this.title,this.content).toPromise().then(successBool =>{
    //   return successBool;
    // });
    return true;
  }


}
