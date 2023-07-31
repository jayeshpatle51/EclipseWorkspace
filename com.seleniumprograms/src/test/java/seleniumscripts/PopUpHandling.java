package seleniumscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling {
	static WebDriver driver = null;

	@Test
	public static void popuphandle() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		// options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// driver.get("https://www.facebook.com");
		driver.get("chrome://downloads/");
//		String javascript = "document.getElementByName('q')";
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		WebElement element = (WebElement) jsExecutor.executeScript(javascript);
//		element.sendKeys("selenium");
//
//		Thread.sleep(3000);
//
//		driver.quit();

	}

}
