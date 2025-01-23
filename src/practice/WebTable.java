package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/tables");
		
		int rowsize=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();
		int cellsize=driver.findElements(By.xpath("//table[@id='table1']//tr//th")).size();
		
		List<WebElement>headers=driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		for(WebElement header:headers)
		{
			System.out.print(header.getText()+"|");
		
		}
		System.out.println();
		for(int i=1;i<=rowsize;i++)
		{
			for(int j=1;j<cellsize;j++) {
				String data=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"|");
			}
			System.out.println();
		}
		
		
		

	}

}
