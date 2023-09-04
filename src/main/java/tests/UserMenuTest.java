package tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import constants.FileConstants;
import org.testng.Assert;
//import pages.LoginPage;
import pages.UserMenuPage;
import utils.CommonUtils;
import utils.FileUtils;
import listeners.SFDCListeners;


@Listeners(SFDCListeners.class)
public class UserMenuTest extends BaseTest {
	
//	@BeforeMethod
	public void navigateToHome() throws IOException {
//		WebDriver driver = BaseTest.getDriver();
		
	}
	
	@Test
	public void userMenuDropDown_TC06(Method name) throws IOException, InterruptedException {
		
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		
		UserMenuPage ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		BaseTest.test.info("Username is visible");
		ump.userMenu.click();
		BaseTest.test.info("Clicked on username");
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verify user menu options");
		BaseTest.test.info("Verified User Menu items");
		Assert.assertTrue(ump.selectMyProfile(), "");
		BaseTest.test.info("Selected my profile");
		CommonUtils.waitForElement(driver, ump.profilePage);
		BaseTest.test.info("Profile page loaded");
		Assert.assertTrue(ump.isProfilePageVisible(), "");
		ump.selectEditContact(driver);
		Assert.assertTrue(ump.verifyEditContactPopUp(driver), "");
		BaseTest.test.info("Edit contact pop up verified");
		Assert.assertTrue(ump.verifyLastNameChangeInAboutTab(driver, FileUtils.readUserMenuTestData("lastname")), "");
		BaseTest.test.info("Verified last name change");
		Assert.assertTrue(ump.verifyCreatePost(driver, FileUtils.readUserMenuTestData("post")));
		BaseTest.test.info("Verified create post");
		Assert.assertTrue(ump.verifyFileUpload(driver, FileConstants.LOGIN_TESTDATA_FILE_PATH));
		BaseTest.test.info("Verified file upload");
		Assert.assertTrue(ump.verifyPhotoUpload(driver, FileConstants.PROFILE_PHOTO_FILE_PATH));
		BaseTest.test.info("Verified photo upload");
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
		
	}
	
	@Test
	public void userMenuDropDown_TC08(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		UserMenuPage ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		BaseTest.test.info("Username is visible");
		ump.userMenu.click();
		BaseTest.test.info("Clicked on username");
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verify user menu options");
		BaseTest.test.info("Verified User Menu items");
		Assert.assertTrue(ump.selectDeveloperConsole(), "");
		BaseTest.test.info("Selected Developer Console");
		
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	@Test
	public void userMenuDropDown_TC09(Method name) throws IOException {
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		UserMenuPage ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		BaseTest.test.info("Username is visible");
		ump.userMenu.click();
		BaseTest.test.info("Clicked on username");
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verify user menu options");
		BaseTest.test.info("Verified User Menu items");
		Assert.assertTrue(ump.selectLogoutbutton());
		
		BaseTest.test.pass(name.getName()+"TEST PASSED");
	}
	
	

}
