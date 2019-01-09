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
  toggleForm : boolean=false;
  view_prospect_detail : Prospect;


  constructor(private router: Router, private _prospectlistservice : ProspectService) { }
  

 //constructor(private _prospectlistservice : JsondataService) { }

  ngOnInit() {
    this._prospectlistservice.getProspects().subscribe(prospectList => {this.prospectlist =  prospectList});
  }

  

  showProspectDetails(i){
    this.view_prospect_detail = i;
    this.toggleForm = true;
  }

  

  getDetails(prospectdetailsform){
    let prospect_details : Prospect ={
    prospectId : this.view_prospect_detail.prospectId,
    firstName : prospectdetailsform.prospectFName,
    lastName : prospectdetailsform.prospectLName,
    address : prospectdetailsform.address,
    loanType : prospectdetailsform.loanType,
    income : prospectdetailsform.income,
    requiredLoanAmt : prospectdetailsform.requiredLoanAmt,
    panNumber : prospectdetailsform.panNumber,
    aadharNumber : prospectdetailsform.aadharNumber,
    contactNumber : prospectdetailsform.contactNumber,
    email : prospectdetailsform.email,
    enquiryDate : prospectdetailsform.enquiryDate,
    dateOfBirth : prospectdetailsform.dateOfBirth,
    city : prospectdetailsform.city,
    creditLimit : prospectdetailsform.creditLimit,
    lastUpdatedCreditDate : prospectdetailsform.lastUpdatedCreditDate,
    applicationStatus : prospectdetailsform.applicationStatus,
    prospectAssetId : prospectdetailsform.prospectAssetId,
    }

  this._prospectlistservice.getProspectDetails(prospect_details).subscribe(result => {
    console.log('prospect details for the prosopect ID selected' + result);
    this._prospectlistservice.getProspects;
    this.toggleForm = !this.toggleForm;

})
}
}
