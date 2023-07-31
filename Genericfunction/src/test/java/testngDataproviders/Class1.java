package testngDataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class1 {

	@Test(dataProvider = "provide")
	public void launchBrowser(MyData n1) {

		System.out.println("launch Browser " + n1.name + " " + n1.age);
	}

	@Test(dataProvider = "provide")
	public void login(MyData n1) {

		System.out.println("Login " + n1.name + " " + n1.age);
	}

	@DataProvider(name = "provide")
	public MyData[] dataProvide() {

		return new MyData[] { new MyData("Jayesh", 26) };
	}

}

class MyData {
	String name;
	Integer age;

	MyData(String name, int age) {
		this.name = name;
		this.age = age;
		// System.out.println(name + " " + age);
	}
}