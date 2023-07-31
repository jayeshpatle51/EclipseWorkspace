package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runner {
	
	//@RunWith(Cucumber.class)
	@CucumberOptions(features="D:\\eclipse-workspace\\Abhibuscucumber\\src\\main\\java\\feature\\orangehrm.feature",
			glue={"stepdefinations"},
		
			dryRun=true)
	        
	public class AdminLoginTest	extends AbstractTestNGCucumberTests
	{
		
	}
}
