package com.java.annotations;

//Java Program to illustrate SuppressWarnings Annotation

//Class 1
class DeprecatedTest {
	@Deprecated
	public void Display() {
		System.out.println("Deprecatedtest display()");
	}
}

//Class 2
public class SuppressWarningTest {
	// If we comment below annotation, program generates
	// warning
	@SuppressWarnings(value = { "" })
	public static void main(String args[]) {

		DeprecatedTest d = new DeprecatedTest();
		d.Display();
	}
}

