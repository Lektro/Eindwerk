import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Post} from "../model/post";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PostService {
  posts: Post[] = [];
  private readonly postUrl = 'http://localhost:8080/api/posts';

  constructor(private http: HttpClient) {

  }

  public findAll(): Observable<Post[]> {
    return this.http.get<Post[]>(this.postUrl);
  }
}
