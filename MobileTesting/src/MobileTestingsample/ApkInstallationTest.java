package MobileTestingsample;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApkInstallationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("platformVersion", "Android 11.0");
		cap.setCapability("deviceName", "Android Emulator");
		
		cap.setCapability("app", "D:\\apkFiles\\chess-2-8-1.apk");
		
		URL url=new URL("http://www.google.com");
       
	 AndroidDriver<MobileElement> driver=new AndroidDriver<>(url,cap);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}

}
