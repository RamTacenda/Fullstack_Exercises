package com.Inheritances;

class TwoWheeler{
	void noOfWheels() {
		System.out.println("I got two wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}

class Type extends Bike{
	void modelType() {
		System.out.println("It is an E-Vehicle");
	}
}

class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is Pept+");
	}
}

public class Inherit {
	public static void main(String args[]) {
		Type obj = new Type();
		obj.brandName();
		obj.noOfWheels();
		obj.modelType();
		
		System.out.println();
		
		Scooty obj2 = new Scooty();
		obj2.noOfWheels();
		obj2.brandName();
	}

}
