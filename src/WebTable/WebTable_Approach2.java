package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable_Approach2 {


	public static void main(String[] args) {

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/tables");
		
		//row size
		int row=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr")).size();
		System.out.println(row);
		
		//column size
		int col=driver.findElements(By.xpath("//table[@id=\"table1\"]//th")).size();
		System.out.println(col);
		
		//for table header
		List<WebElement> list=driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		
		//iterate for table header
		for(WebElement x: list) {
			
			System.out.print(x.getText()+" | ");
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) { //for row
			
			for(int j=1;j<=col;j++) { //for column			
				
				String data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
				
				System.out.print(data+" | ");
			}
			System.out.println();
		}
		
		
	}

}
