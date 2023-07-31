package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="featurefile/Addcustomer.feature",
glue={"stepdefinitions"},
plugin= {"pretty","html:test-output1","json:target/myreport/report.json"},
monochrome=true,
dryRun=true)
public class Addcustomer extends AbstractTestNGCucumberTests{

}
