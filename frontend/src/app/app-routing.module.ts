import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PostListComponent} from "./post-list/post-list.component";
import {PostCreateComponent} from "./post-create/post-create.component";
import {UserListComponent} from "./user-list/user-list.component";
import {UserCreateComponent} from "./user-create/user-create.component";
import {CommentListUserComponent} from "./comment-list-user/comment-list-user.component";

const routes: Routes = [

  { path: 'listPosts', component: PostListComponent },
  { path: 'createPost/:id', component: PostCreateComponent },
  { path: 'listUsers', component:UserListComponent },
  { path: 'createUser', component:UserCreateComponent},
  { path: 'listComments/:id', component: CommentListUserComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
