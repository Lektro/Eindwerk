import {Component, Input, OnInit} from '@angular/core';
import {User} from "../models/User";
import {PostService} from "../services/post.service";

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

  public createPost() :boolean{
    this.postService.createPost(this.currentUser.id,this.title,this.content).toPromise().then(successBool =>{
      return successBool;
    });
    return true;
  }


}
