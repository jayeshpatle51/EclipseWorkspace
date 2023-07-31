package Mainproject.simpleproject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javascriptmethods.Myproject;

public class toolsqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/browser-windows");

        // Open new window by clicking the button
         //driver.findElement(By.id("tabButton")).click();
         //driver.findElement(By.id("windowButton")).click();
        // driver.findElement(By.id("messageWindowButton")).click();
        // String parentwindow=driver.getWindowHandle();
         
        Myproject.generatealert(driver, "alert generated");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
	}

}
