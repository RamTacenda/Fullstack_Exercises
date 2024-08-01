import { Component } from '@angular/core';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'EmployeeManagementSystem';
  employee : Employee;
  name: string;

  constructor(){
    this.employee = new Employee();
    this.name = "Find all";
  }

  insertEmployee(data: any){
    this.employee.empId = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    alert("Hey This is a alert message");
  }

  changename(){
    if(this.name=="Find all"){
      this.name="Find All";
    }
    else if(this.name=="Find All"){
      this.name="Find all";
    }
  }
}
