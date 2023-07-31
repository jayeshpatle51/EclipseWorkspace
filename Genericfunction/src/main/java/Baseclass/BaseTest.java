package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;

	public static void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void closeDriver() {
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
