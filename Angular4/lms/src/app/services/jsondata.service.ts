import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Prospect } from '../models/prospect.model';

@Injectable({
  providedIn: 'root'
})
export class JsondataService {

  constructor(private http: HttpClient) { }
  getProspectCreditInfo(panNumber:String) {
    return this.http.get('http://localhost:3001/credit_info/'+panNumber);
  }

  getProspectDetails(prospectId){
    return this.http.get('http://localhost:4530/prospects?prospectId='+prospectId);
  }

  addNewProspect(newprospect: Prospect){
    return this.http.post('http://localhost:8080/Loan_Management_System/register', newprospect)
  }
}
