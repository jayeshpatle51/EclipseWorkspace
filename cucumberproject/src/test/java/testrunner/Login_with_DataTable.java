package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/featurefile/Login_with_Datatable.feature",
glue={"stepdefinitions","baseclass"},
plugin= {"pretty","html:test-output1","json:target/myreport/report.json"},
monochrome=true,
		dryRun = false)
public class Login_with_DataTable extends AbstractTestNGCucumberTests{

}
