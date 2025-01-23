package failedTestCase;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void login()
	{
		System.out.println("Login");
	}
	@Test
	public void user1()
	{
		System.out.println("User 1");
		assert false;
	}


}
