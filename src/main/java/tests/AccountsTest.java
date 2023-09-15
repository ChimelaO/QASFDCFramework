package tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.SFDCListeners;
import pages.AccountsPage;
import utils.CommonUtils;
import utils.FileUtils;


@Listeners(SFDCListeners.class)
public class AccountsTest extends BaseTest{

	@Test 
	public void accountsTest_TC10(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		AccountsPage ap = new AccountsPage(driver);
		Assert.assertTrue(ap.selectAccountsfromTab());
		BaseTest.test.info("Clicked on accounts");
		CommonUtils.waitForElement(driver, ap.newButton);
		BaseTest.test.info("New Button is visible");
		Assert.assertTrue(ap.clickNewButton());
		BaseTest.test.info("Clicked on new button");
		CommonUtils.waitForElement(driver, ap.accName);
		Assert.assertTrue(ap.enterAccountName(FileUtils.readAccountTestData("accountName")));
		BaseTest.test.info("Created new account");
		Assert.assertTrue(ap.selectAccountType(driver));
		BaseTest.test.info("Selected account type");
		Assert.assertTrue(ap.selectPriorityType(driver));
		BaseTest.test.info("Selected priority type");
		Assert.assertTrue(ap.saveAccount());
		BaseTest.test.info("Saved account");
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void accountsTest_TC11(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		AccountsPage ap = new AccountsPage(driver);
		Assert.assertTrue(ap.selectAccountsfromTab());
		BaseTest.test.info("Clicked on accounts");
		CommonUtils.waitForElement(driver, ap.createNewView);
		BaseTest.test.info("New View is visible");
		Assert.assertTrue(ap.clickNewView());
		BaseTest.test.info("Clicked on new view");
		CommonUtils.waitForElement(driver, ap.viewName);
		Assert.assertTrue(ap.enterViewName(FileUtils.readAccountTestData("og.ViewName")));
		BaseTest.test.info("Created new view");
		Assert.assertTrue(ap.enterViewUniqueName(FileUtils.readAccountTestData("unique.ViewName")));
		BaseTest.test.info("Created new unique view name");
		Assert.assertTrue(ap.saveView());
		BaseTest.test.info("Saved View");
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void accountsTest_TC12(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		AccountsPage ap = new AccountsPage(driver);
		Assert.assertTrue(ap.selectAccountsfromTab());
		BaseTest.test.info("Clicked on accounts");
		CommonUtils.waitForElement(driver, ap.editViewBtn);
		Assert.assertTrue(ap.clickEditView());
		BaseTest.test.info("Clicked on edit view");
		CommonUtils.waitForElement(driver, ap.viewName);
		Assert.assertTrue(ap.enterViewName(FileUtils.readAccountTestData("new.ViewName")));
		BaseTest.test.info("Edited the view name");
		Assert.assertTrue(ap.selectField(driver));
		BaseTest.test.info("Selected field type");
		Assert.assertTrue(ap.selectOperator(driver));
		BaseTest.test.info("Selected operator");
		Assert.assertTrue(ap.enterValue(FileUtils.readAccountTestData("value")));
		BaseTest.test.info("Selected value");
		Assert.assertTrue(ap.saveView());
		BaseTest.test.info("Saved View");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void accountsTest_TC13(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		AccountsPage ap = new AccountsPage(driver);
		Assert.assertTrue(ap.selectAccountsfromTab());
		BaseTest.test.info("Clicked on accounts");
		CommonUtils.waitForElement(driver, ap.mergeAccountBtn);
		Assert.assertTrue(ap.clickMergeAccounts());
		BaseTest.test.info("Clicked on merge accounts");
		Assert.assertTrue(ap.findAccountsToMerge(FileUtils.readAccountTestData("merge_acc")));
		BaseTest.test.info("Found accounts to merge");
		Assert.assertTrue(ap.selectAccountsToMerge());
		BaseTest.test.info("Select accounts to merge");
		Assert.assertTrue(ap.mergeAccounts(driver));
		BaseTest.test.info("Merged accounts");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void accountsTest_TC14(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		AccountsPage ap = new AccountsPage(driver);
		Assert.assertTrue(ap.selectAccountsfromTab());
		BaseTest.test.info("Clicked on accounts");
		CommonUtils.waitForElement(driver, ap.lastActivityBtn);
		Assert.assertTrue(ap.clickLastActivity());
		BaseTest.test.info("Clicked on last activity");
//		CommonUtils.waitForElement(driver, ap.fromCalender);
//		Assert.assertTrue(ap.createFromDate(driver));
//		BaseTest.test.info("Created from date");
//		CommonUtils.waitForElement(driver, ap.toCalender);
//		Assert.assertTrue(ap.createToDate(driver));
//		BaseTest.test.info("Created to date");
		Assert.assertTrue(ap.clickSaveAccountReport());
		BaseTest.test.info("Clicked saved account report");
		CommonUtils.waitForElement(driver, ap.reportName);
		Assert.assertTrue(ap.enterReportName(FileUtils.readAccountTestData("report_name")));
		BaseTest.test.info("Entered report name");
		Assert.assertTrue(ap.enterReportUniqueName(FileUtils.readAccountTestData("report_unique_name")));
		BaseTest.test.info("Entered unique report name");
		Assert.assertTrue(ap.saveandRunReport());
		BaseTest.test.info("Saved and ran report");	
	}
	
}
