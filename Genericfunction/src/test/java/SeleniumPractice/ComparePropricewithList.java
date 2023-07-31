package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import Baseclass.BaseTest;

public class ComparePropricewithList {

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://www.amazon.in/");

		String productname = "samsung s22";
		WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search1.sendKeys(productname);
		search1.sendKeys(Keys.ENTER);

		List<String> productnames = new ArrayList<>();
		List<String> productprice = new ArrayList<>();

		boolean flag = true;
//		while (flag) {
//			try {
//				WebElement element = driver.findElement(By.xpath("//div[@data-cel-widget='search_result_" + i
//						+ "']//a//span[@class='a-size-medium a-color-base a-text-normal']"));
//				WebElement priceele = driver.findElement(
//						By.xpath("//div[@data-cel-widget='search_result_" + i + "']//span[@class='a-price-whole']"));
//
//				productnames.add(element.getText());
//				productprice.add(priceele.getText());
//			} catch (Exception e) {
//				flag = false;
//			}
//			i++;
//		}
		String commXpath = "(//div[@data-component-id and @data-cel-widget])";
		List<WebElement> prolistonamazon = driver
				.findElements(By.xpath("//div[@data-component-id and @data-cel-widget]"));
		for (int k = 0; k < prolistonamazon.size(); k++) {
			String name = driver.findElement(By
					.xpath(commXpath + "[" + (k + 1) + "]//a//span[@class='a-size-medium a-color-base a-text-normal']"))
					.getText();
			productnames.add(name);

			String price = driver.findElement(By.xpath(
					commXpath + "[" + (k + 1) + "]//div[contains(@class,'micro')]//span[@class='a-price-whole']"))
					.getText();
			productprice.add(price);
			// System.out.println(name + " " + price);
		}
		String prodname1 = "Samsung Galaxy S22 5G";
		String col = "Phantom Black";
		String stor1 = "128GB";
		// String actproductname = "Samsung Galaxy S22 5G (Phantom Black";
		int priceonAmazon = 0;
		int priceonflipkart = 0;

		for (int j = 0; j < productnames.size(); j++) {
			String s = productnames.get(j);
			if (s.contains(prodname1) && s.contains(col) && s.contains(stor1)) {
				System.out.println(s);
				priceonAmazon = Integer.parseInt(productprice.get(j).replace(",", ""));
				break;
			}
			System.out.println(s + " " + productprice.get(j));
		}

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.flipkart.com");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement search2 = driver.findElement(By.xpath("//input[@name='q']"));
		search2.sendKeys(productname);
		search2.sendKeys(Keys.ENTER);

		List<WebElement> elementsonflipkart = driver
				.findElements(By.xpath("(//div[@class='col col-7-12']//div[@class='_4rR01T'])"));

		List<String> productnameonflipkart = new ArrayList<>();
		List<String> productpriceonflipkart = new ArrayList<>();
		for (int k = 0; k < elementsonflipkart.size(); k++) {
			int m = k + 1;
			String str = driver
					.findElement(By.xpath("(//div[@class='col col-7-12']//div[@class='_4rR01T'])[" + m + "]"))
					.getText();

			String price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[" + m + "]")).getText();
			productnameonflipkart.add(str);
			productpriceonflipkart.add(price);
			System.out.println(str + " " + price);
		}

		// String actproductname2 = "SAMSUNG Galaxy S22 Plus 5G (Phantom Black, 128
		// GB)";
		String prodname2 = "SAMSUNG Galaxy S22 5G";
		String stor2 = "128 GB";
		for (int j = 0; j < elementsonflipkart.size(); j++) {
			String s = productnameonflipkart.get(j);
			if (s.contains(prodname2) && s.contains(col) && s.contains(stor2)) {
				System.out.println(productnameonflipkart.get(j));
				priceonflipkart = Integer.parseInt(productprice.get(j).replaceAll("\\D", ""));
				break;
			}
			// System.out.println(productnames.get(j) + " " + productprice.get(j));
		}
		System.out.println(priceonAmazon + " " + priceonflipkart);

		int cheaper = priceonAmazon < priceonflipkart ? priceonAmazon : priceonflipkart;
		System.out.println("cheaper price is " + cheaper);
		// String prodcutName =
		// driver.findElement(By.xpath("(//*[contains(@data-component-type,'s-search-results')]//div[@data-index
		// and @data-component-id])["+x+"]//span[@class='a-size-medium a-color-base
		// a-text-normal']")).getText();
//        //searchResult.get(i).findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
//AmazonProdcuts.add(prodcutName);
//String prodcutPrice = driver.findElement(By.xpath("(//*[contains(@data-component-type,'s-search-results')]//div[@data-index and @data-component-id])["+x+"]//span[@class='a-price-whole']")).getText();

		Thread.sleep(2000);
		BaseTest.closeDriver();
	}

}
