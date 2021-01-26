import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Post} from "../models/Post";

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private readonly postUrl: string;

  constructor(private http: HttpClient) {
    this.postUrl = 'http://localhost:8080/api/posts';
  }

  public getAllPosts():Observable<Post[]>{
    return this.http.get<Post[]>(this.postUrl);
  }

  delete(id: number): Observable<Post> {
    return this.http.delete<Post>(`${this.postUrl}/${id}`);
  }

  save(post: Post) {
    return this.http.post<Post>(this.postUrl, post);
  }

}
