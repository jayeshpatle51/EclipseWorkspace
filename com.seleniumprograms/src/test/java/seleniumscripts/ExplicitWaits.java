package seleniumscripts;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ExplicitWaits extends SeleniumWaits {

	@Test(enabled = true)
	public static void waitforalert() throws InterruptedException {

		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("timerAlertButton")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		// System.out.println(waitforAlert(3000));

		// alert.accept();

	}

	@Test(enabled = false)
	public static void fluentwait2() {

		driver.get("https://demoqa.com/progress-bar");

		WebElement startbtn = driver.findElement(By.id("startStopButton"));
		startbtn.click();
		Wait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(Exception.class);

		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver t) {
				WebElement element = t.findElement(By.xpath("//div[@id='progressBar']//div"));

				String percent = element.getText();
				System.out.println(percent);
				if (Integer.parseInt(percent.replaceAll("[^0-9]", "")) >= 50) {
					// driver.findElement(By.id("resetButton")).click();
					t.findElement(By.id("startStopButton")).click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// startbtn.click();
					return true;
				}
				return false;

			}
		};

		fluentwait.until(function);
	}

	@Test(enabled = false)
	public static void fluentwait3() throws InterruptedException {

		driver.get("https://demoqa.com/progress-bar");

		WebElement startbtn = driver.findElement(By.id("startStopButton"));
		startbtn.click();
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(3000)).ignoring(Exception.class);

		fluentwait.until(ExpectedConditions.textToBe(By.xpath("//div[@id='progressBar']//div"), "100%"));

		// fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		driver.findElement(By.id("resetButton")).click();
	}

	public static boolean waitforAlert(long milliseconds) throws InterruptedException {

		long i = 0;

		while (i < milliseconds) {

			try {
				driver.switchTo().alert();
				return true;
			} catch (Exception c) {
				Thread.sleep(500);
				i += 500;
			}

		}
		return false;
	}
}
