package com.java.annotations;

//Java Program to Illustrate Override Annotation

//Class 1
public class OverrideAnnotation {

	public void Display() {
		System.out.println("Base display()");
	}


	public static void main(String args[]) {
		OverrideAnnotation t1 = new Derived();
		t1.Display();
	}
}

//Class 2
//Extending above class
class Derived extends OverrideAnnotation {

	@Override
	public void Display() {
		System.out.println("Derived display()");
	}
}

