package testNgListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.BaseTest;


//@Listeners(ItestListenerDemo.class)
public class TestNgTest {
	
	WebDriver driver;
    @BeforeTest
	public void beforeTest() {
		BaseTest.launchBrowser("firefox");
		driver=BaseTest.driver;
		Reporter.log("Browser launched Successfully");
	}
	
    @AfterTest
	public void afterTest() {
		BaseTest.closeDriver();
		Reporter.log("Driver Instance closed Successfully");
	}
	@Test  //Success Test
	public void CloseBrowser() {
	
		//driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test //Failed Test
	public void verifypageTitle() {
		
	     
	        driver.get("https://www.google.com");
	        String expectedTitle = "Google1";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	private int i = 1;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void googlePageTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}

}