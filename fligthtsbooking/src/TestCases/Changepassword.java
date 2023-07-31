package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.TestBase;
import pages.LoginPage;
import pages.changepassword;

public class Changepassword extends TestBase{

	
	changepassword newpassword;
	loginTest login;
	
	
	Changepassword(){
		super();
	}
	@BeforeTest
	public void setUp() {
		initialization();
		
		newpassword=new changepassword();
		login=new loginTest();
		
		login.loginPage=new LoginPage();
		System.out.println("Thread Id"+Thread.currentThread().getId());
	}
	@Test(priority=0)
	public void validateloginpage() throws InterruptedException {
		
		login.loginPageTitleTest();
		
	}
	@Test(priority=1,dataProvider="changepass")
	public void changepass(String user,String pass,String dashboard,String oldpass,String newpass) {
		login.verifylogin(user, pass,dashboard);
		String str=newpassword.updatepass(oldpass, newpass);
		Assert.assertTrue(str.contains("updated"));
	}
	@DataProvider(name="changepass")
	public Object[][] dataprovider(){
		
		Object [][] data=new Object[1][5];
		data[0][0]="jayeshpatle51@gmail.com";
		data[0][1]="927380Jit#";
		data[0][2]="Dashboard";
		data[0][3]="927380Jit#";
		data[0][4]="927380Jit#";
		
		return data;
	}
	
	@Test(priority=2)
	public void logout() {
		login.Logout();
	}
	
	

}
