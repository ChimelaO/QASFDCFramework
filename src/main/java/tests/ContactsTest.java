package tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.SFDCListeners;
import pages.ContactsPage;
import utils.CommonUtils;
import utils.FileUtils;

@Listeners(SFDCListeners.class)
public class ContactsTest extends BaseTest {

	@Test 
	public void contactsTest_TC25(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.newBtn);
		cp.newBtn.click();
		BaseTest.test.info("clicked on new");
		CommonUtils.waitForElement(driver, cp.lastName);
		cp.lastName.sendKeys(FileUtils.readContactsTestData("last_name"));
		BaseTest.test.info("Entered last name into field");
		CommonUtils.waitForElement(driver, cp.accName);
		cp.accName.sendKeys(FileUtils.readContactsTestData("account_name"));
		BaseTest.test.info("Entered account name into field");
		cp.saveBtn.click();
		BaseTest.test.info("Saved contact");

		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC26(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.createNewView);
		cp.createNewView.click();
		BaseTest.test.info("clicked on create new view");
		CommonUtils.waitForElement(driver, cp.viewName);
		cp.viewName.sendKeys(FileUtils.readContactsTestData("vn"));
		BaseTest.test.info("Entered view name into field");
		CommonUtils.waitForElement(driver, cp.viewUniqueName);
		cp.viewUniqueName.sendKeys(FileUtils.readContactsTestData("vun"));
		BaseTest.test.info("Entered unique view name into field");
		cp.saveView.click();
		BaseTest.test.info("Saved contact");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC27(Method name) {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.recentDropdown);
		Assert.assertTrue(cp.selectRecentlyCreatedfromDropdown());
		BaseTest.test.info("Selected recently created from dropdown");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC28(Method name) {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.contactViewDropdown);
		Assert.assertTrue(cp.selectMyContactsfromDropdown());
		BaseTest.test.info("Selected my contacts from dropdown");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC29(Method name) {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.nameField);
		cp.nameField.click();
		BaseTest.test.info("Name field is selected");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC30(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.createNewView);
		cp.createNewView.click();
		BaseTest.test.info("Clicked on create new view");
		CommonUtils.waitForElement(driver, cp.viewUniqueName);
		cp.viewUniqueName.sendKeys(FileUtils.readContactsTestData("vun1"));
		cp.saveView.click();
		Assert.assertTrue(cp.validateErrorMessage(driver));
		BaseTest.test.info("Error message displayed");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC31(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.createNewView);
		cp.createNewView.click();
		BaseTest.test.info("clicked on create new view");
		CommonUtils.waitForElement(driver, cp.viewName);
		cp.viewName.sendKeys(FileUtils.readContactsTestData("cvn"));
		BaseTest.test.info("Entered view name into field");
		CommonUtils.waitForElement(driver, cp.viewUniqueName);
		cp.viewUniqueName.sendKeys(FileUtils.readContactsTestData("cvun"));
		BaseTest.test.info("Entered unique view name into field");
		CommonUtils.waitForElement(driver, cp.cancel);
		cp.cancel.click();
		BaseTest.test.info("Canceled view");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test 
	public void contactsTest_TC32(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		ContactsPage cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsTab);
		cp.contactsTab.click();
		BaseTest.test.info("Selected contacts from tab");
		CommonUtils.waitForElement(driver, cp.newBtn);
		cp.newBtn.click();
		BaseTest.test.info("clicked on new");
		CommonUtils.waitForElement(driver, cp.lastName);
		cp.lastName.sendKeys(FileUtils.readContactsTestData("svn_last_name"));
		BaseTest.test.info("Entered last name into field");
		CommonUtils.waitForElement(driver, cp.accName);
		cp.accName.sendKeys(FileUtils.readContactsTestData("svn_account_name"));
		BaseTest.test.info("Entered account name into field");
		CommonUtils.waitForElement(driver, cp.saveandNew);
		cp.saveandNew.click();
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	
}
