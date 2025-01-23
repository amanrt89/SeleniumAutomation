package DataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithBrowser {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(dataProvider="LoginData")
	public void Tc01(String user,String pass) 
	{
		WebElement usern=driver.findElement(By.name("username"));
		usern.sendKeys(user);

		WebElement passs=driver.findElement(By.name("password"));
		passs.sendKeys(pass);

		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();

		WebElement text = driver.findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6')]"));
		boolean b = text.isDisplayed();
		Assert.assertTrue(b, "Invalid Credential");


	}
	@DataProvider(name="LoginData")
	public Object[][] testData()
	{
		return new Object[][]
				{
			{"Admin","admin123"},
			{"Aman","Aman@123"},
			{"Pranav","Pranav@123"}
			};

	}

	@AfterMethod()
	public void TearDown() throws InterruptedException
	{ 
		Thread.sleep(2000);
		driver.close();
	}
}