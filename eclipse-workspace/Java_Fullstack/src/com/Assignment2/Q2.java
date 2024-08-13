package com.Assignment2;
class Dog{
	String name;
	String breed;
	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	void setter(String name){
		this.name = name;
	}
	void display() {
		System.out.println("Hey! "+name+ ", Are you "+breed+"?");
	}
}
public class Q2 {
public static void main(String args[]) {
	Dog obj = new Dog("Jonathan", "Husky");
	obj.display();
	obj.setter("Kutta");
	obj.display();
}
}
