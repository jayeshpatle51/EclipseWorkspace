package seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import com.baseDriver.BaseTest;
import com.qa.testrailmanager.TestRailManager;

public class Setup {

	public static WebDriver driver;
	public static String testCaseid;
	@BeforeMethod
	public void openBrowser() throws IOException {

		BaseTest.launchBrowser();
		driver = BaseTest.driver;
	}

	// @AfterMethod
	public void quitBrowser() throws InterruptedException {
		BaseTest.quitbrowser();
	}

	// @AfterMethod
	public void addResultsToTestRail(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {
			TestRailManager.addResultsForTestCase(testCaseid, TestRailManager.TEST_CASE_PASS_STATUS, "");
		} else if (result.getStatus() == ITestResult.FAILURE) {

			TestRailManager.addResultsForTestCase(testCaseid, TestRailManager.TEST_CASE_FAIL_STATUS,
					"test got failed..." + result.getName() + " : FAILED");
		}
	}

}
