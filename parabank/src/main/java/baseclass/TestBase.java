package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.crm.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;






public class TestBase {
	
	public static WebDriver driver;
	//public static Properties prop;
	
	//public  static EventFiringDecorator e_driver;
	//public static WebEventListener eventListener;
	
	
	
//	public TestBase(){
//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("config.properties"));
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	

	public static void initialization(){
		//String browserName = prop.getProperty("browser");
		String browserName ="chrome";
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		
		//e_driver = new EventFiringDecorator();
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
		
		//e_driver.createDecorated(driver);
		//driver =  e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT ));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
		//driver.get(prop.getProperty("url"));
		driver.get("https://parabank.parasoft.com");
	}
	
	


	
	public void teardown() {
		driver.quit();
	}
	
	
	
}
