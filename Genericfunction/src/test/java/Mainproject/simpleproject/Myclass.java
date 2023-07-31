package Mainproject.simpleproject;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

interface Enterprise{
	public void enterpise1();
	public void enterpise2();
	public void enterpise3();
	public void enterpise4();
	public void enterpise5();
	
}
abstract class Shop{
	public  Shop() {
		System.out.println("This is a constructor");
	}
	 static void method2() {
		System.out.println("This is a method 2");
	}
	public void method1() {
		System.out.println("This is shop m");
	}
}
class shop1 extends Shop{
	public void mobileShop() {
		System.out.println("This is mobile shop");
	}
	
}
class company{
	
	
	public void company1() {
		shop1 s3=new shop1();
		s3.method2();
		Shop s2=new shop1();
		s2.method1();
		System.out.println("This is company one");
	}
}
abstract class B {
	  //declaring inner class as abstract with abstract method
	    abstract class C {
	        abstract void myAbstractMethod();
	    }
	}
	class D extends B {
	    class E extends C {
	      // implementing the abstract method
	        void myAbstractMethod() { System.out.println("Inside abstract method implementation"); }
	    }
	}
	abstract class Demo {
	    abstract void m1();
	    abstract void m2();
	    abstract void m3();
	}
	abstract class FirstChild extends Demo {
		public FirstChild() {
			System.out.println("This is the constructor");
		}
	   public void mymethod() {
		   System.out.println("this is my method");
	   }
	}
	 
	class SecondChild extends FirstChild {
		public void m1() {System.out.println("Inside m1");}
	    public void m2() { System.out.println("Inside m2"); }
	    public void m3() { System.out.println("Inside m3"); }
	}
public class Myclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		String URL = "file://C:/Users/SPURGE/iframe.html";
		
		//Start Browser
		driver.get(URL);
		WebElement element=driver.findElement(By.xpath("//iframe[@id='IF1']"));
		driver.switchTo().frame(element);
		Actions act=new Actions(driver);
		act.moveByOffset(100, 100);
		act.build().perform();
		//WebElement ele=driver.findElement(By.xpath("//header//button[@class='modal__close']"));
	act.click();
	act.build().perform();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='navbar__search--input']"))));
	
	driver.findElement(By.xpath("//input[@class='navbar__search--input']")).sendKeys("kaue");
	
	}

}
