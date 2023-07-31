package com.java.annotations;

import org.testng.annotations.Test;

@interface MyCustomAnnotation {
	String value() default "default value";

	int num() default 0;

	String name() default "Jayesh";
}

public class CostomAnnotation1 {
	@MyCustomAnnotation
	public void method1() {
		System.out.println("Test method 1");
	}

	@Test
	public void Test1() {
		System.out.println("This is Test");
	}
	public static void main(String[] args) throws Exception {
		CostomAnnotation1 obj = new CostomAnnotation1();
		obj.method1();
	}
}

