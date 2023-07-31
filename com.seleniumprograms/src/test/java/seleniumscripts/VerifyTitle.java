package seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.DriverUtils;

public class VerifyTitle extends Setup {


	@Test(priority = 0)
	public void  verifyPageTitle() throws InterruptedException, IOException {


		testCaseid = "7";

		driver.get(DriverUtils.getPropertyvalue("url"));

		String pagetitle = driver.getTitle();
		Cookie c = new Cookie("simple", "sglg");
//		driver.manage().addCookie(c);
//
//		String str = driver.manage().getCookieNamed("sgsg").getValue();
//		System.out.println(str);
		System.out.println(pagetitle);
		Assert.assertEquals("Google", pagetitle);
		Thread.sleep(1000);


	}

	@Test(priority = 1)
	public void getHomepage() throws InterruptedException {

		testCaseid = "6";
		Thread.sleep(1000);
		System.out.println("This is homepage");
		Thread.sleep(1000);
	}

}
