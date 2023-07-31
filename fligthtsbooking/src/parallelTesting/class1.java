package parallelTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1  {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void initialization(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver = new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

	@Test(priority=0)
	public void googlepage() throws InterruptedException {
		driver.get("http://google.com");
		String str=driver.getTitle();
		long l=Thread.currentThread().getId();
		System.out.println("This is google page "+ str+" current thread Id :- "+ l);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	@Test(priority=1)
	public void fireFoxbrowser() throws InterruptedException {
		
		
		driver.get("http://selenium.dev");
		String str=driver.getTitle();
		long l=Thread.currentThread().getId();
		System.out.println("This is selenium page "+ str+" current thread Id :- "+ l);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
