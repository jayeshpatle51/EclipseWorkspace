package parabanktestcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.parasoft.parabankPageclass.ForgotLoginInfopage;

import baseclass.TestBase;

public class ForgotLoginInfoTest {
	
	ForgotLoginInfopage info;
	@BeforeTest
	public void openBrowser() {
		
		TestBase.initialization();
		info=new ForgotLoginInfopage();
	}
	@Test(dataProvider="data")
	public void getLoginInfo(String arr[] ) throws InterruptedException {
		
		//String s=ForgotLoginInfopage.driver.getCurrentUrl();
	    Assert.assertTrue(info.getLogininfo(arr));
	}
	
	 @AfterTest
	 public void closeBrowser() {
           info.teardown();
	 }

	 @DataProvider(name="data")
		public Object[][] dataprovider() {
			String[][] obj=new String[1][7];
			String str="jitendra/Patel/gandhi chowk/Gondia/Maharashtra/441614/123";
			obj[0]=str.split("/");
			return obj;
		}
}
