package Mainproject.simpleproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class selectdatewithjsexecutor extends Baseclass {

	@Test
	public  static void selectDate () throws InterruptedException  {
		
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Hyderabad");
		
	    List<WebElement>  suggetion = driver.findElement(By.xpath("//ul[@id='ui-id-1']"))
	         .findElements(By.tagName("li"));
		suggetion.get(1).click();
	    Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Mumbai");
			 
	    List<WebElement>  suggetion1 = driver.findElement(By.xpath("//ul[@id='ui-id-2']"))
	         .findElements(By.tagName("li"));
	    suggetion1.get(1).click();
	    
		WebElement element=driver.findElement(By.xpath("//input[@id='datepicker1']"));
		String date="19-03-2022";
		selectDatebyjs(driver,element,date);
		Thread.sleep(2000);
		
		WebElement element1=driver.findElement(By.xpath("//input[@id='datepicker2']"));
		String date1="20-03-2022";
		selectDatebyjs(driver,element1,date1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@onclick='javascript:validateSearch();']")).click();
		Thread.sleep(2000);
		
	}
	public static void selectDatebyjs(WebDriver driver,WebElement element,String date) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}
}
