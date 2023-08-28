package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://xe.com/");
		
//		WebElement email = driver.findElement(By.id("email_field"));
//		WebElement password = driver.findElement(By.id("password_field"));
//		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
//		//WebElement WidgetButton = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
//		
//		email.sendKeys("admin123@gmail.com");
//		
//		password.sendKeys("admin123");
//		
//		LoginButton.click();
//		//WidgetButton.click();
		
		Thread.sleep(5000);
	}
}
