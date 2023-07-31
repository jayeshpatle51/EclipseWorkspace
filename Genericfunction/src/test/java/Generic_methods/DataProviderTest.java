package Generic_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javascriptmethods.Myproject;
public class DataProviderTest {

	 private static WebDriver driver;

	  @DataProvider(name = "Authentication")

	  public static Object[][] credentials() throws Exception {

	        // The number of times data is repeated, test will be executed the same no. of times

	        // Here it will execute two times
		  Object[][] testObjArray = ExcelUtils.getTableArray("TestData.xlsx","Sheet1");
	        return testObjArray;

	  }

	  // Here we are calling the Data Provider object with its Name

	  @Test(dataProvider = "Authentication")

	  public void test(String sUsername, String sPassword) throws InterruptedException {

	      driver = new FirefoxDriver();

	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	      driver.get("https://demoqa.com/login");

	      //driver.findElement(By.xpath("//span[text()='Login']")).click();

	      // Argument passed will be used here as String Variable

	      driver.findElement(By.id("userName")).sendKeys(sUsername);

	      driver.findElement(By.id("password")).sendKeys(sPassword);
	      Myproject.scrolltopagedown(driver);
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='text-right button']//button[@id='login']")).click();
  
	Thread.sleep(2000);

	// TODO Auto-generated catch block
	

	      driver.findElement(By.id("submit")).click();

	      driver.quit();

	  }
	
}
