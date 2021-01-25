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
    this.postService.getAllPosts().toPromise().then(posts =>{
      this.posts = posts;
    })
  }

}
