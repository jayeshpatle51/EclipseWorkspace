/*
 * @autor : Naveen Khunteta
 * 
 */
package ExtentReportListener;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.xml.XmlSuite;

import com.crm.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.TestBase;

public class ExtentReporterNG implements IReporter {
	private ExtentReports extent;
	
	
    
	
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		extent = new ExtentReports(outputDirectory + File.separator + "Extent1.html", true);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				
					buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				
				
					buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
					
					
				
					buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
				
			}
		}

		extent.flush();
		extent.close();
	}
    
	private void buildTestNodes(IResultMap tests, LogStatus status)   {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				if(result.getStatus()==ITestResult.FAILURE){
					test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
					test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
					
//					String screenshotPath = "";
//					try {
//						screenshotPath = TestUtil.takeScreenshotAtEndOfTest();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
				}
				extent.endTest(test);
			
			
			}
			}
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	
/*public void addscreenshot(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE){
		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report

		String screenshotPath = TestUtil.takeScreenshotAtEndOfTest();
		test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath)); //to add screenshot in extent report
		//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
	}
	else if(result.getStatus()==ITestResult.SKIP){
		test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS){
		test.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

	}*/
}

