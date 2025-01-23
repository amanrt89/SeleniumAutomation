package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {
	@Test(dataProvider="LoginData")
	public void Tc01(String user,String pass)
	{
		System.out.println("UserName:-"+user +"Password"+pass);
	}
   
	@DataProvider(name="LoginData")
	public Object[][] testData()
	{
		return new Object[][]
			{
		{"Admin","admin123"},
		{"Prnav","Paranav@123"},
		{"Aman","Aman@123"}
		};
		
		
	}
}
