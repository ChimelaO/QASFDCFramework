package tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.SFDCListeners;
import pages.AccountsPage;
import utils.CommonUtils;


@Listeners(SFDCListeners.class)
public class AccountsTest extends BaseTest{

	@Test (invocationCount = 3)
	public void accountsTest_TC10(Method name) {
		WebDriver driver = BaseTest.getDriver();
		AccountsPage ap = new AccountsPage(driver);
		Assert.assertTrue(ap.selectAccountsfromTab());
		BaseTest.test.info("Clicked on accounts");
		CommonUtils.waitForElement(driver, ap.newButton);
		BaseTest.test.info("New Button is visible");
		Assert.assertTrue(ap.clickNewButton());
		BaseTest.test.info("Clicked on new button");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
}
