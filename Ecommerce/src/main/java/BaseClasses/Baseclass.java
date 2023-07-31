package BaseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;







public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	public Baseclass() {
		 
			prop = new Properties();
			try {
				FileInputStream ip = new FileInputStream("C:\\Users\\SPURGE\\eclipse-workspace\\Ecommerce\\src\\main\\resources\\configurationFiles\\Config.properties");
		      try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}
		
	
	
	public static void initialization() throws IOException{
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			WebDriverManager.firefoxdriver().setup();	
			driver = new FirefoxDriver(); 
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(prop.getProperty("implicitWait"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("explicitWait"))));
		
		driver.get(prop.getProperty("URL"));
		
	}
	
  
	
	public static void closebrowser() {
	
		driver.quit();
	}

}

