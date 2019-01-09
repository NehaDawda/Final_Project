import { Component, OnInit } from '@angular/core';
import { ProspectService } from 'src/app/services/prospect.service';
import { Prospect } from 'src/app/models/prospect.model';
import { CreditLimitDetails } from 'src/app/models/credit-limit-details.model';
import { JsondataService } from 'src/app/services/jsondata.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-prospect-list',
  templateUrl: './prospect-list.component.html',
  styleUrls: ['./prospect-list.component.css']
})
export class ProspectListComponent implements OnInit {
  prospectlist: Prospect[];
  toggleProspectDetails: boolean = false;
  prospect_detail: Prospect;
  curr_prospect_credit_info: CreditLimitDetails;


  constructor(private router: Router, private _prospectlistservice: ProspectService,
    private _jsonDataservice: JsondataService) { }


  //constructor(private _prospectlistservice : JsondataService) { }

  ngOnInit() {
    this._prospectlistservice.getProspects().subscribe(prospectList => { this.prospectlist = prospectList });
  }

  showProspectDetails(prospectId: Number) {
    this._prospectlistservice.getProspectDetails(prospectId).subscribe(prospect_detail => { this.prospect_detail = prospect_detail })
    this.toggleProspectDetails = true;
  }

  showProspectList() {
    this.toggleProspectDetails = false;
  }

  updateApplStatus(status: String) {
    this.prospect_detail.applicationStatus = status;
    this._prospectlistservice.updateProspectApplStatus(this.prospect_detail).subscribe(id => { console.log(id); })
  }

  getCreditLimit() {
    this._jsonDataservice.getProspectCreditInfo(this.prospect_detail.panNumber).subscribe(credit_info => {
      this.curr_prospect_credit_info = <CreditLimitDetails>credit_info;
      if (this.curr_prospect_credit_info.creditLimit > 0) {
        console.log("In If body");
        this.prospect_detail.creditLimit = this.curr_prospect_credit_info.creditLimit;
        this.prospect_detail.lastUpdatedCreditDate = this.curr_prospect_credit_info.lastUpdatedCreditDate;
        this.prospect_detail.applicationStatus = "CREDIT_REVIEW_IN_PROGRESS";
        this._prospectlistservice.updateProspectApplStatus(this.prospect_detail).subscribe(id => { console.log(id); });
      }
    });
  }

  updateCreditLimit() {
    this.getCreditLimit();



  }
}
