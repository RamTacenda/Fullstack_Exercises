package com.fullstack;

public class ThisKeyword {
	String name;
	
	ThisKeyword(String name){
		this(10, 30);
		this.name = name;
		this.greeting();
	}
	
	ThisKeyword(int a, int b){
		System.out.println("Sum: "+ (a+b));
	}
	
	void greeting() {
		System.out.println("Welcome "+name);
	}
	public static void main(String args[]) {
		ThisKeyword obj = new ThisKeyword("Ram");
	}
}
