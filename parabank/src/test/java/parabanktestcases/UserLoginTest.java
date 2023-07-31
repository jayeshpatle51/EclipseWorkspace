package parabanktestcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.parasoft.parabankPageclass.UserLogin;

import baseclass.TestBase;
import junit.framework.Assert;

public class UserLoginTest {
     UserLogin login;
	
	@BeforeTest
	public void openBrowser() {
		
		TestBase.initialization();
		login=new UserLogin();
	}
	@Test(priority=0,dataProvider="data")
	public void loginTest(String uname, String pword) {
		boolean b=login.Loginpage(uname, pword);
		Assert.assertTrue(b);
	}
	@Test(priority=1,enabled=false)
	public void logout() {
	 boolean b=	login.verifyloginPage();
	 Assert.assertTrue(b);
	}
	@DataProvider(name="data")
	public Object[][] dataprovider() {
		Object[][] obj=new Object[1][2];
		obj[0][0]="Jayesh123";
		obj[0][1]="927380";
		return obj;
	}
	
	 @AfterTest(enabled=false)
	 public void closeBrowser() {
		 login.teardown();
	 }
}
