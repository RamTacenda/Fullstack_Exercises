package com.Assignment2;

class Rectangle{
	float width;
	float height;
	Rectangle(double width, double height){
		this.width = (float) width;
		this.height = (float) height;
	}
	void Area() {
		float area = width*height;
		System.out.println("The Area: "+area);
	}
	float Peri() {
		float peri = width + height;
		return peri;
	}
}
public class Q3 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(12.3, 8.4);
		obj.Area();	
		float peri = obj.Peri();
		System.out.println("The Perimeter: "+peri);
	}

	
	
}
