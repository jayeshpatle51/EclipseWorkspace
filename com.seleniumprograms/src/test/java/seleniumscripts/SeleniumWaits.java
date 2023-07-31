package seleniumscripts;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.JavascriptMethods;

public class SeleniumWaits {

	static WebDriver driver = null;

	@BeforeMethod
	public static void launchbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(enabled = false)
	public static void implicitWait() throws InterruptedException {


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		// Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("API Testing");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']//span"));

		for (int i = 0; i < list.size(); i++) {
			WebElement elm = driver
					.findElement(By.xpath("(//ul[@class='G43f7e']//div[@class='wM6W7d']//span)[" + (i + 1) + "]"));
			System.out.println(elm.getText());
		}
		System.out.println(list.size());
		// driver.quit();
	}

	@Test(enabled = false)
	public static void explicitWait() {

		driver.get("https://demoqa.com/dynamic-properties");

		JavascriptMethods.scrollintoview(driver);
		By elementby = By.xpath("//button[@id='visibleAfter']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		wait.until(ExpectedConditions.visibilityOfElementLocated(elementby));

		String text = driver.findElement(elementby).getText();
		System.out.println(text);
	}

	@Test(enabled = false)
	public static void fluentWait() {

		driver.get("https://demoqa.com/dynamic-properties");

		JavascriptMethods.scrollintoview(driver);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(25))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);

		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver arg0) {
				WebElement element = arg0.findElement(By.id("colorChange"));

				String color = element.getCssValue("color");
				Colors c = Colors.dark;
				// JavascriptMethods.changecolor(c.getColour(), element, arg0);
				JavascriptMethods.changeTextColour(c.getColour(), element, arg0);
				String col = Color.fromString(color).asHex();

				System.out.println("The color if the button is " + color);
				Colors act = Colors.red;

				if (col.equals(act.getColour())) {
					return true;
				}
				return false;
			}
		};

		wait.until(function);

	}

	@Test(enabled = false)
	public static void explicitWait2() throws InterruptedException {

		driver.get("https://jqueryui.com/progressbar/");

		driver.findElement(By.xpath("//ul//li//a[text()='Custom Label']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		// WebElement element =
		// driver.findElement(By.xpath("//div[@class='progress-label']"));
		By by = By.xpath("//div[text()='Complete!']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(by));

		// String text =
		driver.findElement(By.xpath("//div[text()='Complete!']")).getText();
		// System.out.println(text);

	}

	@Test(enabled = false)
	public static void explicitwaitforalert() throws InterruptedException {

		driver.get("https://www.facebook.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert alert = null;
		for (int i = 1000; i < 10000; i = i + 1000) {
			Thread.sleep(1000);
			if (i == 6000) {
				JavascriptMethods.generatealert(driver, "alert Generated");
				Thread.sleep(2000);
				break;
			}
			System.out.println("alert not present in " + i + " seconds");

		}
		alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.accept();

	}

	@AfterMethod
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);

		driver.quit();
	}

}
