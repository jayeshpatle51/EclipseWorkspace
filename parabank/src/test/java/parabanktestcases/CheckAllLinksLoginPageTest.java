package parabanktestcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.parasoft.parabankPageclass.CheckAlllinksLoginPage;

import baseclass.TestBase;

public class CheckAllLinksLoginPageTest {
	
	CheckAlllinksLoginPage links;
	@BeforeTest
	public void openBrowser() {
		
		TestBase.initialization();
		links=new CheckAlllinksLoginPage();
	}

	@Test
	public void checkAlllinks() throws MalformedURLException,IOException {
		
	boolean b=	links.checkvalidlinks();
		Assert.assertTrue(b);
	}
	
	@AfterTest
	 public void closeBrowser() {
          links.teardown();
	 }
}
