package com.Assignment3;

class Shape{
	int height;
	int width;
	void getArea(int height, int width) {
		 this.height = height;
		 this.width = width;
		 this.display();
	}
	void display() {
		System.out.println("The Area: "+(height*width));
	}
}

class Rectangle extends Shape{
	void getArea(int height, int width) {
		System.out.println("The Area is "+(height*width));
	}
}
public class Q3 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle();
		obj.getArea(10, 20); 
		
	}

	
}
