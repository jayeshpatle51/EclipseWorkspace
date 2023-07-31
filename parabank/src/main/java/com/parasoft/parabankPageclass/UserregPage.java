package com.parasoft.parabankPageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class UserregPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerlink;
	
	@FindBy(id="customer.firstName")
	WebElement firstname;
	
	@FindBy(id="customer.lastName")
	WebElement Lastname;
	
	@FindBy(id="customer.address.street")
	WebElement Address;
	
	@FindBy(id="customer.address.city")
	WebElement City;
	
	@FindBy(id="customer.address.state")
	WebElement State;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phonenumber;
	
	@FindBy(id="customer.ssn")
	WebElement ssn;
	
	@FindBy(id="customer.username")
	WebElement username;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="repeatedPassword")
	WebElement repeatpassword;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement submit;
	
	@FindBy(xpath="//p[@class='smallText']")
	WebElement welcome;
	public UserregPage(){
		PageFactory.initElements(driver, this);
	}
   public boolean Usercredentials(String [] arr) {
	   
	   registerlink.click();
	   firstname.sendKeys(arr[0]);
	   Lastname.sendKeys(arr[1]);
	   Address.sendKeys(arr[2]);
	   City.sendKeys(arr[3]);
	   State.sendKeys(arr[4]);
	   zipcode.sendKeys(arr[5]);
	   phonenumber.sendKeys(arr[6]);
	   ssn.sendKeys(arr[7]);
	   username.sendKeys(arr[8]);
	   password.sendKeys(arr[9]);
	   repeatpassword.sendKeys(arr[10]);
	   submit.click();
       boolean b=welcome.isDisplayed();
       return b;
   }
}
