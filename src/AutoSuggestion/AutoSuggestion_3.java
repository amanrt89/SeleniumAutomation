package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_3 {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("OnePlus");
       Thread.sleep(2000);
       
       List<WebElement> w=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li//div[@class='YGcVZO _2VHNef']"));
	String e="oneplus nord 4";
	
      for(WebElement x:w)
      {
    	  String d=x.getText();
    	  System.out.println(d);
    	  if(e.equals(d))
    	  {
    		  x.click();
    	  }
      }
	
	}

}
