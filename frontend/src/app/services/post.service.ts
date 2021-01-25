import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Post} from "../models/Post";

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private readonly articlesUrl: string;



  constructor(private http: HttpClient) {
    this.articlesUrl = 'http://localhost:8080/api/posts';
  }

  public getAllPosts():Observable<Post[]>{
    return this.http.get<Post[]>(this.articlesUrl);
  }
}
