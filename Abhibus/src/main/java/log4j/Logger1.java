package log4j;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logger1 {
	public static void main(String[] args) {

	
	Logger logger= Logger.getLogger("Logger1");
	DOMConfigurator.configure("log4j.properties");
	
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	logger.info("browser open");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http:/flights.qedgetech.com");
	
	logger.info("login");
	driver.findElement(By.name("email")).sendKeys("jayeshpatle51@gmail.com");
	driver.findElement(By.name("password")).sendKeys("927380Jit#");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
