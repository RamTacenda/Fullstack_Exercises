package com.Assignment2;

class Circle{
	float radius;
	Circle(double radius){
		this.radius = (float) radius;
	}
	
	void setter(float radius) {
		this.radius = radius;
	}
	void Area() {
		float area = (float)3.14 * radius*radius;
		System.out.println("The Area: "+ area);
	}
	
	void Peri() {
		float peri = (float)3.14 * 2*radius;
		System.out.println("The Peri: "+ peri);
	}
}
public class Q4 {
	public static void main(String args[]) {
		Circle obj = new Circle(5);
		obj.Area();
		obj.Peri();
		obj.setter(6);
		obj.Area();
		obj.Peri();
	}

}
