package SeleniumPractice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class SortingEquitywithlist {

	static By codeBy = By.xpath("//*[@id='pills-active']/table/tbody/tr/td[1]");
	static By nameBy = By.xpath("//*[@id='pills-active']/table/tbody/tr/th/div/a");
	static By changeBy = By.xpath("//*[@id='pills-active']/table/tbody/tr/td[3]");
	static By volBy = By.xpath("//*[@id='pills-active']/table/tbody/tr/td[4]");
	static By closeBy = By.xpath("//a[text()='Close']");
	static By mostActiveBy = By
			.xpath("(//a[@class='nav-link btn btn-effect btn-white active' and @id='pills-active-tab'])[1]");

	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		List<Double> doub = new ArrayList<>();
		List<String> sorted = new ArrayList<>();
		try {

			BaseTest.launchBrowser("chrome");
			WebDriver driver = BaseTest.driver;

			driver.get("https://www.bursamalaysia.com/");
			WebElement element = driver.findElement(mostActiveBy);
//			Actions act = new Actions(driver);
//			act.moveToElement(driver.findElement(mostActiveBy)).build().perform();
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
			List<WebElement> Code = driver.findElements(codeBy);
			List<WebElement> Name = driver.findElements(nameBy);
			List<WebElement> Change = driver.findElements(changeBy);
			List<WebElement> Vol = driver.findElements(volBy);

			for (int m = 0; m < Change.size(); m++) {
				arr.add(Change.get(m).getText());
			}

			for (int j = 0; j < Change.size(); j++) {
				String str = Change.get(j).getText();
				if (!(str.length() == 1)) {
					double d = Double.parseDouble(str);

					doub.add(d);
				}
			}
			Collections.sort(doub);
			Collections.reverse(doub);

			for (int k = 0; k < doub.size(); k++) {
				String str1 = new DecimalFormat("#0.000#").format(doub.get(k));

				if (str1.charAt(0) != '-' && !str1.equals("0.000")) {
					str1 = "+" + str1;

					sorted.add(str1);
				} else {
					sorted.add(str1);
				}
			}

			for (int n = sorted.size(); n < 10; n++) {

				sorted.add(n, "-");
			}

			for (int i = 0; i < Change.size(); i++) {
				boolean con = false;
				int index = 0;
				// int count=0;
				// List<String> set=new ArrayList<>();
				for (int j = 0; j < Change.size(); j++) {

					// System.out.println(sorted.get(i)+" "+arr.get(j));
					if (sorted.get(i).equals(arr.get(j))) {
						index = j;
						arr.set(index, null);
						con = true;
						break;
					}

				}
				if (con) {
					System.out.println(Code.get(index).getText() + " | " + Name.get(index).getText() + " | "
							+ sorted.get(i) + " | " + Vol.get(index).getText());
				}
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		BaseTest.closeDriver();

	}

}
