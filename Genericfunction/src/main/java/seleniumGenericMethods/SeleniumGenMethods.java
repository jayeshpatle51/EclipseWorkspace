package seleniumGenericMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumGenMethods {
	static WebDriver driver;

	public static WebElement findElementBy(By by, WebDriver ldriver) {

		driver = ldriver;
		return driver.findElement(by);
	}

	public static List<WebElement> findElementsBy(By by, WebDriver ldriver) {
		driver = ldriver;
		return driver.findElements(by);
	}

	public static boolean isAlertPresent(WebDriver driver) {

		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
