import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PostListComponent} from "./post-list/post-list.component";
import {CreatePostComponent} from "./create-post/create-post.component";

const routes: Routes = [

  { path: 'listPosts', component: PostListComponent },
  { path: 'deletePost', component: PostListComponent },
  { path: 'createPost', component: CreatePostComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
