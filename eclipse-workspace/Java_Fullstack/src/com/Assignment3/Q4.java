package com.Assignment3;

class Employee{
	int salary;
	
	Employee(int salary){
		this.salary = salary;
		this.salarymeth();
	}
	void work() {
		System.out.println("I'm working as a NeuroSurgeon with salary "+salary);
	}
	void salarymeth() {
		System.out.println("My paycheck is "+salary);
	}
	
}

class HRmanager extends Employee{
	int count = 1;
	HRmanager(int count){
		super(50000);
		this.count = count;
	}
	
	void work() {
		System.out.println("I'm working as a HR Manager and count is "+count);
	}
	
	void addEmployee(int count) {
		this.count = count;
	}
}
public class Q4 {
	public static void main(String args[]) {
		HRmanager obj = new HRmanager(2);
		obj.work();
		obj.addEmployee(4);
		obj.work();
	}
}
