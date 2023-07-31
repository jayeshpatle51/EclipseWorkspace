package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShadowDom extends Setup {




	@Test(enabled = false)
	public static void shadowDomExample1() throws InterruptedException {

		driver.get("https://books-pwakit.appspot.com/");

		WebElement shadowhost = driver.findElement(By.tagName("book-app"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		SearchContext rootnode = (SearchContext) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowhost);
		// se.findElement(By.cssSelector("app-header"));
		WebElement appheader = rootnode.findElement(By.cssSelector("app-header"));
		WebElement toolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement inputdecorator = toolbar.findElement(By.tagName("book-input-decorator"));

		WebElement speechmic = inputdecorator.findElement(By.tagName("speech-mic"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		SearchContext shadowRoot2 = (SearchContext) js1.executeScript("return arguments[0].shadowRoot", speechmic);

		String title = speechmic.findElement(By.cssSelector("button")).getAttribute("title");
		System.out.println(title);

		// inputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Selenium");
//		SearchContext se = shadowhost.getShadowRoot();
//
//		se.findElement(By.cssSelector("input#input")).sendKeys("Selenium");
		// JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		Thread.sleep(3000);
	}


	@Test(enabled = false)
	public static void shadowDomExample2() throws InterruptedException {

		driver.get("http://watir.com/examples/shadow_dom.html");

		WebElement shadowhost = driver.findElement(By.xpath("//div[@id='shadow_host']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		SearchContext shadowroot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowhost);

		shadowroot.findElement(By.cssSelector("input[type='text']")).sendKeys("Java programs");

		// SearchContext se = shadowhost.getShadowRoot();

//		By by=By.xpath("//input[@type='text']");
//		se.findElement(by).sendKeys("selenium");
		// se.findElement(By.cssSelector("input[type='text']")).sendKeys("Selenium");

		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		// JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		Thread.sleep(3000);
	}


	@Test(enabled = true)
	public static void shadowDomExample3() throws InterruptedException {

		driver.get("chrome://downloads/");


		WebElement shadowhost = driver.findElement(By.xpath("//downloads-manager"));

//		SearchContext ele = shadowhost.getShadowRoot();
//		ele.findElement(By.cssSelector("input#searchInput")).sendKeys("Myfiles");

		String jsscript = "return document.querySelector('downloads-manager')"
				+ ".shadowRoot.querySelector('downloads-toolbar')" + ".shadowRoot.querySelector('cr-toolbar')"
				+ ".shadowRoot.querySelector('cr-toolbar-search-field')"
				+ ".shadowRoot.querySelector('input#searchInput')";

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement element = (WebElement) jsExecutor.executeScript(jsscript);
		element.sendKeys("selenium");

		Thread.sleep(3000);
	}

}
