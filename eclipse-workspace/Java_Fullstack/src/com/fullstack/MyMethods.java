package com.fullstack;

public class MyMethods {

	void insMethod() {
		System.out.println("Instance or Object Method");
	}
	static void staMethod() {
		System.out.println("Static Method");
	}
	public static void main(String args[]) {
		MyMethods obj = new MyMethods();
		obj.insMethod();
		MyMethods.staMethod();
	}
}
