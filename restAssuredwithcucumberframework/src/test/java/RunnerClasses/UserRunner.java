package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "D:\\eclipse-workspace\\restAssuredwithcucumberframework\\src\\test\\java\\userFeatures", glue = "stepdefinition", plugin = "json:target\\jsonReports\\CucumberReports.json", dryRun = false)
public class UserRunner extends AbstractTestNGCucumberTests {

}
