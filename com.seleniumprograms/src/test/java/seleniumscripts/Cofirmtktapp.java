package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cofirmtktapp extends Setup {

	@Test
	public static void selectdeptodestcity() throws InterruptedException {

//		driver.get("https://www.google.com");
//		Thread.sleep(4000);

		driver.get("https://www.confirmtkt.com/rbooking-d/");

		driver.findElement(By.xpath("//label[@for='source-station']")).click();
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='Enter from']"));
		from.sendKeys("Mumbai");

		Thread.sleep(4000);
		List<WebElement> sourcecities = driver.findElements(By.xpath("//div[@id='source']//a"));

		for (int i = 0; i < sourcecities.size(); i++) {
			WebElement element = sourcecities.get(i);
			String str = element.getText();
			System.out.println(str);
			if (str.contains("Andheri")) {
				element.click();
				break;
			}
		}
		// sourcecities.forEach(l -> System.out.println(l.getText()));
		driver.findElement(By.xpath("//label[@for='destination-station']")).click();

		WebElement to = driver.findElement(By.xpath("//input[@placeholder='Enter to']"));
		to.sendKeys("Hyderabad");

		Thread.sleep(3000);
		List<WebElement> destcities = driver.findElements(By.xpath("//div[@id='destination']//a"));

		for (int i = 0; i < destcities.size(); i++) {
			WebElement element = destcities.get(i);
			String str = element.getText();
			System.out.println(str);
			if (str.contains("Begampet")) {
				element.click();
				break;
			}
		}

		String date = "19 June 2023";
		String datearr[] = date.split(" ");

		String dd = datearr[0];
		String mm_yyyy = datearr[1] + " " + datearr[2];

		driver.findElement(By.xpath("//input[@id='dateOfJourney']")).click();

		Thread.sleep(2000);

		WebElement monthyear = driver.findElement(By.xpath("//div[contains(@class,'switchHeader')]//p[text()]"));

		WebElement forwardbtn = driver
				.findElement(By.xpath("(//*[local-name()='svg' and  @class='MuiSvgIcon-root'])[2]"));
		WebElement btn = driver.findElement(By.xpath("(//div[contains(@class,'switchHeader')]//button)[2]"));
		while (!monthyear.getText().equals(mm_yyyy)) {

			forwardbtn.click();

			Thread.sleep(1000);
			if (btn.getAttribute("tabindex").equals("-1")) {
				// System.out.println("Given month and year is invalid");
				break;
			}
			monthyear = driver.findElement(By.xpath("//div[contains(@class,'switchHeader')]//p[text()]"));
		}

		driver.findElement(By.xpath(
				"//div[contains(@class,'MuiPickersCalendar-transitionContainer')]//button[@tabindex='0']//p[text()='"
						+ dd + "']"))
				.click();
		// driver.findElement(By.xpath("//button//span[text()='SEARCH']")).click();

		// Thread.sleep(10000);
	}

}
