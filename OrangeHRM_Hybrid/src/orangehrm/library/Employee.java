package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.AppUtils;

public class Employee extends AppUtils
{

	
	public boolean addEmployee(String fname,String lname)
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String empno =  driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empno);
		driver.findElement(By.id("searchBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("resultTable"))));
		
		WebElement restable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = restable.findElements(By.tagName("tr"));
		boolean isempdisplayed = false;
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equalsIgnoreCase(empno))
			{
				isempdisplayed = true;
				break;
			}
		}
		if(isempdisplayed)
		{
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	
	
}
