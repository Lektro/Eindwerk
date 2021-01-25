import {User} from "./User";

export interface Post{
  id: number;
  user: User;
  postTitle: string;
  postContent: string;
}
