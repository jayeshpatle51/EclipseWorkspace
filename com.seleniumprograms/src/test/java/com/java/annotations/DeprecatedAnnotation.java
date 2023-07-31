package com.java.annotations;

public class DeprecatedAnnotation {
	@Deprecated

	public void Display() {
		System.out.println("Deprecatedtest display()");
	}

	public static void main(String args[]) {
		DeprecatedAnnotation d1 = new DeprecatedAnnotation();

		d1.Display();
	}
}
