import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProspectService } from 'src/app/services/prospect.service';
import { Prospect } from 'src/app/models/prospect.model';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  NewProspect : Prospect;
  constructor(private _prospectlistservice : ProspectService) { }

  ngOnInit() {
  }

  addProspect(prospectform:NgForm){
console.log('Hello');
    
  // let product: Product = {

  //     name: frm.value.name,
  //     price: Number(frm.value.price),
  //     photoPath: frm.value.photo
  //   }
  //   console.log()
  //   this._productService.addProduct(product).subscribe(product => { this.getProducts(); })

  // }
  // console.log()
  //this._productService.addProduct(product).subscribe(product => { this.getProducts(); })
  
    let newprospect:Prospect = {
      prospectId: "P777",
      firstName: prospectform.value.firstName,
      lastName: prospectform.value.lastName,
      address:prospectform.value.address,
      loanType:prospectform.value.loanType,
      income:prospectform.value.income,
      requiredLoanAmt:prospectform.value.requiredLoanAmt,
      panNumber:prospectform.value.panNumber,
      aadharNumber:prospectform.value.aadharNumber,
      contactNumber:prospectform.value.contactNumber,
      email:prospectform.value.email,
      enquiryDate:prospectform.value.enquiryDate,
      dateOfBirth:prospectform.value.dateOfBirth,
      city:prospectform.value.city,
      creditLimit:prospectform.value.creditLimit,
      lastUpdatedCreditDate:prospectform.value.lastUpdatedCreditDate,
      applicationStatus:"New",
      prospectAssetId:""
    };
    console.log(prospectform)
    //this._prospectlistservice.addNewProspect(newprospect).subscribe(prospect => {this.NewProspect});
  }
  
}
