import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProspectService } from 'src/app/services/prospect.service';
import { Prospect } from 'src/app/models/prospect.model';
import { Property } from 'src/app/models/property.model';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  NewProspect: Prospect;
  NewProperty: Property;
  constructor(private _prospectlistservice: ProspectService) { }

  ngOnInit() {
  }

  showSubElements(){
    var loan_type = document.getElementById("loanType").value;
    if(loan_type==="HOME_LOAN"){
        document.getElementById("propertyFields").style.display = "block";
    }
}
  addProspect(prospectform: NgForm) {
    
    this.NewProspect= {
      prospectId: "R869",
      firstName: prospectform.value.firstName,
      lastName: prospectform.value.lastName,
      address: prospectform.value.address,
      loanType: prospectform.value.loanType,
      income: prospectform.value.income,
      requiredLoanAmt: prospectform.value.requiredLoanAmt,
      panNumber: prospectform.value.panNumber,
      aadharNumber: prospectform.value.aadharNumber,
      contactNumber: prospectform.value.contactNumber,
      email: prospectform.value.email,
      enquiryDate: null,
      dateOfBirth: prospectform.value.dateOfBirth,
      city: prospectform.value.city,
      creditLimit: null,
      lastUpdatedCreditDate: null,
      applicationStatus: "NEW",
      prospectAssetId: "122"
    };

    this.NewProperty  = {
      propertyId: "Property1",
    apartmentNo:"Property1",
    apartmentName:"Property1",
    streetName:"Property1",
    locality:"Property1",
    landmark:"Property1",
    city:"Property1",
    state:"Property1",
    country:"Property1",
    zipCode:"Property1",
    purchasedPrice:5000000
    }

    console.log(this.NewProspect)
    this._prospectlistservice.addNewProspect(this.NewProspect, this.NewProperty).subscribe(prospect => { this.NewProspect });
  }

}
