package com.Assignment4;

class Animal{
	
	void sound() {
		System.out.println("Animals would make sound");
	}
}

class Bird extends Animal{
	void sound() {
		System.out.println("Birds can make sounds");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("Cats can make sounds");
	}
}

public class Q1 {

	public static void main(String[] args) {
		Animal animal;
		animal = new Cat();
		System.out.print("Cats characteristics: ");
		animal.sound();
		
		animal = new Bird();
		System.out.print("Bird characteristics: ");
		animal.sound();

	}

}
