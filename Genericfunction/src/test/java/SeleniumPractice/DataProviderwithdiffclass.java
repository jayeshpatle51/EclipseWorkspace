package SeleniumPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderwithdiffclass extends T1 {

	@Test(dataProvider = "provide")
	public void method1(int no1, int no2) {

		System.out.println(no1 + " " + no2);
	}

}

class T1 {

	@DataProvider(name = "provide")
	public Object[][] dataProvide() {

		return new Object[][] { { 1, 2 }, { 4, 6 } };
	}
}