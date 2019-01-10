import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Prospect } from '../models/prospect.model';
import { Property } from '../models/property.model';


@Injectable({
  providedIn: 'root'
})
export class ProspectService {

  constructor(private http: HttpClient) { }

  getProspects() {
    return this.http.get<Prospect[]>('http://192.168.1.16:8082/prospects/list');
  }

  getProspectDetails(prospectId : Number){
    return this.http.get<Prospect>('http://192.168.1.16:8082/prospectDetails/'+prospectId);
  }

  getPropertyDetails(propertyId : Number){
    return this.http.get<Property>('http://192.168.1.16:8082/propertyDetails/'+propertyId);
  }

  addNewProspect(newprospect, newproperty){
    const params = {newprospect, newproperty}
    console.log(params);
    return this.http.post('http://192.168.1.16:8082/loan/register', params);
  }

  updateProspectApplStatus(prospect: Prospect) {
    return this.http.put('http://192.168.1.16:8082/updateProspect',prospect);
  }

  updateProperty(property: Property) {
    return this.http.put('http://192.168.1.16:8082/updateProperty',property);
  }

  approveLoan(prospect:Prospect){
    return this.http.post('http://192.168.1.16:8082/loan/approve',prospect);
  }
}
