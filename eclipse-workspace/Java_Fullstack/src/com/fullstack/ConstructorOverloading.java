package com.fullstack;

public class ConstructorOverloading {

	ConstructorOverloading(String Name){
		this(10,20);
		System.out.println("The Name is "+ Name);
	}
	ConstructorOverloading(int a, int b){
		System.out.println("Added: "+(a+b));
	}
	ConstructorOverloading(int f){
		this("Bond");
		int res = 1;
		for(int i=1; i<=f; i++) {
			res = res * i;
		}
		System.out.println("Factorial: "+res);
	}
	public static void main(String args[]) {
		ConstructorOverloading obj1 = new ConstructorOverloading(10);
	}
}
