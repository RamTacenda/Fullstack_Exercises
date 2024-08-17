package com.Assignment2;
import java.util.*;
class Employee{
	String name;
	String title;
	int salary;
	String arr[] = new String[3];
	
	Employee(String name, String title, int salary){
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	void setter(int salary) {
		this.salary = salary;
	}
	String[] display() {
		arr[0] = name;
		arr[1] = title;
		arr[2] = String.valueOf(salary);
		return arr;
	}
}
public class Q6 {
	public static void main(String args[]) {
		Employee obj = new Employee("Ram", "AASE", 48000);
		String arr[] = obj.display();
		System.out.println("Employee details: "+ Arrays.toString(arr));
		obj.setter(50000);
		String arr2[] = obj.display();
		System.out.println("Employee details: "+ Arrays.toString(arr2));
		
	}


}
