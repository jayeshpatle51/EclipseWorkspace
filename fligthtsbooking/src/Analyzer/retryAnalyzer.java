package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer {
  
	
	int count =0;
	int countlimit=3;

	@Override
	public boolean retry(ITestResult result) {
		if (count <= countlimit) {
			count++;
			return true;
		} else {
			return false;
		}
		}

}
