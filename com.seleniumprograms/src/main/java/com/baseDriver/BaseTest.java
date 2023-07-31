package com.baseDriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DriverUtils;

public class BaseTest {

	public static WebDriver driver;

	public static void launchBrowser() throws IOException {

		long implicitwait = Long.parseLong(DriverUtils.getPropertyvalue("implicitWait"));
		long pageLoadTimeout = Long.parseLong(DriverUtils.getPropertyvalue("pageLoadTimeout"));
		String browser = DriverUtils.getPropertyvalue("browser");

		if (browser.equals("chrome")) {

//			DesiredCapabilities handlSSLErr = new DesiredCapabilities();
//
//			handlSSLErr.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			// driver = WebDriverManager.chromedriver().create();
		} else if (browser.equals("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
	}

	public static void quitbrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
