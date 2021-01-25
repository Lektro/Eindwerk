import { Component, OnInit } from '@angular/core';
import {Post} from "../models/Post";
import {ActivatedRoute, Router} from "@angular/router";
import {PostService} from "../services/post.service";

@Component({
  selector: 'app-create-post',
  templateUrl: './create-post.component.html',
  styleUrls: ['./create-post.component.css']
})
export class CreatePostComponent implements OnInit {
  post: Post

  constructor(private postService: PostService,
              private router: Router,
              ) {
    this.post = new Post();
  }

  ngOnInit(): void {
  }

  onSubmit() {
    this.postService.save(this.post).subscribe(result => this.gotoPostList());
  }
  gotoPostList() {
    this.router.navigate(['/posts']);
  }
}
