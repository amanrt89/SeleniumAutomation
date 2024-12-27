package alternateWays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByJavaScipt {
          public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
      		driver.get("https://www.facebook.com/");
      		
      		JavascriptExecutor js=(JavascriptExecutor)driver;
      		//js.executeScript("window.scrollBy(0,500)");  //scroll by value
      		
      		WebElement email=driver.findElement((By.xpath("//input[@id='email']")));
      		js.executeScript("arguments[0].scrollIntoView()", email); // scroll to particular element
			
		}
}
