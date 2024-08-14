package com.Assignment4;

class Shapes{
	void Area() {
		System.out.println("The Calculated area");
	}
}

class Circle extends Shapes{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	void Area() {
		float res = (float)(3.14) *(radius*radius);
		System.out.println("The Calculated area of a circle is "+res);
	}
}

class Rectangle extends Shapes{
	int h;
	int w;
	Rectangle(int h, int w){
		this.h = h;
		this.w = w;
	}
	void Area() {
		float res = h*w;
		System.out.println("The Calculated area a rectangle is "+res);
	}
}

class Triangle extends Shapes{
	int h;
	int b;
	Triangle(int h, int b){
		this.h = h;
		this.b = b;
	}
	void Area() {
		float res = (float)(0.5)* h*b;
		System.out.println("The Calculated area of a triangle is "+res);
	}
}

public class Q3 {
	public static void main(String args[]) {
		Shapes shape;
		shape = new Circle(5);
		shape.Area();
		
		shape = new Rectangle(10, 18);
		shape.Area();
		
		shape = new Triangle(12, 9);
		shape.Area();
		
	}
}
