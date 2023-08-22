package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC25_SalesForce {

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
		
		WebElement conBtn = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		conBtn.click();
		
		WebElement newBtn = driver.findElement(By.xpath("//input[@title='New']"));
		newBtn.click();
		
		WebElement lastName = driver.findElement(By.id("name_lastcon2"));
		lastName.sendKeys("LastName");		
		
		WebElement account = driver.findElement(By.id("con4"));
		account.sendKeys("<AccountName>");	
		
		WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
		save.click();
		
		
		
		
		
		
	}

}
