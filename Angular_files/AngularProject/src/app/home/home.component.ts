import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  mul:number;

  constructor(private calc:CalculatorService){
    this.mul = calc.getmul(10,20);
  }
}

