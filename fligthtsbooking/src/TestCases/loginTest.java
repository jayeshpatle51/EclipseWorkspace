package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ExtentReportListener.ExtentReporterNG;
import ExtentReportListener.TestNGItestListener;
import baseclass.TestBase;
import pages.LoginPage;
import pages.RegistrationPage;

public class loginTest  {
	LoginPage loginPage;

//	loginTest(){
//		super();
//	}
	
	//This is login test
	@BeforeTest
	public void setUp() {
		TestBase.initialization();
//		testUtil = new TestUtil();
//		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		System.out.println("Thread Id"+Thread.currentThread().getId());
		//registration=new RegistrationPage();
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException{
		
		String title = loginPage.validateLoginPageTitle();
		
		AssertJUnit.assertTrue(title.contains(" Log In"));
		Thread.sleep(3000);
//		loginPage.Logout();
//		String title1 = loginPage.validateLoginPageTitle();
//		Thread.sleep(3000);
	}
	
	@Test(priority=2,dataProvider = "login")
	public void verifylogin(String email,String password , String dashboard) {
		
		String title = loginPage.login(email, password);
		
		AssertJUnit.assertTrue(title.contains(dashboard));
	}
	@Test(priority=3)
	public void Logout() {
		
		loginPage.Logout();
		String title = loginPage.validateLoginPageTitle();
		AssertJUnit.assertTrue(title.contains(" Log In"));
	}
	@DataProvider(name="login")
	public Object[][] dataprovider(){
		
		Object [][] data=new Object[1][3];
		data[0][0]="jon123@gmail.com";
		data[0][1]="902177Jit#";
		data[0][2]="Dashboard";
		
		return data;
	}

	
	

	
}
