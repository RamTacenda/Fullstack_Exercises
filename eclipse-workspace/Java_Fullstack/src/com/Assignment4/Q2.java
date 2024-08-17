package com.Assignment4;

class Vehicle{
	void speedup() {
		System.out.println("The Vehicle is revving up");
	}
}

class Car extends Vehicle{
	int speed;
	Car(int speed){
		this.speed = speed;
	}
	void speedup() {
		System.out.println("The speed of the vehicle is "+speed+"km/hr");
	}
}

class Bicycle extends Vehicle{
	int speed;
	Bicycle(int speed){
		this.speed = speed;
	}
	void speedup() {
		System.out.println("The speed of the vehicle is "+speed+"km/hr");
	}
}

public class Q2 {

	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle = new Car(100);
		vehicle.speedup();
		
		vehicle = new Bicycle(24);
		vehicle.speedup();

	}

}
