package seleniumscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import com.baseDriver.BaseTest;


public class DragAndDrop {

	static WebDriver driver;

	public static void dragAndDropOnCapital(String contry, String capital) throws IOException, InterruptedException {

		BaseTest.launchBrowser();

		driver = BaseTest.driver;

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		List<WebElement> capitals = driver
				.findElements(By.xpath("//div[@id='capitals']//div[@id='dropContent']//div[contains(@id,'box')]"));

		List<WebElement> contries = driver.findElements(By.xpath("//div[@id='countries']//div"));

		Actions act = new Actions(driver);

		for (int i = 0; i < capitals.size(); i++) {
			// boolean cond = false;
			String cap = capitals.get(i).getText();
			if (cap.equals("Rome")) {
				WebElement con = driver.findElement(By.xpath("//div[@id='countries']//div[text()='Italy']"));
				act.dragAndDrop(capitals.get(i), con).perform();

				String colour = con.getCssValue("backgroundColor");
				String col = Color.fromString(colour).asHex();
				System.out.println(col);
				Colors c = Colors.lightgreen;
				String actual = c.getColour();
				System.out.println(actual);
				// Colors cd = Colors.blue;
				// String diff = cd.getColour();
				// JavascriptMethods.changecolor(diff, con, driver);
				if (actual.equals(col)) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			}
		}

		BaseTest.quitbrowser();

	}

	public static void main(String[] args) throws Exception {

		DragAndDrop.dragAndDropOnCapital("United States", "Washigton");
//		BaseTest.launchBrowser();
//
//		driver = BaseTest.driver;
//
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//
//		List<WebElement> capitals = driver
//				.findElements(By.xpath("//div[@id='capitals']//div[@id='dropContent']//div[contains(@id,'box')]"));
//
//		List<WebElement> contries = driver.findElements(By.xpath("//div[@id='countries']//div"));
//
//		Actions act = new Actions(driver);
//
//		for (int i = 0; i < capitals.size(); i++) {
//			//boolean cond = false;
//			String cap = capitals.get(i).getText();
//			if (cap.equals("Rome")) {
//				WebElement con = driver.findElement(By.xpath("//div[@id='countries']//div[text()='Italy']"));
//				act.dragAndDrop(capitals.get(i), con).perform();
//
//				String colour = con.getCssValue("backgroundColor");
//				String col = Color.fromString(colour).asHex();
//				System.out.println(col);
//				Colors c = Colors.lightgreen;
//				String actual = c.getColour();
//				System.out.println(actual);
//				//				Colors cd = Colors.blue;
//				//				String diff = cd.getColour();
//				//				JavascriptMethods.changecolor(diff, con, driver);
//				if (actual.equals(col)) {
//					System.out.println("true");
//				} else {
//					System.out.println("false");
//				}
//				// JavascriptMethods.changecolor(cap, con, driver);
//				// for (int j = 0; j < contries.size(); j++) {
//				//
//				// String country = contries.get(j).getText();
//				// cond = country.equals("United States");
//				// if (cond) {
//				//
//				// act.dragAndDrop(capitals.get(i), contries.get(i)).build().perform();
//				// break;
//				// }
//				// }
//				// if (cond) {
//				// break;
//				// }
//			}
//		}

		// BaseTest.quitbrowser();

	}

}
