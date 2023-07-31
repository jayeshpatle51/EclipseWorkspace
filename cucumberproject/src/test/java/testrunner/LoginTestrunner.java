package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="featurefile/Login.feature",
glue={"stepdefinitions"},
plugin= {"pretty","html:test-output1","json:target/myreport/report.json"},
monochrome=true,
dryRun=false)
public class LoginTestrunner extends AbstractTestNGCucumberTests{

}
