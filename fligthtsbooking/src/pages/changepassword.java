package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class changepassword extends TestBase{
	
	@FindBy(xpath="//i[@class='fa fa-gear']")
	WebElement settingicon;
	
	@FindBy(xpath="//a[@href='http://flights.qedgetech.com/change-password.html']")
	WebElement changepassword;
	
	@FindBy(xpath="//input[@name='old_password']")
	WebElement oldpassword;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement newpassword;
	
	@FindBy(xpath="//input[@id='confirm_password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement updatebutton;
	
	public changepassword() {
		PageFactory.initElements(driver, this);
	}
	
	public String updatepass(String oldpass,String newpass) {
		
		settingicon.click();
		changepassword.click();
		oldpassword.sendKeys(oldpass);
		newpassword.sendKeys(newpass);
		confirmpassword.sendKeys(newpass);
		updatebutton.click();
		String str=driver.getCurrentUrl();
		return str;
	}
	

}
