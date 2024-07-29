import { Component } from '@angular/core';

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

  constructor(){
    this.name = "Kenan";
    this.age = 18;
    this.email = "kenanaljedi@gmail.com";
    this.txtcolor = "red";
    this.imgpath = "https://yt3.googleusercontent.com/y4J_Fs5ksRlxx6_LzT1VKxVqH_T8Vyn_RN_YYgLJhuMzBS5qxTgm7NlEcMkQd3hgCpfWtYcEUg=s900-c-k-c0x00ffffff-no-rj"
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
}


