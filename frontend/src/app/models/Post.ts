import {User} from "./User";

export class Post {
  id: number | undefined;
  user: User | undefined;
  postTitle: string| undefined;
  postContent: string | undefined;
}
