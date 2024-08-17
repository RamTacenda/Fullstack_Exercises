package com.Assignment2;

class Book{
	String title;
	String author;
	int isbn;
	
	Book(String title, String author, int isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	void setter(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	void display() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("ISBN: "+isbn);
	}
}
public class Q5 {
	public static void main(String args[]) {
		Book obj = new Book("1984", "George Orwell", 12345678);
		obj.display();
		obj.setter("Pride & Prejudice", "Jane Austein", 85769135);
		obj.display();
	}

}
