package com.java.annotations;

//User-defined annotation
interface Test {
	public int calculate();

	interface NestedInterface {
		public void nested();
	}
}


@interface TestAnnotation {
	String Developer() default "Rahul";

	String Expirydate();
} // will be retained at runtime

//Driver class that uses @TestAnnotation
public class CostumAnntation {

	@TestAnnotation(Expirydate = "16/11/1987")
	void fun1() {
		System.out.println("Test method 1");
	}

	@TestAnnotation(Developer = "Anil", Expirydate = "01-10-2021")
	void fun2() {
		System.out.println("Test method 2");
	}

	public static void main(String args[]) {
		System.out.println("Hello");
	}
}
