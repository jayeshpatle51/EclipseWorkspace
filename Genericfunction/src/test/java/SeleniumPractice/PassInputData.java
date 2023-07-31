package SeleniumPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class PassInputData {

	public static void main(String[] args) throws InterruptedException {
		
		BaseTest.launchBrowser("chrome");
		WebDriver driver=BaseTest.driver;
		driver.get("file:///C:/Users/SPURGE/Downloads/SampleWebTable.html");
		
	List<WebElement> list=	driver.findElements(By.xpath("//input[contains(@id,'edit')]"));
	List<String> salaries=new ArrayList<>(Arrays.asList("23000","45000","43000","67000"));
	
	System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			
		//WebElement ele=	driver.findElement(By.xpath("//input[contains(@id,'edit"+(i+1)+"')]"));
		
		list.get(i).sendKeys(salaries.get(i));
		Thread.sleep(1000);
		}
		
//		List<WebElement> weElement=driver.findElements(By.xpath("//input[contains(@id,'edit')]"));
//        int num=20000;
//        for(int i=0;i<weElement.size();i++)
//        {
//                
////                JavascriptExecutor myExecutor = ((JavascriptExecutor) driver); 
////                myExecutor.executeScript("arguments[0].value='"+num+"';", weElement.get(i));
//                        weElement.get(i).sendKeys(""+num+"");
//                        
//                num+=10000;
//            Thread.sleep(1000);
//        }
		
		BaseTest.closeDriver();
	}

}
