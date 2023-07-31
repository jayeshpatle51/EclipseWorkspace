package SeleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class BursaCodeByyashmant {

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://www.bursamalaysia.com/");
		Thread.sleep(5000);
		List<String> r = new ArrayList<String>();
		List<Double> d = new ArrayList<Double>();
		List<String> q = new ArrayList<String>();
		List<WebElement> element = driver.findElements(By.xpath(
				"(//table[@class='table table-striped table-borderless table-carousel plain-table'])[1]//tr/td[3]"));
		for (WebElement value : element) {
			q.add(value.getText());
		}
		System.out.println(q);
		for (int i = 0; i <= q.size() - 1; i++) {
			if (q.get(i).equals("-")) {
				r.add(q.get(i).replace("-", "0"));
			} else {
				r.add(q.get(i));
			}
			// System.out.println(r);

			for (int j = 0; i <= r.size() - 1; i++) {
				try {
					d.add(Double.parseDouble(r.get(i)));
				} catch (Exception e) {

				}

			}
			Collections.sort(d);

		}
		System.out.println(d);

		BaseTest.closeDriver();
	}

}
