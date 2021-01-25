import {User} from "./User";

export class Post{
  id: number| null;
  user: User | null;
  postTitle: string;
  postContent: string;


  constructor(id: number| null, user: User | null, postTitle: string, postContent: string) {
    this.id = id;
    this.user = user;
    this.postTitle = postTitle;
    this.postContent = postContent;
  }
}
