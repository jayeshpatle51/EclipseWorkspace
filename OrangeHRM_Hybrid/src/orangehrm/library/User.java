package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.AppUtils;

public class User extends AppUtils
{

	
	public void navigateToUserRegPage()
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();		
	}
	
	public boolean addUser(String role,String empname,String uname,String pword) throws InterruptedException
	{
		driver.findElement(By.id("btnAdd")).click();
		Select rolelist = new Select(driver.findElement(By.id("systemUser_userType")));
		rolelist.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pword);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pword);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("btnSave")));
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnSave")).click();		
		
		//Code to validate User Registered Successfully or not
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("searchBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("resultTable"))));
		
		List<WebElement> rows,cols;
		WebElement table = driver.findElement(By.id("resultTable"));
		rows = table.findElements(By.tagName("tr"));
		cols = rows.get(1).findElements(By.tagName("td"));
		if(cols.get(1).getText().equalsIgnoreCase(uname))
		{
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	
	
}
