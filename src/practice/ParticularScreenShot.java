package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ParticularScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jiocinema.com/");
		WebElement w=driver.findElement(By.xpath("//img[@id='jiocinema-logo']"));
		
		File src=w.getScreenshotAs(OutputType.FILE);
		File dec=new File("C:\\Users\\Hp\\Workspace1\\SeleniumAutomation\\src\\ScreenShot\\logo.jpg");
		FileHandler.copy(src, dec);
		

	}

}
