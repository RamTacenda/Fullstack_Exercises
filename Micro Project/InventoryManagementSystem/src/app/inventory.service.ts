import { Injectable } from '@angular/core';
import { data } from './model/data';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class InventoryService {
  details : data;
  url: string;
  dataArr : data[];


  constructor(private http: HttpClient) { 
    this.details = new data();
    this.dataArr = [];
    this.url = "http://localhost:3004/data"
   }

   insertdata(details: data){
    this.http.post<data>(this.url, details).subscribe();
    return "Product details has been added"
   }

   updatedata(details: data){
    this.http.put<data>(this.url+'/'+details.id, details).subscribe();
    return "Product details has been updated"
   }

   deletedata(pid: number){
    this.http.delete<data>(this.url+'/'+pid).subscribe();
    return "Product details of Id:"+pid+" has been deleted"
   }

   findalldata(){
    this.http.get<data[]>(this.url).subscribe(info => this.dataArr = info)
    return this.dataArr;
   }

}
