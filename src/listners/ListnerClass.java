package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Execute Started:="+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execute Success:="+result.getName());
	}
		
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Execute Failed:="+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Execution Skipped:="+result.getName());
	}
		
	

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Finish");
	
		
	}
	
	

}
