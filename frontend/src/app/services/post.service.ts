import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {Post} from "../models/Post";
import {applySourceSpanToExpressionIfNeeded} from "@angular/compiler/src/output/output_ast";

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
    console.log(post);
    return this.http.post<Post>(this.articlesUrl + 'addPost', post);

    // let params = new HttpParams()
    //   .set("post",String(post));
    //
    // return this.http.get<Post>(this.articlesUrl + 'addPost',{params:params})

  }

}
