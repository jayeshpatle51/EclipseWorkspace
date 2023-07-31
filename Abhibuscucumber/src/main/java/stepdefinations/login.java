package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	
	public static WebDriver driver;
	String expempno;
	
	@Given("^i open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String url) throws Throwable 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get(url);
		
	}

	@Then("^i should see login page$")
	public void i_should_see_login_page() throws Throwable 
	{
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		   {
			   System.out.println("Application Launched Successfully");
		} else 
		{
			System.out.println("Application Launch Failed");
		}
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uname) throws Throwable 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}

	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pword) throws Throwable 
	{
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable 
	{
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^i should see admin module$")
	public void i_should_see_admin_module() throws Throwable 
	{
		if (driver.findElement(By.linkText("Admin")).isDisplayed()) 
	    {
	    	System.out.println("Admin Login Successful");
		} else 
		{
			System.out.println("Admin Login Failed");
		}
	}
		
	@When("^i click logout$")
	public void i_click_logout() throws Throwable 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@When("^i close browser$")
	public void i_close_browser() throws Throwable 
	{
		driver.close();
	}
	
	@Then("^i should see error message$")
	public void i_should_see_error_message() throws Throwable
	{
		 	String errmsg=driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		    if (errmsg.contains("invalid")) 
		    {
		    	System.out.println("Admin Login unsuccessful for invalid data");
			} 		
	}
	
	@When("^i click pim$")
	public void i_click_pim() throws Throwable 
	{
		driver.findElement(By.linkText("PIM")).click();
	}

	@When("^i click add employee$")
	public void i_click_add_employee() throws Throwable 
	{
		driver.findElement(By.linkText("Add Employee")).click();
	}

	@Then("^i should see new employee registration page$")
	public void i_should_see_new_employee_registration_page() throws Throwable 
	{
		String pgurl = driver.getCurrentUrl().toLowerCase();
		if(pgurl.contains("addemployee"))
	    {
	    	System.out.println("System displayed Emplyee Registration Page");
	    }
		
	}

	@When("^i enter firstname as \"([^\"]*)\"$")
	public void i_enter_firstname_as(String fname) throws Throwable 
	{
		driver.findElement(By.id("firstName")).sendKeys(fname);
	}

	@When("^i enter lastname as \"([^\"]*)\"$")
	public void i_enter_lastname_as(String lname) throws Throwable 
	{
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}

	@When("^i click save$")
	public void i_click_save() throws Throwable 
	{
		expempno = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
	}

	@Then("^i should see new employee registered successfully$")
	public void i_should_see_new_employee_registered_successfully() throws Throwable 
	{
		String actempno = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		if(expempno.equalsIgnoreCase(actempno))
	    {
	    	System.out.println("New Employee Registered Successfully");
	    }
	}

}
