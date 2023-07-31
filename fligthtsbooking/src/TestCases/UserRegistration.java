package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExtentReportListener.ExtentReporterNG;
import baseclass.TestBase;
import pages.LoginPage;
import pages.RegistrationPage;



public class UserRegistration extends TestBase {

	
	LoginPage loginPage;
	RegistrationPage registration;
	
	public UserRegistration() {
		super();
	}
	
	
	@BeforeTest
	public void setUp() {
		initialization();
//		testUtil = new TestUtil();
//		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		registration=new RegistrationPage();
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertTrue(title.contains(" Log In"));
		System.out.println("This is title");
		long l=Thread.currentThread().getId();
		System.out.println(l);
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2,dataProvider ="regis")
	public void register(String name, String contact, String email, String password,String dob,String gend) throws IOException {
		registration.registration(name, contact, email, password,dob,gend);
		
		
		Assert.assertTrue(driver.getCurrentUrl().contains("success"));
	}
	
	
	
	@DataProvider(name="regis")
	public Object[][] dataprovider(){
		
		Object [][] data=new Object[2][6];
		data[0][0]="Jayesh Patel";
		data[0][1]="9823245098";
		data[0][2]="jayeshpe55@gmail.com";
		data[0][3]="927380Jit#";
		data[0][4]="16/11/1966";
		data[0][5]="Male";
		data[1][0]="rahul patil";
		data[1][1]="9823245088";
		data[1][2]="jayatle56@gmail.com";
		data[1][3]="927380Jit*";
		data[1][4]="16/11/1996";
		data[1][5]="Male";
		
		return data;
	}
	
	
	
	
	
	

}

