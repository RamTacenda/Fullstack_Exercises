package com.fullstack;

class Employee{
	int empId;
	String empName;
	float empSalary;
	
	Employee(int empId, String empName, float empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	void display1() {
		System.out.println("Employee name: "+empName);
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Salary: "+empSalary);
	}
	static void Greetings() {
		System.out.println("Hey!");
	}

}


public class Myclass {
	public static void main(String args[]) {
		Employee obj = new Employee(12, "Aadithan",32000);
		obj.display1();
		Employee.Greetings();
	}
}
