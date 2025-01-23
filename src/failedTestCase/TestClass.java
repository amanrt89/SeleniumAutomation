package failedTestCase;

import org.testng.annotations.Test;

public class TestClass {
	@Test(retryAnalyzer = failedTestCase.RetryAnalyzer.class)
	public void login()
	{
		System.out.println("Login");
	}
	@Test(retryAnalyzer = failedTestCase.RetryAnalyzer.class)
	public void user1()
	{
		System.out.println("User 1");
		assert false;
	}


}
