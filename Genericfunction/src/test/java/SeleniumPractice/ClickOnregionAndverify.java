package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseclass.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnregionAndverify {

	public static void main(String[] args) throws InterruptedException {
//		BaseTest.launchBrowser("chrome");

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

//		driver.manage().window().maximize();
//
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// WebDriver driver = BaseTest.driver;
		// driver.get("https://petdiseasealerts.org/forecast-map#/heartworm-canine/dog/united-states");

		driver.get("https://google.com");
//		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
//		driver.switchTo().frame(iframe);
//		List<String> cityList = new ArrayList<>();
//		List<WebElement> cityelements = driver
//				.findElements(By.xpath("//*[@id='regions']//*[@class='region']//*[name()='path']"));
//
//		System.out.println(cityelements.size());
//
//		for (WebElement ele : cityelements) {
//			String city = ele.getAttribute("name");
//			cityList.add(city);
//			System.out.println(city);
//
//		}
//
//		List<String> randomcities = new ArrayList<>();
//		randomcities.addAll(Arrays.asList("District of Columbia"));

//		for (int i = 0; i < randomcities.size(); i++) {
//			for (int j = 0; j < cityelements.size(); j++) {
//				if (randomcities.get(i).equals(cityelements.get(j).getAttribute("name"))) {
//					Wait w=new WebDriverWait(driver, Duration.ofSeconds(10000));
//					w.until()
//
//					Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("g#california")));
//					// Thread.sleep(15000);
		try {
			// cityelements.get(j).sendKeys(Keys.ENTER);
//						a.moveToElement(cityelements.get(j)).click().build().perform();
			WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(60));
			wa.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("g#florida.region"))));
			// js.executeScript("arguments[0].click();", cityelements.get(j));
//						((JavascriptExecutor) driver).executeScript("arguments[0].click();",
//								));
			driver.findElement(By.cssSelector("g#florida.region")).click();
		} catch (Exception e) {

			e.printStackTrace();

		}

		Thread.sleep(2000);
//					System.out.println(driver.getCurrentUrl() + "  " + randomcities.get(i));
//					if (driver.getCurrentUrl().contains(randomcities.get(i))) {
//						System.out.println(randomcities.get(i) + " city is available");
//
//					}
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//a[text()='United States']")).click();
//					Thread.sleep(1000);
//					break;
//				}
//			}
//		}
		Thread.sleep(2000);
		BaseTest.closeDriver();

	}

}
