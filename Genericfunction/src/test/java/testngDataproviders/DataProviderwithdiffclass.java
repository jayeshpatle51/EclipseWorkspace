package testngDataproviders;

import org.testng.annotations.Test;

public class DataProviderwithdiffclass extends Class1 {

	@Test(dataProvider = "provide")
	public void method1(int no1, int no2) {

		System.out.println(no1 + " " + no2);
	}

}
