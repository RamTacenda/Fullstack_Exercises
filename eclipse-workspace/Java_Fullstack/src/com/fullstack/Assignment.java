package com.fullstack;

import java.util.Arrays;
import java.util.Scanner;

class Student{
	int regno;
	String studentName;
	int subject[] = new int[5];
	
	Student(int regno, String studentName) {
		this.regno = regno;
		this.studentName = studentName;
		this.getMarks();
		this.displayGrade();
	}
	
	void getMarks() {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<subject.length; i++) {
			subject[i] = scan.nextInt();
		}
	}
	
	void displayGrade() {
		int sum = 0;
		for(int i=0; i<subject.length; i++) {
			sum = sum + subject[i];
		}

		int avg = sum / subject.length;
		
		if(avg > 85) {
			System.out.println("The Grade is O");
			
		}
		else if(avg > 75) {
			System.out.println("The Grade is O");
			
		}
		else if(avg > 65) {
			System.out.println("The Grade is O");
			
		}
		else if(avg > 50) {
			System.out.println("The Grade is O");
			
		}
		System.out.println("The Name of the student: "+studentName);
		System.out.println("His Register number: "+regno);
		System.out.println("His Marks: "+Arrays.toString(subject));
		System.out.println("His Total mark: "+sum);
		System.out.println("The Grade of the student: "+avg);
		
	}
}

public class Assignment {

	public static void main(String args[]) {
		Student obj = new Student(102, "Ram");
	}
}
