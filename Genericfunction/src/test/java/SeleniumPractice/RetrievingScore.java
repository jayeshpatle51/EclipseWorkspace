package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrievingScore {

	public static void main(String[] args) throws InterruptedException {

//		BaseTest.launchBrowser("chrome");
		// WebDriver driver = BaseTest.driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cricbuzz.com/");
		String MatchName = "Australia v India - 4th Test";
		String titleverification = "aus-vs-ind-4th-test-australia-tour-of-india-2023";
		WebElement element = driver.findElement(By.xpath("//a[@title='" + MatchName + "']"));
		try {
			element.click();

		} catch (Exception e) {
			driver.findElement(By.xpath("//img[@gtm-title='View All']")).click();
			element.click();
		}
		boolean b = true;
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains(titleverification)) {

			System.out.println("Verification is successful");
		} else {
			b = false;
			System.out.println("Verification failed");
		}

		if (b) {
			driver.findElement(By.xpath("//a[text()='Scorecard']")).click();

			String status = driver.findElement(By.xpath("(//div[@url='/api/html/cricket-scorecard/60028']//div)[1]"))
					.getText();
			System.out.println("Result OF The Match :- " + status);
			String Team1innings = driver
					.findElement(By.xpath("//div[@id='innings_1']//div[contains(@class,'hdr-rw')]//span[1]")).getText();
			String Team1Score = driver
					.findElement(By.xpath("//div[@id='innings_1']//div[contains(@class,'hdr-rw')]//span[2]")).getText();
			System.out.println(Team1innings + " " + Team1Score);

		} else {

			System.out.println("Verification Failed");
		}

//		Actions act = new Actions(driver);
//		WebElement team = driver.findElement(By.linkText("Teams"));
//		act.moveToElement(team);
//		act.build().perform();
//		Thread.sleep(2000);
//		team.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a//img[@title='India']")).click();
		Thread.sleep(3000);
		// BaseTest.closeDriver();
		driver.quit();
	}

}
