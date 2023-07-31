package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclass.TestBase;

public class RegistrationPage extends TestBase {
  
	
	@FindBy
	(xpath="//a[text()='Register ']")
	WebElement registerbutton;
	
	@FindBy
	(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy
	(xpath="//input[@id='contact']")
	WebElement contact;
	
	@FindBy
	(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy
	(xpath="//input[@id='address']")
	WebElement password;
	
	@FindBy
	(xpath="//select[@name='gender']")
	WebElement gender;
	
	@FindBy
	(xpath="//input[@id='popupDatepicker']")
	WebElement DOB;
	
	@FindBy
	(xpath="//input[@id='flexCheckChecked']")
	WebElement checkbox;
	
	@FindBy
	(xpath="//input[@name='submit']")
	WebElement submit;
	
	public RegistrationPage() {
		//PageFactory page=new PageFactory();
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage registration(String username, String contactno,String emailadd,String Password,String date1,String gen) {
		registerbutton.click();
	
		name.sendKeys(username);
	
	
		contact.sendKeys(contactno);
	
	
		email.sendKeys(emailadd);
	
	
		password.sendKeys(Password);
		Select Gender=new Select(gender);
		Gender.selectByVisibleText(gen);
		
		//DOB.click();
		//date1="16/11/1996";
		selectDatebyjs(driver,DOB,date1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		if(!checkbox.isSelected()) {
		checkbox.click();
		}
		submit.click();
		
		return new LoginPage();
	}
	public static void selectDatebyjs(WebDriver driver,WebElement element,String date) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}
	
}
