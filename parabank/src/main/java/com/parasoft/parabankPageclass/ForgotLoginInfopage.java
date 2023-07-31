package com.parasoft.parabankPageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class ForgotLoginInfopage extends TestBase {

	UserregPage reg=new UserregPage();
	@FindBy(linkText="Forgot login info?")
	WebElement forgetinfo;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement Lastname;
	
	@FindBy(id="address.street")
	WebElement address;
	
	@FindBy(id="address.city")
	WebElement city;
	
	@FindBy(id="address.state")
	WebElement state;
	
	@FindBy(id="address.zipCode")
	WebElement zipcode;
	
	@FindBy(id="ssn")
	WebElement ssn;
	
	@FindBy(xpath="//td//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//div[@id='rightPanel']//b[1]")
	WebElement getusername;
	
	@FindBy(xpath="//div[@id='rightPanel']//b[2]")
	WebElement getpassword;
	
	public ForgotLoginInfopage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean getLogininfo(String[] usercred) throws InterruptedException {
		
		forgetinfo.click();
		Thread.sleep(3000);
		firstname.sendKeys(usercred[0]);
		Lastname.sendKeys(usercred[1]);
		address.sendKeys(usercred[2]);
		city.sendKeys(usercred[3]);
		state.sendKeys(usercred[4]);
		zipcode.sendKeys(usercred[5]);
		ssn.sendKeys(usercred[6]);
		
		submit.click();
		boolean b=getusername.isDisplayed();
	String user=	getusername.getText();
		String pass=getpassword.getText();
		System.out.println("The given username and password are : "+user+" "+pass);
		return  b;
	}
}
