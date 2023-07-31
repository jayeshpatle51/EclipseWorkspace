package Generic_methods;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.XLUtils;

public class Facebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.Facebook.com");
		
		
		
		
		String file="Book1.xlsx";
		
		String sheet="Sheet1";
		
		int row=XLUtils.getRowCount(file, sheet);
		row=row+1;
	System.out.println("Number of rows are : " + row);
	for (int i = 1; i < row; i++) {
       Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		
        WebElement firstname= driver.findElement(By.name("firstname"));
		
		WebElement lastname= driver.findElement(By.name("lastname"));
		WebElement mobileno= driver.findElement(By.name("reg_email__"));
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		WebElement Day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		WebElement genFemale= driver.findElement(By.xpath("//input[@value='1']"));
		WebElement genMale= driver.findElement(By.xpath("//input[@value='2']"));
		WebElement genCostum= driver.findElement(By.xpath("//input[@value='-1']"));
		
		int col = XLUtils.getColumnCount(file, sheet, i);
		for (int j = 0; j < col; j++) {
			String strvalue = XLUtils.getStringCellData(file, sheet, i, j);
			double value = XLUtils.getNumericCellData(file, sheet, i, j);
			String s = "";
			if (value > -128 && value < 128) {
				byte in = (byte) value;
				s = String.valueOf(in);
			} else if (value >= 128 && value <= 32767) {
				short in = (short) value;
				s = String.valueOf(in);
			} else if (value > 32767 && value <= 2147483647) {
				int in = (int) value;
				s = String.valueOf(in);
			} else {
				long in = (long) value;
				s = String.valueOf(in);
			}

			if (strvalue.length() > 0) {
				System.out.print(strvalue + " || ");
				switch (j) {
				case 0:
				firstname.sendKeys(strvalue);
				break;
				case 1:
					lastname.sendKeys(strvalue);
					break;
				
				case 3:
					password.sendKeys(strvalue);
					break;
				case 4:
					String arr[]=strvalue.split("/");
					Select select=new Select(Day);
					select.selectByVisibleText(arr[0]);
					Select select1=new Select(month);
					select1.selectByValue(arr[1]);
					Select select2=new Select(year);
					select2.selectByVisibleText(arr[2]);
					break;
				case 5:
					switch(strvalue) {
					case "Male":
						
					genMale.click();
					break;
					case "Female":
						genFemale.click();
						break;
						default :
							genCostum.click();
					}
					}
				
			} else {
				System.out.print(s + " || ");
				switch (j) {
				case 2:
					mobileno.sendKeys(s);
					break;
				
				}
			}
		}
	    
	      
	      Thread.sleep(2000);
	     
	     
		driver.findElement(By.xpath("//img[contains(@id,'u_')]")).click();
		 Thread.sleep(2000);
		System.out.println();
	}

		
	   
	}

}
