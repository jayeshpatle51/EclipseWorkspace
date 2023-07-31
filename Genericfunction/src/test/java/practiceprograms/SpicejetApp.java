package practiceprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetApp {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
         ChromeOptions options=new ChromeOptions();
         options.addArguments("--disable-notifications");
    	 WebDriver driver=new ChromeDriver(options);
    	 driver.manage().deleteAllCookies();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	 driver.get("https://www.spicejet.com/");
    	 
    	 driver.findElement(By.xpath("(//input[@autocapitalize])[1]")).sendKeys("Mum");
	     driver.findElement(By.xpath("(//input[@autocapitalize])[2]")).sendKeys("Hyderabad");
	     
	     		//driver.findElement(By.xpath("//div[text()='Hotels']")).click();
	   WebElement ele=  driver.findElement(By.xpath("//div[text()='Departure Date']//following::div[1]//div[1]"));
	   Thread.sleep(3000);
	   //ele.click();
	     driver.findElement(departuredate("2023", "September", "16")).click();
	    WebElement passangers= driver.findElement(By.xpath("//div[text()='Passengers']"));
	    passangers.click();
	     Thread.sleep(2000);
	   WebElement plusone=  driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
	   WebElement minusone=driver.findElement(By.xpath("//div[@data-testid='Adult-testID-minus-one-cta']"));
	 
	  
	     passangers.click();
	     driver.findElement(By.xpath("//div[text()='Currency']")).click();
	     List<WebElement> elems=driver.findElements(By.cssSelector("div[class*='r-1habvwh r-1loqt21']"));
	     List<String> currencies=new ArrayList<>();
	     System.out.println("Before sorting: -");
	     for(int i=0;i<elems.size();i++) {
//	       if(elems.get(i).getText().equals("HKD")) {
//	     	  elems.get(i).click();
//	     	  break;
//	       }
	    	currencies.add(elems.get(i).getText());
	    	System.out.println(currencies.get(i));
	     }
	     Collections.sort(currencies);
	     System.out.println("After Sorting : -");
	     for(int j=0;j<currencies.size();j++) {
	    	 System.out.println(currencies.get(j));
	     }
	     
	    
//	List<WebElement> relation= driver.findElements(By.xpath("//div[contains(@style,'grid-template-columns')]//*[local-name()='svg']"));
//	relation.get(0).click();  
//	
//	driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	Thread.sleep(3000);
	     driver.quit();

	}
	
	public static By departuredate(String year,String month, String date) {
		By b=By.xpath("//div[contains(@data-testid,'"+month+"-"+year+"')]//child::div[contains(@data-testid,'day-"+date+"')]");
		return b;
	}

}
