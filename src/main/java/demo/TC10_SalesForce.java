package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10_SalesForce {

	public static void main(String[] args) throws InterruptedException {
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
		
		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		accounts.click();
		
		WebElement newBtn = driver.findElement(By.xpath("//input[@title='New']"));
		newBtn.click();
		
		WebElement accName = driver.findElement(By.xpath("//input[@id='acc2']"));
		accName.sendKeys("account02");
		
		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
		type.click();
		
		WebElement techpart = driver.findElement(By.xpath("//*[@id=\"acc6\"]/option[7]"));
		techpart.click();
		
		WebElement cusPrio = driver.findElement(By.xpath("//select[@id='00NHu00000PEI36']"));
		cusPrio.click();
		
		WebElement high = driver.findElement(By.xpath("//*[@id=\"00NHu00000PEI36\"]/option[2]"));
		high.click();
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
