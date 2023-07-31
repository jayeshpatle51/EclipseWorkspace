package SeleniumPractice;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import Baseclass.BaseTest;

public class Sendtext {

	public static void main(String[] args) throws InterruptedException {
		
		BaseTest.launchBrowser("chrome");
		WebDriver driver=BaseTest.driver;
		
		driver.get("file://D:/Programs/MainPage.html");
		
		String title1=driver.getTitle();
		//System.out.println(title1);
		String expectedTitle1="Main Page";
		Assert.assertEquals(title1, expectedTitle1,"Mainpage not Verified successfully");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(1000);
		
		driver.get("file://C:/Users/SPURGE/Downloads/SampleWebTable.html");
		
		String title2=driver.getTitle();
		System.out.println(title2);
		String expectedTitle2="Sample Web Table";
		Assert.assertEquals(title2, expectedTitle2,"SampleWebTable page not verified successfully");
		
		Thread.sleep(1000);
		Set<String> wi=driver.getWindowHandles();
		String[] war=new String[wi.size()];
		int i=0;
		for(String st: wi) {
			war[i]=st;
			i++;
		}
		System.out.println(Arrays.toString(war));
		String indScientistname=driver.findElement(By.xpath("//table[@id='tbl1']//tr//td[text()='Indian Scientist']//preceding-sibling::td"))
				.getText();
		System.out.println(indScientistname);
		String studentcity=driver.findElement(By.xpath("//table[@id='tbl2']//tr//td[text()='Student3']//following-sibling::td[1]"))
				.getText();
		System.out.println(studentcity);
		driver.close();
   String currwin=war[0];
		
		System.out.println(currwin);
//		//driver.close();
		driver.switchTo().window(currwin);
		//driver=driver.switchTo().defaultContent();
		WebElement frame=driver.findElement(By.xpath("//iframe[@name='Page1']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("frm1_un_id1")).sendKeys(indScientistname);
		driver.findElement(By.id("frm1_pwd_id1")).sendKeys(studentcity);
		Thread.sleep(1000);
		BaseTest.closeDriver();

	}

}
