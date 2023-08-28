package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Elements {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com/");
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		
		WebElement fname = driver.findElement(By.cssSelector("#fname")); 
		
		fname.sendKeys("Chimela");
		
		WebElement fbutton = driver.findElement(By.id("female"));
		fbutton.click();
		
		driver.navigate().to("https://www.website.com/sign-in/");
		
		WebElement login = driver.findElement(By.id("signin-submit2"));
		
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).above(login));
		
		password.sendKeys("haha");
		
		WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).above(password));
		
		username.sendKeys("Test Complete hoe!");
		
		 
		
		driver.close();
		driver.quit();

		
	}

}
