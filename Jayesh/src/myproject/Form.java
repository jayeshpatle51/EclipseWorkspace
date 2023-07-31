package myproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Form {
	WebDriver driver;
	@Test
	public void openurl() {
		System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://student.maharashtra.gov.in/adm_portal/Users/rteindex");
		driver.findElement(By.xpath("//img[@src='/adm_portal/img/applyIcon.png']")).click();
		driver.findElement(By.linkText("New Registration")).click();
		driver.findElement(By.id("txtEng1")).sendKeys("singh");
		driver.findElement(By.id("txtEng2")).sendKeys("Hitesh");
		driver.findElement(By.id("txtEng3")).sendKeys("ramesh");
		driver.findElement(By.id("datepicker")).click();
		Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("2016");
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("May");
		WebElement cal=driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> rows,col;
		rows=cal.findElements(By.tagName("tr"));
		String dt="15";
		boolean flag=false;
		for(int i=0;i<rows.size();i++) {
			col=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++) {
				
				if(col.get(j).getText().equals(dt)) {
					col.get(j).click();
					flag=true;
					break;
				}
			}if(flag) {
			break;
			}
		}
		
		Select city= new Select(driver.findElement(By.id("district_code")));
		city.selectByVisibleText("Gondiya");
		driver.findElement(By.id("contact_no_mobile")).sendKeys("8723456788");
		driver.findElement(By.id("email_id")).sendKeys("jop123@gmail.com");
		WebElement reg=driver.findElement(By.id("submit_details1"));
		System.out.println(reg.getCssValue("Value"));
	}
	

}
