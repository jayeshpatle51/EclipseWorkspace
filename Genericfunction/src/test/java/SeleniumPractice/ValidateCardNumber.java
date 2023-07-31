package SeleniumPractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Baseclass.BaseTest;

public class ValidateCardNumber {
	static WebDriver driver;
	// static WebElement owner = driver.findElement(By.id("owner"));

	static String CardName = "Master Card";
	static String ExpMonth = "December";
	static String ExpYear = "2020";

	static By OWNERBy = By.id("owner");
	static By CVVBy = By.id("cvv");
	static By CARDNUMBERBy = By.id("cardNumber");
	static By EXPIRYMONTHBy = By.xpath("//div[@id='expiration-date']//select[1]");
	static By EXPIRYYEARBy = By.xpath("//div[@id='expiration-date']//select[2]");
	static By CREDITCMPNYSBy = By.xpath("//div[@id='credit_cards']//img");
	static By CNFRMBUTTONBy = By.id("confirm-purchase");
	static By SAMPLECARDNOBy = By.xpath("//td[text()='" + CardName + "']//following-sibling::td[1]");
	static By SAMPLECVVBy = By.xpath("//td[text()='" + CardName + "']//following-sibling::td[2]");

	public static void main(String[] args) throws InterruptedException {

		BaseTest.launchBrowser("chrome");
		driver = BaseTest.driver;
		driver.get("https://demo.tutorialzine.com/2016/11/simple-credit-card-validation-form/");

		driver.findElement(OWNERBy).sendKeys("Jayesh");
		WebElement cvv = driver.findElement(CVVBy);
		WebElement cardNo = driver.findElement(CARDNUMBERBy);
		WebElement SampleCardNumber = driver.findElement(SAMPLECARDNOBy);
		String GivenCardNo = SampleCardNumber.getText();
		String SampleCvv = driver.findElement(SAMPLECVVBy).getText();
		cvv.sendKeys(SampleCvv);
		System.out.println(GivenCardNo + " " + SampleCvv);
		// cardNo.sendKeys("4564445655445633");
		Actions act = new Actions(driver);
		act.doubleClick(SampleCardNumber).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();

		act.click(cardNo).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();

		String cardNoValue = cardNo.getAttribute("value");
		Map<Boolean, String> map = AddSpacesIntoNumbers(GivenCardNo);
		if (map.containsKey(true)) {
			String str = map.get(true);
			if (str.equals(cardNoValue)) {
				System.out.println("Spaces added in number Successfully");
			}
		} else {
			System.out.println("Spaces not added Successfully");
		}
		System.out.println("The given value of card " + cardNoValue);

		WebElement selectExpMonth = driver.findElement(By.xpath("//select[1]"));
		WebElement selectExpYear = driver.findElement(By.xpath("//select[2]"));
		Select se = new Select(selectExpMonth);
		se.selectByVisibleText(ExpMonth);
		se = new Select(selectExpYear);
		se.selectByVisibleText(ExpYear);

		driver.findElement(CNFRMBUTTONBy).click();

		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains("correct")) {
			System.out.println(alertText);
			System.out.println("Validation Successful");
		} else {
			System.out.println(alertText);
			System.out.println("Validation Failed");
		}
		Thread.sleep(3000);
		BaseTest.closeDriver();

	}

	public static Map<Boolean, String> AddSpacesIntoNumbers(String code) {

		String fincode = "";
		int k = 4;
		Boolean b = true;
		Map<Boolean, String> map = new HashMap<>();
		if (code.length() != 16 && code.matches("\\D")) {
			b = false;
			map.put(b, code);
			return map;

		}

		for (int i = 0; i < code.length(); i++) {
			if (i == k) {
				fincode = fincode + " ";

				k = k + 4;
			}
			fincode = fincode + code.charAt(i);

		}
		map.put(b, fincode);
		return map;
	}

}
