package orangehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils 
{

	
	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();		
	}
	
	public boolean isAdminModuleDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isEmployeeModuleDisplayed()
	{
		
		try 
		{
		
			driver.findElement(By.linkText("Admin"));
			return false;
			
		} catch (Exception e) 
		{
			return true;
		}
		
		
	}
	
	
	public boolean logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	public boolean isErrDisplayed()
	{
		String errmsg;
		errmsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		
		if(errmsg.contains("invalid"))
		{
			return true;
		}else
		{
			return false;
		}
	}
}
