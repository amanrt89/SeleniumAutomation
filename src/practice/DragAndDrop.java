package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement w2=driver.findElement(By.xpath("//div[@id='box106']"));
		//act.dragAndDrop(w1, w2).perform();
		act.moveToElement(w1).perform();
		act.clickAndHold().perform();
		act.moveToElement(w2).perform();
		act.release().perform();
	

	}

}
