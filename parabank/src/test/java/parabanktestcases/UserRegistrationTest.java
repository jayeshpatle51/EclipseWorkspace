package parabanktestcases;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.parasoft.parabankPageclass.UserregPage;

import baseclass.TestBase;

public class UserRegistrationTest {
	UserregPage page;
	
	@BeforeTest
	public void OpenBrowser() {
		
		TestBase.initialization();
		
		page=new UserregPage();
	}
	@Test
	public void userregTest() {
		
		String str="Jitendra/Patel/gandhi chowk/Gondia/Maharashtra/441614/7841074181/123/Jitendra123/927380/927380";
		String [] arr=str.split("/");
		boolean b=page.Usercredentials(arr);
		
		Assert.assertTrue(b);
	}
	
 @AfterTest
 public void closeBrowser() {
	 page.teardown();
 }
}
