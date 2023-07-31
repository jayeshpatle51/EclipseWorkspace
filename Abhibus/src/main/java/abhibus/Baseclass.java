package abhibus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.abhibus.util.TestUtil;
import com.abhibus.util.WebEventListener;



public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public Baseclass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/SPURGE/eclipse-workspace/Abhibus/src/main/java/configuraitionfiles/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
	
	
	public static void initialization() throws IOException{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
//	public static WebDriver driver;
//	static Properties prop;
	
	
//	public static String url="https://abhibus.com/";
//	@BeforeSuite
//	public void browserOpen() {
//		
//		
//		
//		
//		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get(url);
//		
//	}
//	
//	
//	@AfterSuite
//	public void closebrowser() {
//		driver.quit();
//	}

}

