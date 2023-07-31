package Generic_methods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestListener{

	  public void onTestStart(ITestResult result) {
		    System.out.println("TestCase is started "+ result.getStatus());
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		    System.out.println("TestCase is passed "+ result.getStatus());
		  }
	  
	  public void onTestFailure(ITestResult result) {
		    System.out.println("TestCase is failed "+result.getStatus());
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		    System.out.println("TestCase is skipped "+result.getStatus());
		  }
	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    System.out.println("TestCase fail but successpercentage "+result.getStatus());
		  }
	  
	  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }
	  
	  public void onStart(ITestContext context) {
		    System.out.println("Testclass is started");
		  }
	  
	  public void onFinish(ITestContext context) {
		    System.out.println("Testclass is finished");
		  }
	
}
