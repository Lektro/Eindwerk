import { Component, OnInit } from '@angular/core';
import {Post} from "../models/Post";
import {PostService} from "../services/post.service";

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent implements OnInit {

  posts:Post[] = [];

  constructor(
    private postService: PostService
  ) { }

  ngOnInit(): void {
      this.refreshPosts();
  }

  public refreshPosts(){
    this.postService.getAllPosts().toPromise().then(posts =>{
      this.posts = posts;
    })
  }

  public deletePost(post:Post){
    this.postService.deletePost(post).toPromise().then(result=>{
      console.log(result)
      this.refreshPosts();
    })
    // no need to reload component; only refresh users
    return false;
  }
}
