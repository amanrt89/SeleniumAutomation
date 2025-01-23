package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		WebElement w=driver.findElement(By.xpath("//select[@id='month']"));
		Select sel=new Select(w);
		sel.selectByVisibleText("Jun");
		
		List<WebElement> s=driver.findElements(By.xpath("//select[@id='day']/option"));
        String ex="20";
		for(WebElement x:s)
		{
			String act=x.getText();
			if(ex.equals(act))
			{
				x.click();
				break;
			}
		}
		Actions act =new Actions(driver);
		WebElement y=driver.findElement(By.xpath("//select[@id='year']"));
		act.click(y).perform();
		act.sendKeys("2015").perform();
		act.click().perform();
		//act.sendKeys(Keys.END).perform();
		
		
	}

}
