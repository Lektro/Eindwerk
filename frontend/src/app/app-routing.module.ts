import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PostListComponent} from "./post-list/post-list.component";

const routes: Routes = [

  { path: 'listPosts', component: PostListComponent },
  { path: 'deletePost', component: PostListComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
