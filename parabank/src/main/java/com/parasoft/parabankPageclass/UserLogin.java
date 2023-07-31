package com.parasoft.parabankPageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class UserLogin extends TestBase{
	@FindBy(xpath="//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@class='button']")
	WebElement login;
	
	@FindBy(xpath="//p[@class='smallText']")
	WebElement welcome;
	
	@FindBy(xpath="//a[@ href='/parabank/logout.htm']")
	WebElement logout;
	
	@FindBy(xpath="//div[@id='leftPanel']")
	WebElement loginpanel;
	public UserLogin(){
		
		PageFactory.initElements(driver, this);
	}
	public boolean verifyloginPage() {
		logout.click();
		boolean login=loginpanel.isDisplayed();
		return login;
	}
	public boolean Loginpage(String str1,String str2) {
		Username.sendKeys(str1);
		Password.sendKeys(str2);
		login.click();
		boolean b=welcome.isDisplayed();
		return true;
	}
	public void logOut() {
		logout.click();
	}

}
