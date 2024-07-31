import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {

  getadd(a:number, b:number) {
    return a+b;
   }
   
   getsub(a:number, b:number) {
    return a-b;
   }

   getmul(a:number, b:number) {
    return a*b;
   }

   getdiv(a:number, b:number) {
    return a/b;
   }
}
