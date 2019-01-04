import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Prospect } from '../models/prospect.model';


@Injectable({
  providedIn: 'root'
})
export class ProspectService {

  constructor(private http: HttpClient) { }

  getProspects() {
    return this.http.get('http://localhost:8080/Loan_Management_System/prospectList');
  }

  getProspectDetails(prospectId){
    return this.http.get('http://localhost:8080/Loan_Management_System/prospectDetails',prospectId);
  }

  addNewProspect(newprospect: Prospect){
    return this.http.post('http://localhost:8080/Loan_Management_System/register', newprospect)
  }
}
