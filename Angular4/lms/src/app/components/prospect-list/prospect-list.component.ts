import { Component, OnInit } from '@angular/core';
import { ProspectService } from 'src/app/services/prospect.service';
import { Prospect } from 'src/app/models/prospect.model';
import { JsondataService } from 'src/app/services/jsondata.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-prospect-list',
  templateUrl: './prospect-list.component.html',
  styleUrls: ['./prospect-list.component.css']
})
export class ProspectListComponent implements OnInit {
  prospectlist : Prospect[];
  prospectlistwithid : Prospect;
  constructor(private router: Router, private _prospectlistservice : ProspectService) { }
  

 //constructor(private _prospectlistservice : JsondataService) { }

  ngOnInit() {
    this._prospectlistservice.getProspects().subscribe(prospectList => {this.prospectlist =  prospectList});
  }

  getDetails(prospectId){
    this.router.navigate(['prospectdetails/'+prospectId]);
  }

getProspectListwithId(Id)
{
  return this._prospectlistservice.getProspectDetails(Id).subscribe(prospectlistwithid => {this.prospectlistwithid})
}
}
