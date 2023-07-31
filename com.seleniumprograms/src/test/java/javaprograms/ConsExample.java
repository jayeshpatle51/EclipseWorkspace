package javaprograms;

import java.io.IOException;

interface FirstInterface {

	static void m1() {

		System.out.println("This is the  static m1 method of first interface");
	}

	default void m2() {

		System.out.println("This is the default m2 method of first interface");
	}
}

interface SecondInterface extends FirstInterface {

//	static void m1() {
//
//		System.out.println("This is the  static m1 method of Second interface");
//	}

	default void m2() {

		System.out.println("This is the default m2 method of Second interface");
	}
}

class FirstClass {

	static void m1() {
		System.out.println("This is method m1 from FirstClass");
	}

	void m2() {
		System.out.println("This is method m2 from FirstClass");
	}

}

class SecondClass extends FirstClass {
//	static void m1() {
//		System.out.println("This is method m1 from SecondClass");
//	}

	void m2() {
		System.out.println("This is method m2 from SecondClass");
	}
}

class ThirdClass {
}
public class ConsExample {

	int no;
	String name;

	ConsExample() {

		System.out.println("cons 1");
	}

	ConsExample(int n) {
		this();
		System.out.println("cons 2");

	}

	public void run() {
		System.out.println("run");
	}
	public static void main(String[] args) throws IOException {



	}
}
