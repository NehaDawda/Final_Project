import { Component, OnInit } from '@angular/core';
import { ProspectService } from 'src/app/services/prospect.service';
import { SharedDataService } from 'src/app/services/shared-data.service';
import { Prospect } from 'src/app/models/prospect.model';

@Component({
  selector: 'app-approveloans',
  templateUrl: './approveloans.component.html',
  styleUrls: ['./approveloans.component.css']
})
export class ApproveloansComponent implements OnInit {
  prospectlist: Prospect[];

  constructor(private _prospectlistservice: ProspectService,
    private sharedDataService:SharedDataService) { }

  ngOnInit() {
    this._prospectlistservice.getProspectsbyStatus("PENDING_APPROVAL").subscribe((list) => {
      this.prospectlist = list;
    })
  }

  approve(prospect: Prospect){
    prospect.applicationStatus="APPROVED";
    this._prospectlistservice.approveLoan(prospect).subscribe(id => { 
      console.log(id);
      this._prospectlistservice.getProspectsbyStatus("PENDING_APPROVAL").subscribe((list) => {
        this.prospectlist = list;
      })
    })
  }

  reject(prospect: Prospect){
    prospect.applicationStatus="REJECTED";
    this._prospectlistservice.updateProspectApplStatus(prospect).subscribe(id => { 
      console.log(id);
      this._prospectlistservice.getProspectsbyStatus("PENDING_APPROVAL").subscribe((list) => {
        this.prospectlist = list;
      })
    })
  }
}
