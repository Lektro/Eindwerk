import {User} from "./User";
import {Post} from "./Post";

export class Comment{
  public id:number;
  public parent:Post;
  public user:User;
  public content:string;


  constructor(id: number, parent: Post, user: User, content: string) {
    this.id = id;
    this.parent = parent;
    this.user = user;
    this.content = content;
  }
}
