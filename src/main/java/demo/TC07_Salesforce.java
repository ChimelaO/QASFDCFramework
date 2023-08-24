package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07_Salesforce {

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
		
		WebElement settings = driver.findElement(By.xpath("//a[@title='My Settings']"));
		settings.click();
		
		WebElement personal = driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]"));
		personal.click();
		
		WebElement loginHistory = driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		loginHistory.click();
		
		WebElement download = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		download.click();
		
		WebElement displayLayout = driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]"));
		displayLayout.click();
		
		WebElement cusTabs = driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		cusTabs.click();
		
		WebElement cusapp = driver.findElement(By.xpath("//select[@id='p4']"));
		cusapp.click();
		
		WebElement salesfchat = driver.findElement(By.xpath("//*[@id=\"p4\"]/option[9]"));
		salesfchat.click();
		
		WebElement reportTab = driver.findElement(By.xpath("//option[@value='report']"));
		reportTab.click();
		
		WebElement addBtn = driver.findElement(By.xpath("//img[@title='Add']"));
		addBtn.click();
		
		WebElement emailBtn = driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]"));
		emailBtn.click();
		
		WebElement myEmail = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		myEmail.click();
		
		WebElement abbcBtn = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/div[1]"));
		abbcBtn.click();
		
		WebElement saveBtn = driver.findElement(By.xpath("//input[@title='Save']"));
		saveBtn.click();
		
		WebElement calRemBtn = driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('CalendarAndReminders');\"]"));
		calRemBtn.click();
		
		WebElement actRemBtn = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		actRemBtn.click();
		
		WebElement openTestBtn = driver.findElement(By.xpath("//input[@id='testbtn']"));
		openTestBtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
