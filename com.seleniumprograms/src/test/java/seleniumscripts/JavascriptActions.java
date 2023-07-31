package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.JavascriptMethods;

public class JavascriptActions extends Setup {

	@Test
	public static void actions() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		
		WebElement login = driver.findElement(By.linkText("Create new account"));
		JavascriptMethods.scrolldowntoelement(driver, login);
		
	}

}
