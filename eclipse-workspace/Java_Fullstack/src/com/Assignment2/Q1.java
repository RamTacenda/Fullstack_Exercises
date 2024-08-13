package com.Assignment2;

class Person{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
		this.display();
	}
	void display(){
		System.out.println("Your Name is "+name+" and your age is "+age);
	}
}
public class Q1 {
	public static void main(String args[]) {
		Person obj1 = new Person("Nandy", 18);
		Person obj2 = new Person("Remo", 21);	
	}
}
