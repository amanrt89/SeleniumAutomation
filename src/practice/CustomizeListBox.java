package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CustomizeListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/select-menu");
		Actions act=new Actions(driver);
		
		WebElement s=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
		act.scrollToElement(s);
		s.click();
		List<WebElement>ls=driver.findElements(By.xpath("//div[@tabindex='-1']"));
		for(WebElement x:ls)
		{
			System.out.println(x.getText());
		}

	}

}
