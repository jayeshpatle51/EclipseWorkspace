package com.Ecommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.Baseclass;

public class NewUserRegistrationpage {
	
	
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cnfmPassword;
	
	@FindBy(xpath="/input[@name ='newsletter' and @value='0']")
	WebElement yesRadiobtn;
	
	@FindBy(xpath="/input[@name ='newsletter' and @value='1']")
	WebElement noRadiobtn;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreeCheckbox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitcon;
	
	public NewUserRegistrationpage(WebDriver driver) {
		Baseclass.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void newUserRegistration(String [] data) {
		myAccount.click();
		register.click();
		firstname.sendKeys(data[0]);
		lastname.sendKeys(data[1]);
		email.sendKeys(data[2]);
		telephone.sendKeys(data[3]);
		password.sendKeys(data[4]);
		cnfmPassword.sendKeys(data[5]);
		yesRadiobtn.click();
		agreeCheckbox.click();
		submitcon.click();
		
	}
}
