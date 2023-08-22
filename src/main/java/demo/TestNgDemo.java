package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void search() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium" + Keys.ENTER);
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
