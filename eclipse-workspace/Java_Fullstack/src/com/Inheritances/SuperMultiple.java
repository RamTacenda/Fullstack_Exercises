package com.Inheritances;

abstract class A1{
	A1(){
		System.out.println("A");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("B");
	}
	void meth(int num) {
		System.out.println("Hey I'm from B1");
	}
}

class C1 extends B1{
	C1(){
		System.out.println("C");
	}
	void meth() {
		System.out.println("Hey I'm from C1");
	}
}

public class SuperMultiple {

	public static void main(String args[]) {
		C1 obj = new C1();
		obj.meth(6);
	}
}
