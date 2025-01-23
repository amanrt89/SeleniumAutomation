package failedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
  int retrycount=0;
  int maxretrycount=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retrycount<maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
	}


}
