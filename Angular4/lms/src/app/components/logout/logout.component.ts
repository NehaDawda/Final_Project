import { Component, OnInit } from '@angular/core';
import { SharedDataService } from 'src/app/services/shared-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private sharedDataService:SharedDataService,private router: Router) { }

  ngOnInit() {
  }

  logout(){
    this.sharedDataService.loggedInUser=null;
    this.router.navigate(['/login']);
  }
}
