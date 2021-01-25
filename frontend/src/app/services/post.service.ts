import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Post} from "../models/Post";

@Injectable({
  providedIn: 'root'
})
export class PostService {

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

  public getAllPosts():Observable<Post[]>{
    return this.http.get<Post[]>(this.articlesUrl + 'getAllPosts');
  }

  public createPost(post:Post): Observable<Post>{
    return this.http.post<Post>(this.articlesUrl + 'addPost', post);
  }

  public deletePost(post:Post): Observable<boolean>{
    return this.http.post<boolean>(this.articlesUrl + 'deletePost', post);
  }
}
