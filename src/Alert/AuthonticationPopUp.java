package Alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthonticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");

		boolean b1=driver.findElement(By.xpath("//p[contains(text(),\"Congratulations! You must have the proper credentials.\")]")).isDisplayed();

		System.out.println(b1);

	}

}
