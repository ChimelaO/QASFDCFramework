package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class XETest {
	
	WebDriver driver;
	
	public void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://xe.com/");
	}
	
	@Test
	public void xetest() {
		WebElement fromDropdown = driver.findElement(By.xpath("//input[@id='midmarketFromCurrency']"));
		fromDropdown.sendKeys("USD" + Keys.ENTER);
		
		WebElement toDropdown = driver.findElement(By.xpath("//input[@id='midmarketToCurrency']"));
		toDropdown.sendKeys("INR" + Keys.ENTER);
		
		WebElement convert = driver.findElement(By.xpath("//button[normalize-space()='Convert']"));
		convert.click();
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(6000);
		driver.close();
		driver.quit();
	}
	
}
