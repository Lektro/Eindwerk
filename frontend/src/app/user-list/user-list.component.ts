import { Component, OnInit } from '@angular/core';
import {User} from "../models/User";
import {UserService} from "../services/user.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users:User[] = [];

  constructor(
    private userService:UserService
  ) { }

  ngOnInit(): void {
    this.refreshUsers();
  }

  refreshUsers(){
    this.userService.getAllUsers().toPromise().then(users=>{
      this.users = users;
      }
    )
  }

  deleteUser(user:User){
    this.userService.deleteUser(user).toPromise().then(result=>{
      console.log(result);
      this.refreshUsers();
    })
    // no need to reload component; only refresh users
    return false;
  }

}
