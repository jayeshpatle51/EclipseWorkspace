package seleniumscripts;

interface C {
	void m1();
}

class A implements C {

	public void m1() {
		System.out.println("Hi");
	}
}

class B extends A {

//	public void m1() {
//		System.out.println("Hi");
//	}
}

public class DriverMethods {


	{
		System.out.println("Short ");
	}

	public static void go(int n) {
		System.out.println("int ");
	}

	public static void main(String[] args) {


	}
}
