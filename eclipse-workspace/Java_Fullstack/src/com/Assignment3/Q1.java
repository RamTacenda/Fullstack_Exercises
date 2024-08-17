package com.Assignment3;

class Animal{
	
	void makeSound() {
		System.out.println("Meow".toLowerCase());
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("Meow".toUpperCase());
	}
}
public class Q1 {
	public static void main(String args[]) {
		Cat obj = new Cat();
		obj.makeSound();	
	}

}
