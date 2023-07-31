package practiceprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Combinations {
    
    
    public static void main (String args[]) throws Throwable
    {
       
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	
//    	Duration d=driver.manage().timeouts().getImplicitWaitTimeout();
//    	Duration d1=driver.manage().timeouts().getPageLoadTimeout();
    	
    	
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.get("http://google.com");
    	
    	WebElement ele=driver.findElement(By.name("q"));
    	Actions a=new Actions(driver);
    	
    	a.click(ele).
    	    	sendKeys("Bhaichara").
    	    	sendKeys(Keys.ENTER).perform();
    	
    	Thread.sleep(4000);
    	driver.quit();
    }
} 
