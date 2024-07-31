import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularProject';
  name:string;
  age:number;
  email:string;
  txtcolor:string;
  imgpath:string;
  fname:string;
  flag:boolean;
  vehicles:string[];
  selvec:string ="";
  mystyle: {};
  myClass:string;

  sum:number;
  sub:number;

  constructor(private calc: CalculatorService){
    this.sum = calc.getadd(10, 20);
    this.sub = calc.getsub(10,20);
    this.name = "Kenan";
    this.age = 18;
    this.email = "kenanaljedi@gmail.com";
    this.txtcolor = "red";
    this.imgpath = "https://yt3.googleusercontent.com/y4J_Fs5ksRlxx6_LzT1VKxVqH_T8Vyn_RN_YYgLJhuMzBS5qxTgm7NlEcMkQd3hgCpfWtYcEUg=s900-c-k-c0x00ffffff-no-rj"
    this.fname = "";
    this.flag = true;
    this.vehicles = ["One Wheeler", "Two Wheeler", "Three Wheeler"];
    this.mystyle = {'width': 'fit-content', 'border': '2px solid green'};
    this.myClass = "Class1";
  }

  add(a:number,b:number){
    let val = a+b;
    return val;
  }

  changeName(){
    this.name = "Tacenda";
  }
  changeEmail(){
    this.email = "BlahBlahBlah@gmail.com";
  }
  changeAge(){
    this.age = 20;
  }
  clickimg(){
    if(this.imgpath == "https://yt3.googleusercontent.com/y4J_Fs5ksRlxx6_LzT1VKxVqH_T8Vyn_RN_YYgLJhuMzBS5qxTgm7NlEcMkQd3hgCpfWtYcEUg=s900-c-k-c0x00ffffff-no-rj"){
      this.imgpath = "https://static-00.iconduck.com/assets.00/angular-icon-2048x2048-24b236vf.png";
    }
    else if(this.imgpath == "https://static-00.iconduck.com/assets.00/angular-icon-2048x2048-24b236vf.png"){
      this.imgpath = "https://yt3.googleusercontent.com/y4J_Fs5ksRlxx6_LzT1VKxVqH_T8Vyn_RN_YYgLJhuMzBS5qxTgm7NlEcMkQd3hgCpfWtYcEUg=s900-c-k-c0x00ffffff-no-rj";
    }
  }
  show_or_hide(){
    this.flag = !this.flag
  }
  selectedvec(vec :string){
    this.selvec = vec;
  }
  changeClass(){
    if(this.myClass == "Class1"){
      this.myClass = "Class2";
    }
    else if(this.myClass == "Class2"){
      this.myClass = "Class1";
    }
}
}


