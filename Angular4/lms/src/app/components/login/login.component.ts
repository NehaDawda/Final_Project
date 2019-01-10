import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { ProspectService } from 'src/app/services/prospect.service';
import { SharedDataService } from 'src/app/services/shared-data.service';
import { BankEmployee } from 'src/app/models/bank-employee.model';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  constructor(private router: Router,private _prospectlistservice: ProspectService,private sharedDataService:SharedDataService) { }

  ngOnInit() {
  }

  onLogin(loginForm:NgForm){
    var empId:String;
    var pwd:String;

    empId=loginForm.value.userName;
    pwd=loginForm.value.passWord;

    this._prospectlistservice.validateLogin(empId,pwd).subscribe((user)=>{
      var emp:BankEmployee;
      emp=<BankEmployee>user;

      this.sharedDataService.loggedInUser=emp;
      console.log(user);
      this.router.navigate(['/logout']);
    })
  }
}
