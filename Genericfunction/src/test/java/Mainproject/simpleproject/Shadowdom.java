package Mainproject.simpleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class Shadowdom {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://books-pwakit.appspot.com/");

		// driver.get("https://google.com");
		WebElement root = driver.findElement(By.tagName("book-app"));
		SearchContext el = root.getShadowRoot();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		SearchContext shadowRoot1 = (SearchContext) js.executeScript("return arguments[0].shadowRoot", root);
//		 WebElement shadowDom1 = shadowRoot1.findElement(By.cssSelector("#shadowcontentcss"));
//		 WebElement ShadowDom1= (WebElement) js.executeScript("return arguments[0].shadowRoot",root);

//		WebElement appheader = shadowRoot1.findElement(By.cssSelector("app-header"));
//		WebElement toolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
//		WebElement inputdecorator = toolbar.findElement(By.tagName("book-input-decorator"));
//		WebElement speechmic = inputdecorator.findElement(By.tagName("speech-mic"));

//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		SearchContext shadowRoot2 = (SearchContext) js1.executeScript("return arguments[0].shadowRoot", inputdecorator);
		// shadowRoot2.findElement(By.cssSelector("button[title='Search by
		// voice']")).click();
		el.findElement(By.cssSelector("input#input")).sendKeys("Books");
		// inputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Books");

		Thread.sleep(4000);
		BaseTest.closeDriver();
		// driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Hyderabad");
	}

}
