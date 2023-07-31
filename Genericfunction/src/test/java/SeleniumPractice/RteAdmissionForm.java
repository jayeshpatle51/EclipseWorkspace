package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import Baseclass.BaseTest;
import javascriptmethods.Myproject;

public class RteAdmissionForm {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://rte25admission.maharashtra.gov.in/adm_portal/users/rteindex");
		driver.findElement(By.xpath("//img[@src='/adm_portal/img/applyIcon.png']")).click();
		boolean b = false;
		if (driver.getCurrentUrl().contains("login")) {
			b = true;
		}

		String appNo = "23GO005543";
		String password = "901849Lov#";
		if (b) {
			driver.findElement(By.id("UserLoginApplicationNo")).sendKeys(appNo);
			driver.findElement(By.id("UserLoginAppPasswd")).sendKeys(password);
			WebElement captcha = driver.findElement(By.id("captcha_image"));
//captcha.getScreenshotAs(null)
			// TakesScreenshot sc = (TakesScreenshot) driver;
			File file = captcha.getScreenshotAs(OutputType.FILE);

			File outputFile = new File("D:\\eclipse-workspace\\Genericfunction\\screenshots\\newElement.png");

			FileUtils.copyFile(file, outputFile);
			// driver.findElement(By.xpath("//input[@type='submit']")).submit();
			driver.switchTo().newWindow(WindowType.TAB).get("https://www.editpad.org/tool/extract-text-from-image");

			String fileloc = "D:\\eclipse-workspace\\Genericfunction\\screenshots\\newElement.png";
			Robot ro = new Robot();
			System.out.println(fileloc);
			WebElement inputurl = driver.findElement(By.id("inputURL"));
			inputurl.sendKeys(fileloc);
			String s = inputurl.getAttribute("value");
			Actions act = new Actions(driver);
			act.doubleClick(inputurl).build().perform();
			// inputurl.click();
			System.out.println(s);
//			ro.keyPress(KeyEvent.VK_TAB);
//			ro.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);

			act.keyDown(Keys.CONTROL).sendKeys("A").build().perform();

			act.keyUp(Keys.CONTROL).build().perform();

			act.keyDown(Keys.CONTROL).sendKeys("C").build().perform();
			act.keyUp(Keys.CONTROL).build().perform();
			driver.findElement(By.id("uploadBtn")).click();
			Thread.sleep(2000);
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_CONTROL);
			ro.keyRelease(KeyEvent.VK_V);
			ro.keyPress(KeyEvent.VK_TAB);
			ro.keyRelease(KeyEvent.VK_TAB);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);

			// Myproject mypro=new Myproject();
			Myproject.scrollintoview(driver);
			driver.findElement(By.id("sentence")).click();
			String captchavalue = driver.findElement(By.id("result")).getText();
			System.out.println(captchavalue);
//			driver.switchTo().defaultContent();
//
//			driver.findElement(By.id("input")).sendKeys(captchavalue);
//			driver.findElement(By.xpath("//input[@value='Login']")).click();
		}
		Thread.sleep(3000);
		BaseTest.closeDriver();

	}

}
