package Generic_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Crossbrowser {
	WebDriver driver;
	@Test
	@Parameters(value={"Browser","url"})
	public void openBrowser(String browser, String url) {
		Thread th=Thread.currentThread();
		System.out.println(th.getId());
		if(browser.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get(url);
		}
		if(browser.equals("firefox")) {
			System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get(url);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
   
}
