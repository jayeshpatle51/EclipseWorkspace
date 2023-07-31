package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Baseclass.BaseTest;
import seleniumGenericMethods.SeleniumGenMethods;

public class IPLScoreCard {

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");

		WebDriver driver = BaseTest.driver;

		driver.get("https://www.cricbuzz.com");

		WebElement series = SeleniumGenMethods.findElementBy(By.xpath("//a[text()='Series']"), driver);

		Actions act = new Actions(driver);
		act.moveToElement(series).build().perform();
		act.click(series).build().perform();

		SeleniumGenMethods.findElementBy(By.xpath("//a[@title='Series Schedule']"), driver).click();
		SeleniumGenMethods.findElementBy(By.linkText("T20 Leagues"), driver).click();
		SeleniumGenMethods.findElementBy(By.xpath("//a//span[text()='Indian Premier League 2023']"), driver).click();

		SeleniumGenMethods.findElementBy(By.linkText("Schedule & Results"), driver).click();

		List<WebElement> dates = SeleniumGenMethods.findElementsBy(By.xpath("//div[contains(@class,'schedule-date')]"),
				driver);

		for (int i = 0; i < dates.size(); i++) {
			String str = dates.get(i).getText();
			System.out.println(str);
		}
		Thread.sleep(3000);
		BaseTest.closeDriver();

	}

}
