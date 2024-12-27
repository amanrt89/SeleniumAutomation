package alternateWays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserGenerateAlertCraete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
   		driver.get("https://www.facebook.com/");
   		JavascriptExecutor js=(JavascriptExecutor)driver;
   		js.executeScript("alert('Hello From Eclipes')");
   		Thread.sleep(2000);
   		driver.switchTo().alert().accept();

	}

}
