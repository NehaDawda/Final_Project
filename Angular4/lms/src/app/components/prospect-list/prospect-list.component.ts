import { Component, OnInit } from '@angular/core';
import { ProspectService } from 'src/app/services/prospect.service';
import { Prospect } from 'src/app/models/prospect.model';

@Component({
  selector: 'app-prospect-list',
  templateUrl: './prospect-list.component.html',
  styleUrls: ['./prospect-list.component.css']
})
export class ProspectListComponent implements OnInit {
  prospectlist : any[];

  constructor(private _prospectlistservice : ProspectService) { }

  ngOnInit() {
   this.getProspectList(); 
  }

  getProspectList(){
    return this._prospectlistservice.getProspects().subscribe(prospectlist => {this.prospectlist = <Prospect[]> prospectlist})
  }

}
