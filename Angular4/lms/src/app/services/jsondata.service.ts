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

  getPropertyMarketValue(key:String){
    return this.http.get('http://localhost:3002/value_info/'+key);
  }
}
