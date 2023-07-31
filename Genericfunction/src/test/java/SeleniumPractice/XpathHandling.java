package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.BaseTest;

public class XpathHandling {

	public static void main(String[] args) throws AWTException {
		BaseTest.launchBrowser("chrome");
		WebDriver driver=new ChromeDriver();
		
		TakesScreenshot t=(TakesScreenshot)driver;
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Robot r=new Robot();
		
//		driver.get("file:///C:/Users/SPURGE/Downloads/SampleWebTable.html");
//		
//		
//	  List<WebElement> names=driver.findElements(By.xpath("//table[@id='tbl1']//tr"));
//	  
//	  System.out.println(names.size());
//	  for(int i=2;i<names.size()+1;i++) {
//		// System.out.println(names.get(i));
//	 // String age=driver.findElement(By.xpath("//table[@id='tbl1']//tr["+ i+"]//td[4]")).getText();
//	 String age= names.get(i).getText();
//	  if(Integer.parseInt(age)>50) {
//		  String name=driver.findElement(By.xpath("//table[@id='tbl1']//tr["+i+"]//td[1]")).getText();
//		 // System.out.println(name);
//		  System.out.println(age+" "+name);
//	  }
//	  }
		BaseTest.closeDriver();

	}

}
