import { Component } from '@angular/core';
import { data } from './model/data';
import { InventoryService } from './inventory.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MicroProject';
  details : data;
  result : string;
  flag: boolean;
  success: boolean;
  update: boolean;
  delete: boolean;
  dataArr : data[];

  constructor(private service: InventoryService){
    this.details = new data();
    this.result = "";
    this.flag = false;
    this.success = false;
    this.update = false;
    this.delete = false;
    this.dataArr = [];
  }

  insertdata(info: any){
    this.details.id = info.pid;
    this.details.pdate = info.pdate;
    this.details.pname = info.pname;
    this.details.pquantity = info.pquantity;
    this.details.pprice = info.pprice;

    this.result = this.service.insertdata(this.details);
    this.success = true;

    setTimeout(() => {
      this.success = false;
    }, 800);
  }

  updatedata(info: any){
    this.details.id = info.pid;
    this.details.pdate = info.pdate;
    this.details.pname = info.pname;
    this.details.pquantity = info.pquantity;
    this.details.pprice = info.pprice;

    this.result = this.service.updatedata(this.details);
    this.update = true;

    setTimeout(() => {
      this.update = false;
    }, 800);

  }

  deletedata(info: any){
    this.result = this.service.deletedata(info.pid);
    this.delete = true;

    setTimeout(() => {
      this.delete = false;
    }, 800);
  }

  findalldata(){
    this.dataArr = this.service.findalldata();
    this.flag = true;
  }
}
