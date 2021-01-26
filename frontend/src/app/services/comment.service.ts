import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../models/User";
import {Comment} from "../models/Comment"

@Injectable({
  providedIn: 'root'
})
export class CommentService {

  private readonly articlesUrl: string;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      Authorization: 'my-auth-token'
    })
  };

  constructor(private http: HttpClient) {
    this.articlesUrl = 'http://localhost:8080/api/posts/';
  }

  public findCommentsByUser(user:User):Observable<Comment[]>{
    let params = new HttpParams()
      .set("user",String(user));
    return this.http.get<Comment[]>(this.articlesUrl + 'findCommentsByUser',{params:params});
  }

  public findCommentsByParent(parent:Object):Observable<Comment[]>{
    let params = new HttpParams()
      .set("parent",String(parent));
    return this.http.get<Comment[]>(this.articlesUrl + 'findCommentsByParent',{params:params});

  }

}
