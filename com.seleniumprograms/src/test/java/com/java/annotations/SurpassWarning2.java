package com.java.annotations;

public class SurpassWarning2 {
	@Deprecated
	public static void deprecatedMethod() {
		System.out.println("Deprecated method");
	}

//  Here, deprecatedMethod() has been marked as deprecated and will give compiler 
//	warnings when used. By using the
//	@SuppressWarnings("deprecated") 
//	annotation, we can avoid compiler warnings.
	@SuppressWarnings("deprecated")
	public static void main(String args[]) {
		SurpassWarning2 depObj = new SurpassWarning2();
		depObj.deprecatedMethod();
	}
}

