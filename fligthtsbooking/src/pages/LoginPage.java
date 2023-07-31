package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//i[@class='fa fa-gear']")
	WebElement setting;
	
	@FindBy(xpath="//a[text()=' Logout']")
	WebElement Logout;
//	By emailid=By.xpath("//input[@type='email']");
//	By password=By.xpath("//input[@type='password']");
//	By submit=By.xpath("//button[@type='submit']");
//	By setting=By.xpath("//i[@class='fa fa-gear']");
//	By Logout=By.xpath("//a[text()=' Logout']");
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public String login(String email, String pass) {
//	driver.findElement(emailid).sendKeys(email);
//	driver.findElement(password).sendKeys(pass);
//	driver.findElement(submit).click();
		emailid.sendKeys(email);
		password.sendKeys(pass);
		submit.click();
		return driver.getTitle();
	}
	public LoginPage Logout() {
		Actions act= new Actions(driver);
		//act.moveToElement(driver.findElement(setting));
		act.moveToElement(setting);
		act.build().perform();
		Logout.click();
		//driver.findElement(Logout).click();
		return new LoginPage();
	}
}
