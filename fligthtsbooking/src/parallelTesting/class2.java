package parallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {

	@Test
	public void facebookpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		String str=driver.getTitle();
		long l=Thread.currentThread().getId();
		System.out.println("This is facebook page "+ str+" current Thread :- "+ l);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
