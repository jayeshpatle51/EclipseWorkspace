package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ddtstep {
	
	
	
	
	public static WebDriver driver;

	@Before
	public void setupdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
//	
//	@Given("I want to write a step with name1")
//	public void i_want_to_write_a_step_with_name1() {
//		
//			
//		//driver.get("https://www.google.com");
//	   System.out.println("This is step one is ran");
//	}
//
//	@When("I check for the {int} in step")
//	public void i_check_for_the_in_step(Integer int1) {
//	  System.out.println(int1+" ");
//	}
//
//
//	@Then("I verify the Fail in step")
//	@Then("I verify the success in step")
//	public void i_verify_the_success_in_step() {
//		System.out.println(" Step Fail or Success this method is execute. ");
//	}
//
//	@Given("I want to write a step with name2")
//	public void i_want_to_write_a_step_with_name2() {
//	   System.out.println("step with name2");
//	}
//
//
//	public void i_verify_the_fail_in_step() {
//		
//		System.out.println("this is fail step ");
//	}

	@Given("^I want to write a step with (.+)$")
	public void i_want_to_write_a_step_with(String name) throws Throwable {
		System.out.println("This is step one is ran " + name);
	}

	@When("^I check for the (.+) in step$")
	public void i_check_for_the_in_step(String value) throws Throwable {
		System.out.println("This is step two is ran " + value);
	}

	@Then("^I verify the (.+) in step$")
	public void i_verify_the_in_step(String status) throws Throwable {
		System.out.println(" Step Fail or Success this method is execute. " + status);
	}

}
