package Mainproject.simpleproject;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNglisteners implements ITestListener {
      
      @Override
    public void onTestFailure(ITestResult result) {
    	// TODO Auto-generated method stub
    	System.out.println("Test is failed : "+result.getName());
    	
    }
      @Override
    public void onStart(ITestContext context) {
    	// TODO Auto-generated method stub
    	System.out.println("Test is start : "+ context.getName());
    }
      @Override
    public void onFinish(ITestContext context) {
    	// TODO Auto-generated method stub
    	  System.out.println("Test is finish : "+context.getName());
    }
      @Override
    public void onTestSkipped(ITestResult result) {
    	// TODO Auto-generated method stub
    	System.out.println("Test is skipped : "+ result.getName());
    }
      @Override
    public void onTestSuccess(ITestResult result) {
    	// TODO Auto-generated method stub
    	System.out.println("Test is success : " + result.getName());
Baseclass main=new Baseclass();
    	
    	main.fail(result.getMethod().getMethodName());
    }
}
