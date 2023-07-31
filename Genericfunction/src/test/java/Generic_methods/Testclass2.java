package Generic_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testclass2 {

	
	//@Test(dataProvider="name_of_dataprovider")
	@Test
	//@Parameters({"name","surname"})
	
	public void method1() {
		
	
		System.out.println("This is method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("This is method 5");
	}
	
	@Test
	public void method3() {
		System.out.println("This is method 6");
	}
	
	@DataProvider (name = "name_of_dataprovider")
	public Object[][] dpMethod() {
		Object[] [] obj= new Object [2][3];
		obj[0][0]=3;
		obj[0][1]=5;
		obj[0][2]=8;
		
		obj[1][0]=6;
		obj[1][1]=7;
		obj[1][2]=14;
		
	    return obj  ;
	    
	}
}
