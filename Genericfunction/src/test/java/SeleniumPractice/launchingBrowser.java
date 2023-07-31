package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchingBrowser {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			System.setProperty("webDriver.chrome.driver", "D://chromeDriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to("https://www.google.com");

			driver.quit();
		} catch (Exception e) {

			driver.quit();
			e.printStackTrace();
		}

	}

}
