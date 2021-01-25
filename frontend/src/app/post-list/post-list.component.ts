import {Component, OnInit} from '@angular/core';
import {Post} from "../models/Post";
import {PostService} from "../services/post.service";

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent implements OnInit {

  public id!: number;
  posts: Post[] = [];

  constructor(private postService: PostService) {
  }

  ngOnInit() {
    this.postService.getAllPosts().toPromise().then((postData) => {
      this.posts = postData
    });
  }


  delete(id: number) {
    this.postService.delete(id).toPromise().then(() => {
      return this.ngOnInit();
    });
  }
}
