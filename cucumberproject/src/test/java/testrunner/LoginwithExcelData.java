package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import baseclass.BaseClass;

@CucumberOptions(features="src/test/resources/featurefile/Loginwith_excelData.feature",
glue={"stepdefinitions"},
plugin= {"pretty","html:test-output1","json:target/myreport/report.json"},
monochrome=true,
dryRun=false)
public class LoginwithExcelData extends AbstractTestNGCucumberTests{

}
