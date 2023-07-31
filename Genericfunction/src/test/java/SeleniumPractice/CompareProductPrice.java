package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import Baseclass.BaseTest;

public class CompareProductPrice {

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://www.amazon.in/");

		String productname = "iqoo z6 pro 5g";
		WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search1.sendKeys(productname);
		search1.sendKeys(Keys.ENTER);

		String priceofProOnamazon = driver.findElement(By.xpath(
				"//a[contains(@href,'/iQOO-Phantom-Snapdragon-FlashCharge-Brightness/dp/B07WHSJXLF/')]//span[@class='a-price-whole']"))
				.getText();
		System.out.println(priceofProOnamazon);
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.flipkart.com");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement search2 = driver.findElement(By.xpath("//input[@name='q']"));
		search2.sendKeys(productname);
		search2.sendKeys(Keys.ENTER);

		String priceofProOnflipkart = driver
				.findElement(By.xpath("//a[contains(@href,'pid=MOBGHBNGF7MESSFC')]//div[@class='_30jeq3 _1_WHN1']"))
				.getText();
		System.out.println(priceofProOnflipkart);
		int cheaper = 0;
		priceofProOnamazon = priceofProOnamazon.replace(",", "");
		priceofProOnflipkart = priceofProOnflipkart.replaceAll("[^0-9]", "");
		int priofpro1 = Integer.parseInt(priceofProOnamazon);
		int priofpro2 = Integer.parseInt(priceofProOnflipkart);
		if (priofpro1 == priofpro2) {
			cheaper = priofpro1;
			System.out.println("Product availabe in Amazon and flipkart for same price at " + cheaper);
		}
		if (priofpro1 < priofpro2) {
			cheaper = priofpro1;
			System.out.println("Amazon's product is at cheaper price " + cheaper);
		} else {
			cheaper = priofpro2;
			System.out.println("flipkart's product is at cheaper price " + cheaper);
		}

		Thread.sleep(2000);
		BaseTest.closeDriver();
	}
}
