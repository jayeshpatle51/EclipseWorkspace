package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");

		WebDriver driver = BaseTest.driver;

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		String countryname = "Phillipines";
		List<WebElement> contries = driver.findElements(By.xpath("//td//input//..//following-sibling::td[1]"));

		Thread.sleep(3000);
		// List<WebElement> checkboxes = driver.findElements(By.xpath("//td//input"));

		for (int i = 0; i < contries.size(); i++) {
			System.out.println("(" + (i + 1) + ")" + contries.get(i).getText());
			String str = contries.get(i).getText();

			List<WebElement> ele = driver
					.findElements(By.xpath("//*[text()='" + str + "']//..//preceding-sibling::td//input"));
			if (ele.size() == 1) {
				ele.get(0).click();
			} else if (ele.size() > 1) {
				for (int k = 0; k < ele.size(); k++) {
					if (!ele.get(k).isSelected()) {
						ele.get(k).click();
					}
				}
			} else if (ele.size() == 0) {
				str = str.split("and")[0];
				driver.findElement(By.xpath("//*[contains(text(),'" + str + "')]//..//preceding-sibling::td//input"))
						.click();
			}
			// checkboxes.get(i).click();

		}

		Thread.sleep(3000);

		Thread.sleep(3000);
		BaseTest.closeDriver();

	}

}
