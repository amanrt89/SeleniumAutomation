package listners;

import org.testng.annotations.Test;

public class TestClass {
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


