package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC06_SalesForce {

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
		
		WebElement myProfileBtn = driver.findElement(By.xpath("//a[@title='My Profile']"));
		myProfileBtn.click();
		
		WebElement editBtn = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
		editBtn.click();
		
//		WebElement aboutBtn = driver.findElement(By.xpath("//a[contains(text(), 'About')]"));
//		aboutBtn.click();
//		
//		WebElement lname = driver.findElement(By.xpath("//input[@id = 'lastName']"));
//		lname.sendKeys("le");
//		
//		WebElement saveAllBtn = driver.findElement(By.xpath("//input[@value='Save All']"));
//		saveAllBtn.click();
//		
//		WebElement post = driver.findElement(By.xpath("//body[contains(text(), 'Share an update')]"));
//		post.sendKeys("What an amazing day");
//		
//		WebElement shareBtn = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
//		shareBtn.click();
	}

}
