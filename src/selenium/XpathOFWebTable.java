package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathOFWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://datatables.net/");
		List<WebElement>w=driver.findElements(By.xpath("//table//tr[td[text()='New York']]/td[1]"));
		
		for(WebElement name:w) {
			System.out.println(name.getText());
		}
		

	}

}
