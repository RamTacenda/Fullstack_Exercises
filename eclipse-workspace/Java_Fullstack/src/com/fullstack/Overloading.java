package com.fullstack;

class Operations{
	void add(float a, float b) {
		System.out.println("Added two float number: "+(a+b));
	}
	void add(double a, double b) {
		System.out.println("Added two double number: "+(a+b));
	}
}
public class Overloading extends Object {

	public static void main(String args[]) {
		Operations obj;
		obj = new Operations();
		obj.add(1.0, 3.2);
	}
}
