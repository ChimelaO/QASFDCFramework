package tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.SFDCListeners;
import pages.LeadsPage;
import utils.CommonUtils;
import utils.FileUtils;

@Listeners(SFDCListeners.class)
public class LeadsTest extends BaseTest {

	@Test 
	public void leadsTest_TC20(Method name) {
		WebDriver driver = BaseTest.getDriver();
		LeadsPage lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsTab);
		Assert.assertTrue(lp.selectLeadsfromTab());
		BaseTest.test.info("Selected leads from tab");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
		
	}
	
	@Test 
	public void leadsTest_TC21(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		LeadsPage lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsTab);
		Assert.assertTrue(lp.selectLeadsfromTab());
		BaseTest.test.info("Selected leads from tab");
		CommonUtils.waitForElement(driver, lp.leadsDropdown);
		lp.leadsDropdown.click();
		Assert.assertTrue(lp.verifyLeadsDropdownItems(), "Failed to verify leads dropdown items");
		BaseTest.test.info("Verified leads dropdown items");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
		
	}
	
	@Test 
	public void leadsTest_TC22(Method name) {
		WebDriver driver = BaseTest.getDriver();
		LeadsPage lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsTab);
		Assert.assertTrue(lp.selectLeadsfromTab());
		BaseTest.test.info("Selected leads from tab");
		CommonUtils.waitForElement(driver, lp.leadsGoBtn);
		lp.leadsGoBtn.click();
		BaseTest.test.info("Clicked on Go");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
		
	}
	
	@Test 
	public void leadsTest_TC23(Method name)  {
		WebDriver driver = BaseTest.getDriver();
		LeadsPage lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsTab);
		Assert.assertTrue(lp.selectLeadsfromTab());
		BaseTest.test.info("Selected leads from tab");
		CommonUtils.waitForElement(driver, lp.leadsDropdown);
		Assert.assertTrue(lp.selectTodaysLeadfromDropdown());
		BaseTest.test.info("Selected todays lead");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void leadsTest_TC24(Method name) throws IOException  {
		WebDriver driver = BaseTest.getDriver();
		LeadsPage lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsTab);
		Assert.assertTrue(lp.selectLeadsfromTab());
		BaseTest.test.info("Selected leads from tab");
		CommonUtils.waitForElement(driver, lp.leadsNewBtn);
		lp.leadsNewBtn.click();
		BaseTest.test.info("Clicked new leads");
		CommonUtils.waitForElement(driver, lp.lastName);
		lp.lastName.sendKeys(FileUtils.readLeadsTestData("lastname_field"));
		BaseTest.test.info("Inserted value into last name field");
		CommonUtils.waitForElement(driver, lp.companyName);
		lp.companyName.sendKeys(FileUtils.readLeadsTestData("companyname_field"));
		BaseTest.test.info("Inserted value into company field");
		lp.saveBtn.click();
		BaseTest.test.info("Saved new lead");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
}
