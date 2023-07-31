package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class resetpassword extends TestBase {

	@FindBy(xpath="//a[text()='I forgot my password']")
	WebElement forgot_password_link;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='contact_number']")
	WebElement contact;
	
	@FindBy(xpath="//input[@id='popupDatepicker']")
	WebElement datepicker;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	

	@FindBy(xpath="//button[@type='submit']")
	WebElement submit1;
	
	public resetpassword() {
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public String validateforgotpasspage() {
		forgot_password_link.click();
		String title=driver.getTitle();
		return title;
	}
	public String resetpass(String email, String contacts,String date, String pass) {
		emailid.sendKeys(email);
		contact.sendKeys(contacts);
		datepicker.sendKeys(date);
		submit.click();
		password.sendKeys(pass);
		submit1.click();
		String st=driver.getCurrentUrl();
		
		return  st;
	}
}
