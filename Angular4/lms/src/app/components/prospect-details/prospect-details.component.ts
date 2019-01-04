import { Component, OnInit } from '@angular/core';
import { Prospect } from 'src/app/models/prospect.model';
import { ProspectService } from 'src/app/services/prospect.service';

@Component({
  selector: 'app-prospect-details',
  templateUrl: './prospect-details.component.html',
  styleUrls: ['./prospect-details.component.css']
})
export class ProspectDetailsComponent implements OnInit {
  ProspectDetails : Prospect;

  constructor(private _prospectDetailsService : ProspectService) { }

  ngOnInit() {
    
  }

  getProspectDetails(prospectId){
    return this._prospectDetailsService.getProspectDetails(prospectId).subscribe(prospectDetails => {this.ProspectDetails })
  }

}
