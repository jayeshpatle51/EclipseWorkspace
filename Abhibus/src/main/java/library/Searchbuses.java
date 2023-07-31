package library;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import abhibus.Baseclass;

public class Searchbuses extends Baseclass {

	@FindBy(xpath = "//input[@id='source']")
	WebElement source;

	@FindBy(xpath = "//ul[@id='ui-id-1']")
	WebElement sourcelist;

	@FindBy(xpath = "//input[@id='destination']")
	WebElement destination;

	@FindBy(xpath = "//ul[@id='ui-id-2']")
	WebElement destinationlist;
	
	@FindBy(xpath="//input[@id='datepicker1']")
	WebElement departuredate;
	
	
	

	@FindBy(xpath = "//a[text()='Search']")
	WebElement searchbutton;

	public Searchbuses() {
		PageFactory.initElements(driver, this);
	}

	public void selectSourcecity() {
		source.sendKeys("Mumbai");
		List<WebElement> citylist = sourcelist.findElements(By.xpath("//ul[@id='ui-id-1']"));
		citylist.get(0).click();

	}

	public void selectdestcity() {
		destination.sendKeys("Hyderabad");
		List<WebElement> citylist = destination.findElements(By.xpath("//ul[@id='ui-id-2']"));
		citylist.get(0).click();

	}

	public void searchBusdate(String date) {

//		String[] str2 = date.split("/");
//		String dt = str2[0];
//		String month = str2[1];
//		String year = str2[2];

//    driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Hyderabad");
//    List<WebElement>  suggetion = driver.findElement(By.xpath("//ul[@id='ui-id-1']")).findElements(By.tagName("li"));
//	  suggetion.get(1).click();
//    try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Mumbai");
//		 
//	   List<WebElement>  suggetion1 = driver.findElement(By.xpath("//ul[@id='ui-id-2']")).findElements(By.tagName("li"));
//		
//		
//		suggetion1.get(1).click();

//		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		String calyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
//		while (!calyear.equals(year)) {
//			driver.findElement(By.xpath("//a//span[text()= 'Next']")).click();
//			calyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
//		}
//
//		String calmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
//		while (!calmonth.equalsIgnoreCase(month)) {
//			driver.findElement(By.xpath("//a//span[text()= 'Next']")).click();
//			calmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
//		}
//		WebElement datetable = driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]"));
//		List<WebElement> rows = datetable.findElements(By.tagName("tr"));
//		boolean condition = false;
//		for (int i = 1; i < rows.size(); i++) {
//			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < cols.size(); j++) {
//				if (cols.get(j).getText().equals(dt)) {
//					cols.get(j).click();
//					condition = true;
//					break;
//				}
//			}
//			if (condition)
//				break;
//
//		}
//
//		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		String calyear1 = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
//		while (!calyear1.equals(year)) {
//			driver.findElement(By.xpath("//a//span[text()= 'Next']")).click();
//			calyear1 = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
//		}
//
//		String calmonth1 = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
//		while (!calmonth1.equalsIgnoreCase(month)) {
//			driver.findElement(By.xpath("//a//span[text()= 'Next']")).click();
//			calmonth1 = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
//		}
//		WebElement datetable1 = driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]"));
//		List<WebElement> rows1 = datetable1.findElements(By.tagName("tr"));
//		boolean condition1 = false;
//		for (int i = 1; i < rows1.size(); i++) {
//			List<WebElement> cols1 = rows1.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < cols1.size(); j++) {
//				if (cols1.get(j).getText().equals(dt)) {
//					cols1.get(j).click();
//					condition1 = true;
//					break;
//				}
//			}
//			if (condition1)
//				break;
//
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		selectDatebyjs(driver, departuredate, date);
		
	}

	public boolean searchbutton() {
		searchbutton.click();
		
		String str = driver.getTitle();
		
		if (str.contains("Mumbai")) {
			return true;
		} else {
			return false;
		}

	}

	public static void selectDatebyjs(WebDriver driver,WebElement element,String date) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}
}
