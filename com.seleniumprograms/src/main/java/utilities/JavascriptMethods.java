package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptMethods {

	public static void flash(WebElement element, WebDriver driver) throws InterruptedException {
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changecolor("#000000", element, driver);
			Thread.sleep(1000);
			changecolor(bgcolor, element, driver);

		}
	}

	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}

	public static void changeTextColour(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.color = '" + color + "'", element);
	}
	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("arguments[0].style.border= '6px solid red'", element);

	}

	public static String gettitle(WebDriver driver) {
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		String title = js2.executeScript("return document.title;").toString();
		return title;

	}

	public static void clickbyjs(WebElement element, WebDriver driver) {
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("arguments[0].click();", element);
	}

	public static void generatealert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void refreshpage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go()");
	}

	public static void scrollintoview(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,300)");

	}

	public static void scrolltopagedown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrolldowntoelement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
