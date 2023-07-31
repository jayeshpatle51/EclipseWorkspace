package Mainproject.simpleproject;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {
	static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.com");
	 driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://facebook.com");
	
	
	By register=By.xpath("//a[text()='Create New Account']");
	By firstname=By.xpath("//input[@name='firstname']");
	By lastname=By.xpath("//input[@name='lastname']");
	By number=By.xpath("//input[@name='reg_email__']");
	By password=By.xpath("//input[@id='password_step_input']");
	By gender=By.xpath("//label[text()='Male']");
	
	By date=By.xpath("//select[@id='day']");
	By month=By.xpath("//select[@id='month']");
	By year=By.xpath("//select[@id='year']");
	
	
    getElement(register).click();
    getElement(firstname).sendKeys("jayesh");
    getElement(lastname).sendKeys("patle");
    getElement(number).sendKeys("7972445239");
    getElement(password).sendKeys("124567");
    getElement(gender).click();
    
    
	dropdownValue(date,"index","15");
	dropdownValue(month,"value","11");
	dropdownValue(year,"visibleText","1996");
	
}
	
public static void dropdownValue(By locator,String type,String value ) {
		Select select=new Select(getElement(locator));
		switch(type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			
			select.selectByValue(value);
			
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;
		default :
			System.out.println("please select right value");
			break;
		}
	}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}

	}
