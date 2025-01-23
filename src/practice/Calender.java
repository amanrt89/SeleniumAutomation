package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		while(!driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().contains("December 2025")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		List<WebElement> alldate=driver.findElements(By.xpath("//tbody//td[@data-handler='selectDay']"));
		for(WebElement date:alldate)
		{
			if(date.getText().equals("25"))
			{
				date.click();
			}
		}

	}

}
