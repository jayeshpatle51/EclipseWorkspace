package MobileTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SendMessageTest {

	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        
        dc.setCapability("appPackage", "com.android.messaging");
        dc.setCapability("appActivity", "com.android.messaging.ui.conversationlist.ConversationListActivity");

        URL url=new URL("http://127.0.0.1:4723/wd/hub/");
        AppiumDriver<WebElement> driver=new AppiumDriver<WebElement>(url,dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.messaging:id/start_new_conversation_button")).click();
		WebElement ele=driver.findElement(By.id("com.android.messaging:id/recipient_text_view"));
		ele.sendKeys("1234567");
		
		
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     
    WebElement element= driver.findElementById("com.android.messaging:id/action_add_more_participants");
     element.click();
     driver.findElementById("com.android.messaging:id/action_confirm_participants").click();
     driver.findElementById("com.android.messaging:id/compose_message_text").sendKeys("Hello world");
     driver.findElementById("com.android.messaging:id/send_message_button").click();
     Thread.sleep(3000);
		driver.quit();
        
	}

}
