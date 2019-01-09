import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Prospect } from '../models/prospect.model';


@Injectable({
  providedIn: 'root'
})
export class ProspectService {

  constructor(private http: HttpClient) { }

  getProspects() {
    return this.http.get<Prospect[]>('http://192.168.1.16:8082/prospects/list');
  }

  getProspectDetails(prospectId){
    return this.http.get('http://192.168.1.16:8082/prospectDetails',prospectId);
  }

  addNewProspect(newprospect: Prospect){
    return this.http.post('http://192.168.1.16:8082/register', newprospect)
  }
}
