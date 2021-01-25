import {User} from "./user";

export class Post {
  id: number | undefined;
  postTitle: string | undefined;
  postContent: string | undefined;
  user: User | undefined;

}
