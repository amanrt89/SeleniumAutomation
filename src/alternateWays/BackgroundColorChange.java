package alternateWays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColorChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	   		driver.get("https://www.facebook.com/");
	   		WebElement email=driver.findElement((By.xpath("//input[@id='email']")));
	   		
	   		JavascriptExecutor js=(JavascriptExecutor)driver;
	   		js.executeScript("arguments[0].style.background='purple'", email);
	}

}
