package com.Assignment3;

class Vehicle{
	 void drive() {
		 System.out.println("This is a vehicle class");
	}
}

class Car extends Vehicle{
	 
	 void drive() {
		System.out.println("Repairing a car");
	}
	 
	 void test() {
			System.out.println("Tested a car");
		}
	 

}
public class Q2 {
	public static void main(String args[]) {
		Vehicle obj = new Car();
		obj.drive();
	}

}
