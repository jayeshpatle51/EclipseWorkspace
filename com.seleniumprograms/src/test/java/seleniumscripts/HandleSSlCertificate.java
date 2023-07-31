package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSlCertificate {

	@Test
	public static void handlesslcert() throws InterruptedException {
//		DesiredCapabilities handlSSLErr = new DesiredCapabilities();
//
//		handlSSLErr.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		WebDriverManager.chromedriver().setup();
		// WebDriver driver =
		// WebDriverManager.chromedriver().capabilities(handlSSLErr).create();
		// manager.setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://expired.badssl.com/");

		Thread.sleep(5000);

		driver.quit();
	}
}
