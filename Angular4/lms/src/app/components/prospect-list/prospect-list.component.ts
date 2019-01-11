import { Component, OnInit } from '@angular/core';
import { ProspectService } from 'src/app/services/prospect.service';
import { Prospect } from 'src/app/models/prospect.model';
import { CreditLimitDetails } from 'src/app/models/credit-limit-details.model';
import { JsondataService } from 'src/app/services/jsondata.service';
import { Router } from '@angular/router';
import { Property } from 'src/app/models/property.model';
import { PropertyAssessmentDetails } from 'src/app/models/property-assessement-details';
import { updateBinding } from '@angular/core/src/render3/instructions';
import { SharedDataService } from 'src/app/services/shared-data.service';

@Component({
  selector: 'app-prospect-list',
  templateUrl: './prospect-list.component.html',
  styleUrls: ['./prospect-list.component.css']
})
export class ProspectListComponent implements OnInit {
  prospectlist: Prospect[];
  toggleProspectDetails: boolean = false;
  prospect_detail: Prospect;
  property_detail: Property;
  curr_prospect_credit_info: CreditLimitDetails;
  curr_property_market_value:PropertyAssessmentDetails;

  constructor(private router: Router, private _prospectlistservice: ProspectService,
    private _jsonDataservice: JsondataService,private sharedDataService:SharedDataService) { }

  ngOnInit() {
    this._prospectlistservice.getProspects().subscribe(prospectList => { this.prospectlist = prospectList });
  }

  showProspectDetails(prospectId: Number) {
    this._prospectlistservice.getProspectDetails(prospectId).subscribe(prospect_detail => {
       this.prospect_detail = prospect_detail;
       this._prospectlistservice.getPropertyDetails(this.prospect_detail.prospectAssetId).subscribe((property)=>{
         this.property_detail = property;
       })

      })
    this.toggleProspectDetails = true;
  }

  showProspectList() {
    this.toggleProspectDetails = false;
    this._prospectlistservice.getProspects().subscribe(prospectList => { this.prospectlist = prospectList });
  }

  updateApplStatus(status: String) {
    this.prospect_detail.applicationStatus = status;
    this._prospectlistservice.updateProspectApplStatus(this.prospect_detail).subscribe(id => { console.log(id); })
  }

  updateCreditLimit() {
    this._jsonDataservice.getProspectCreditInfo(this.prospect_detail.panNumber).subscribe((credit_info) => {
      this.curr_prospect_credit_info = <CreditLimitDetails>credit_info;

      if (this.curr_prospect_credit_info) {
        var updateProspect: Prospect;
        updateProspect = this.prospect_detail;
        updateProspect.creditLimit = this.curr_prospect_credit_info.creditLimit;
        updateProspect.lastUpdatedCreditDate = this.curr_prospect_credit_info.lastUpdatedCreditDate;
        updateProspect.applicationStatus = "CREDIT_REVIEW_IN_PROGRESS";
        this._prospectlistservice.updateProspectApplStatus(updateProspect).subscribe((id) => {
          console.log(id);
        })
      }
    });
  }

  updateMarketValue(){
    this._jsonDataservice.getPropertyMarketValue(this.property_detail.registrationNumber+"_"+this.property_detail.propertyType).subscribe((assessmet_json) =>{
      this.curr_property_market_value = <PropertyAssessmentDetails>assessmet_json;

      console.log(this.curr_property_market_value.propertyMarketValue);

      if(this.curr_property_market_value){
        var updateProperty: Property;
        updateProperty=this.property_detail;
        updateProperty.marketValue = this.curr_property_market_value.propertyMarketValue;
        this._prospectlistservice.updateProperty(updateProperty).subscribe((id)=>{
          console.log("PropertyId"+id);
        })

        var updateProspect:Prospect;
        updateProspect = this.prospect_detail;
        updateProspect.applicationStatus = "ASESSMENT_IN_PROGRESS";
        this._prospectlistservice.updateProspectApplStatus(updateProspect).subscribe((id) => {
          console.log("ProspectId"+id);
        })
      }
    });
  }

  approveLoanAppl(){
    var updateProspect:Prospect;
    updateProspect = this.prospect_detail;
    updateProspect.applicationStatus = "APPROVED";
    this._prospectlistservice.approveLoan(updateProspect).subscribe((res) => {console.log(res)});
  }
}
