package com.fullstack;

class Creatures{
	int a = 10;
	void move() {
		System.out.println("All Creatures move");
	}
	void eat() {
		System.out.println("All Creatures eat");
	}
}

class Dog extends Creatures{
	int a = 20;
	void move() {
		System.out.println("Dog moves by using its legs");
	}
	void eat() {
		System.out.println("Dog lives by eating a meat mostly");
	}
}

class Bird extends Creatures{
	int a = 30;
	void move() {
		System.out.println("Birds fly by its wings");
	}
	void eat() {
		System.out.println("Birds eat by pecking on nuts");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Creatures objb = new Bird();
		objb.move();
		objb.eat();
		System.out.println("a: "+objb.a);
		
		objb = new Dog();
		objb.move();
		objb.eat();
		System.out.println("a: "+objb.a);
		
		

	}

}
