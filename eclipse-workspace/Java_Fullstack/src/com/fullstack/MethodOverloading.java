package com.fullstack;

//Method Overloading
public class MethodOverloading {

	void myMethod(String name) {
		System.out.println("Method is called based on the argument Name: "+name);
	}
	void myMethod(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	void myMethod(int f) {
		int res = 1;
		for(int i=1; i<=f; i++) {
			res = res * i;
		}
		System.out.println("Factorial of "+f+" is "+res);
	}
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod("Ram");
		obj.myMethod(10, 20);
		obj.myMethod(5);
	}
}
