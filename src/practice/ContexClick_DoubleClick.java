package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		
		WebElement w= driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(w).perform();
		
		WebElement copy= driver.findElement(By.xpath("//span[text()='Copy']"));
		act.click(copy).perform();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
    	alt.accept();
		Thread.sleep(2000);
		
		WebElement w2=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(w2).perform();
		alt.accept();
	}

}
