package com.fullstack;

public class MyVariables {
	int a = 20; //Instance variable 
	static int s = 30; //Static variable

	public static void main(String args[]) {
		int c = 10; //Local variable
		System.out.println("This is a Local Varibale: "+c);
		
		MyVariables obj = new MyVariables();
		System.out.println("This is  Variable: "+obj.a);
		System.out.println("This is Static Variable: "+s);
	}
}
