package library;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abhibus.Baseclass;

public class userlogin extends Baseclass{
	
	@FindBy(xpath="//a[@id='navbarDropdown']")
	WebElement loginlink;
	
	@FindBy(xpath="//img[@src='https://static.abhibus.com/img/icons/google-32.png']")
	WebElement signwithgmail;
	
	public userlogin(){
		PageFactory.initElements(driver, this);
	}
	public void clickonlogin()
	
	{
		String str=driver.getWindowHandle();
		System.out.println("window : "+ str);
		loginlink.click();
	}
	public void signwithgoogle()
	{
		Set<String> str=driver.getWindowHandles();
		for(String st3:str) {
		System.out.println("Window 1 : " + st3);
		}
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9823245098");
		String stt=signwithgmail.getAttribute("src");
		System.out.println(stt);
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jayeshpatle51@gmail.com");
//		Set<String> set=driver.getWindowHandles();
//		for(String str2:set) {
//			System.out.println("window 2: "+str2);
//		}
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jayeshpatle51@gmail.com");
//		Object[] strr=set.toArray();
//		
//		String window1 =strr[0].toString();
//		String window2 =strr[1].toString();
//		driver.switchTo().window(window2);
//		String title=driver.getTitle();
//		if(title.contains("Sign in"))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}

}
