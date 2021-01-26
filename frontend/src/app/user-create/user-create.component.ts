import { Component, OnInit } from '@angular/core';
import {UserService} from "../services/user.service";
import {User} from "../models/User";

@Component({
  selector: 'app-user-create',
  templateUrl: './user-create.component.html',
  styleUrls: ['./user-create.component.css']
})
export class UserCreateComponent implements OnInit {

  username:string = "";
  password:string = "";

  constructor(
    private userService: UserService
  ) { }

  ngOnInit(): void {
  }

  public createUser(){
    let user:User = new User();
    user.username = this.username
    user.password = this.password
    this.userService.saveUser(user).toPromise().then(result =>{
      console.log(result);
    })

    //return true for refresh or false for no refresh
    return true;
  }

}
