import {User} from "./User";

export class Post{
  id: number;
  user: User;
  postTitle: string;
  postContent: string;


  constructor(id: number, user: User, postTitle: string, postContent: string) {
    this.id = id;
    this.user = user;
    this.postTitle = postTitle;
    this.postContent = postContent;
  }
}
