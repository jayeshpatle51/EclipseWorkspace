package Generic_methods;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testclass1 {
	public void myMethod1() {
		System.out.println("This is my method1 : ");
	}
	
	
	//WebDriver driver = new ChromeDriver();
	int i=Math.abs(-9);
	
	@Test (priority = 0)
	@Parameters({"name","surname"})
	public void loseBrowser(@Optional("")String a,@Optional("this are optional")String b) {
		//driver.close();
		System.out.println("Closing Google Chrome browser "+a+" "+b);
		System.out.println(i);
		myMethod1();
	}

	@Test (priority = 1)
	public void OpenBrowser() {
		System.out.println("Launching Google Chrome browser"); 	        
		//driver.get("https://www.demoqa.com");
	}

	@Test
	public void countTest(){
		System.out.println("Some tests for Customer Account");
	}
}
