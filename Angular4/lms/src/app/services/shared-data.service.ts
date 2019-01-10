import { Injectable } from '@angular/core';
import { BankEmployee } from '../models/bank-employee.model';


@Injectable({
  providedIn: 'root'
})
export class SharedDataService {
  loggedInUser:BankEmployee;

  constructor() { }

  logoff(){
    this.loggedInUser=null;
  }
}
