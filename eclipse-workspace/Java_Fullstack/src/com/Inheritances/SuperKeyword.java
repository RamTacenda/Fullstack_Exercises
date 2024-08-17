package com.Inheritances;

class A{
	int a = 10;
	A(String name){
		System.out.println("Welcome "+name);
	}
	void methodOne() {
		System.out.println("I'm from super class");
	}
}

class B extends A{
	B(){
		super("Ram");
	}
	void methodTwo() {
		System.out.println("Super class variable: "+super.a);
		super.methodOne();
	}
}

public class SuperKeyword {
	
	public static void main(String args[]) {
		B obj = new B();
		obj.methodTwo();
	}
}
