package tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import listeners.SFDCListeners;
import pages.OpportunitiesPage;
import utils.CommonUtils;

@Listeners(SFDCListeners.class)
public class OpportunitiesTest extends BaseTest{
	
	@Test 
	public void opportunitiesTest_TC15(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		ExtentTest test = BaseTest.threadExtentTest.get();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, op.opportunities);
		Assert.assertTrue(op.selectOpportunitiesfromTab());
		test.info("Selected opportunities from tab");
		CommonUtils.waitForElement(driver, op.opportunitiesDropdown);
		op.opportunitiesDropdown.click();
		Assert.assertTrue(op.verifyOpportunitiesDropdownItems(), "Failed to verify opportunities dropdown items");
		test.info("Verified opportunities dropdown items");
		
		test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void opportunitiesTest_TC16(Method name){
		WebDriver driver = BaseTest.getDriver();
		ExtentTest test = BaseTest.threadExtentTest.get();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, op.opportunities);
		Assert.assertTrue(op.selectOpportunitiesfromTab());
		test.info("Selected opportunities from tab");
		CommonUtils.waitForElement(driver, op.newBtn);
		op.newBtn.click();
		test.info("Clicked on new");
		
		test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void opportunitiesTest_TC17(Method name){
		WebDriver driver = BaseTest.getDriver();
		ExtentTest test = BaseTest.threadExtentTest.get();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, op.opportunities);
		Assert.assertTrue(op.selectOpportunitiesfromTab());
		test.info("Selected opportunities from tab");
		CommonUtils.waitForElement(driver, op.oppPipeline);
		op.oppPipeline.click();
		test.info("Clicked on Opportunity Pipeline");
		
		test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void opportunitiesTest_TC18(Method name){
		WebDriver driver = BaseTest.getDriver();
		ExtentTest test = BaseTest.threadExtentTest.get();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, op.opportunities);
		Assert.assertTrue(op.selectOpportunitiesfromTab());
		test.info("Selected opportunities from tab");
		CommonUtils.waitForElement(driver, op.stuckOpp);
		op.stuckOpp.click();
		test.info("Clicked on Stuck opportunities");
		
		test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void opportunitiesTest_TC19(Method name){
		WebDriver driver = BaseTest.getDriver();
		ExtentTest test = BaseTest.threadExtentTest.get();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, op.opportunities);
		Assert.assertTrue(op.selectOpportunitiesfromTab());
		test.info("Selected opportunities from tab");
		CommonUtils.waitForElement(driver, op.runReport);
		op.runReport.click();
		test.info("Clicked on run report");
		
		test.pass(name.getName()+"TEST PASSED");
	}
}
