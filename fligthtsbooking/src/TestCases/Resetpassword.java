package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.TestBase;
import pages.LoginPage;
import pages.resetpassword;

public class Resetpassword extends TestBase {
LoginPage loginpage;
resetpassword reset;

	Resetpassword(){
		super();
	}
	@BeforeTest
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
		reset=new resetpassword();
		
		System.out.println("Thread Id"+Thread.currentThread().getId());
	}
	
	@Test(priority=2)
	public void verifyloginpage() {
		String s=reset.validateLoginPageTitle();
		Assert.assertTrue(s.contains(" Log In"));
	}
	
	@Test(priority=2)
	public void verifyrespasslink() {
		
		String str=reset.validateforgotpasspage();
		Assert.assertTrue(str.contains("Forgot"));
	}
	
	@Test(priority=3)
	public void resetPass() {
		
		String str=reset.resetpass("jayeshpatle51@gmail.com","9823245098","16-12-1996","927380Jit#");
		Assert.assertTrue(str.contains("password-set"));
	}
	
	


}
