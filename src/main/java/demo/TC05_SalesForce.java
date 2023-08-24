package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05_SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://login.salesforce.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name= 'username']"));
		username.sendKeys("chime02@certified.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name= 'pw']"));
		password.sendKeys("Jesus//2002");
		
		WebElement login = driver.findElement(By.xpath("//input[@id= 'Login']"));
		login.click();
		
		WebElement userBtn = driver.findElement(By.id("userNavLabel"));
		userBtn.click();
		
		
//		driver.close();
//		driver.quit();

	}

}
