import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../models/User";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private readonly articlesUrl: string;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      Authorization: 'my-auth-token'
    })
  };
  constructor(private http: HttpClient) {
    this.articlesUrl = 'http://localhost:8080/api/users/';
  }

  public getAllUsers():Observable<User[]>{
    return this.http.get<User[]>(this.articlesUrl + 'getAllUsers');
  }

  public findUserByID(id:number):Observable<User>{
    let params = new HttpParams()
      .set("id",String(id));
    return this.http.get<User>(this.articlesUrl + 'findUserByID',{params: params});
  }

  public saveUser(user:User):Observable<boolean>{
    return this.http.post<boolean>(this.articlesUrl + 'saveUser',user);
  }

  public deleteUser(user:User):Observable<boolean>{
    console.log(user);
    return this.http.post<boolean>(this.articlesUrl + 'deleteUser',user);
  }

  public validateUser(user:User): Observable<boolean>{
    let params = new HttpParams()
      .set("user",String(user));

    return this.http.get<boolean>(this.articlesUrl + 'validateUser',{params:params});
  }

}
