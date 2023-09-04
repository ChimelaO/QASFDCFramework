package tests;

import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
//import org.testng.Assert;
import org.testng.annotations.Test;

import constants.FileConstants;
import listeners.SFDCListeners;
import pages.LoginPage;
import utils.FileUtils;


@Listeners(SFDCListeners.class)
public class LoginTest extends BaseTest {
	
	
	@Test
	public void loginTest1() throws InvalidFormatException, IOException, InterruptedException {
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
//		driver.get("https://login.salesforce.com");
		lp.username.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH, "username"));
		lp.password.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "password"));
		
//		Assert.assertEquals(lp.selectRememberMeCheckBox(), "");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value = 'Jesus//2002';", lp.password);
//		
//		Thread.sleep(8000);
//		lp.loginButton.click();
	}
	
	
	

}
