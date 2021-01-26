import { Component, OnInit } from '@angular/core';
import {UserService} from "../services/user.service";
import {User} from "../models/User";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  isValidated:boolean = false
  validatedUser:string = "";

  constructor(
    private userService: UserService
  ) { }

  ngOnInit(): void {
  }

  validateUser(username:string, password:string): boolean{
    let user:User = new User();
    user.username = username;
    user.password = password;
    this.userService.validateUser(user).toPromise().then(result=>{
      if(result){
        this.isValidated = true;
        this.validatedUser = username;
      }
      else{
        this.isValidated = false;
        this.validatedUser = "";
      }
    });

    return false;
  }

}
