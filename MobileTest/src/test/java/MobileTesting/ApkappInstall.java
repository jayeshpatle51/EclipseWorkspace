package MobileTesting;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class ApkappInstall {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		// TODO Auto-generated method stub


		
		DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
       // dc.setCapability(MobileCapabilityType.APP, "D:\\apkFiles\\google-chrome-105-0-5195-79.apk");
        //ChromeOptions options=new ChromeOptions();
       // options.setExperimentalOption("androidPackage", "com.android.chrome");
       // dc.setCapability(ChromeOptions.CAPABILITY, options);

        
        //dc.setCapability("chromeOptions", ImmutableMap.of("w3c",false));
       // URL url=new URL("http://127.0.0.1:4723/wd/hub/");
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
//        AppiumDriver<WebElement> driver=new AppiumDriver<WebElement>(url,dc);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");

     Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
