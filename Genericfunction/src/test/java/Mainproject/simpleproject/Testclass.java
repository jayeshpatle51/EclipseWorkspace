package Mainproject.simpleproject;

import org.testng.annotations.Factory;

public class Testclass {

	String firstname;

	Testclass(String firstname) {
		this.firstname = firstname;
		System.out.println("Test " + firstname);
	}

	// @Test()
	public void test1() {
		System.out.println("Test 1" + firstname);
		// Assert.assertTrue(false);
	}

//	@Test
//	public void test2() {
//
//		System.out.println("Test 2");
//		// Assert.assertTrue(true);
//
//	}
//
//	@DataProvider
//	public Object[] dataProvider() {
//		// String[][] arr=new String[2][2];
//		// String[][] arr = { { "name1", "surname1" }, { "name2", "surname2" } };
//		Sample[] arr = { new Sample("name1", "surname2") };
//		return arr;
//	}

	@Factory
	public Object[] factory() {

		return new Object[] { new Testclass("Jayesh"), new Testclass("Gopi") };
	}

}

class Sample {
	String var1;
	String var2;

	Sample(String str, String str2) {
		var1 = str;
		var2 = str2;

	}

//	@Override
//	public String toString() {
//		return var1 + " " + var2;
//
//	}

}
