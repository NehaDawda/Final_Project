import { Component, OnInit } from '@angular/core';
import { Prospect } from 'src/app/models/prospect.model';
import { ProspectService } from 'src/app/services/prospect.service';
import { JsondataService } from 'src/app/services/jsondata.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-prospect-details',
  templateUrl: './prospect-details.component.html',
  styleUrls: ['./prospect-details.component.css']
})
export class ProspectDetailsComponent implements OnInit {
  ProspectDetails : Prospect;
  prospectId : String;

  constructor(private _prospectDetailsService : ProspectService, private activatedRoute: ActivatedRoute) { }
  

 

  ngOnInit() {
    this.prospectId = this.activatedRoute.snapshot.paramMap.get("prospectId")
  }

  getProspectDetails(prospectId){
    return this._prospectDetailsService.getProspectDetails(prospectId).subscribe(prospectDetails => {this.ProspectDetails })
  }

}
