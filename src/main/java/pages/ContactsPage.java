package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.CommonUtils;

public class ContactsPage extends BasePage {
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//a[@title='Contacts Tab']")
	public WebElement contactsTab;
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement newBtn;
	
	@FindBy(xpath = "//input[@id='name_lastcon2']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='con4']")
	public WebElement accName;
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")
	public WebElement saveBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Create New View']")
	public WebElement createNewView;
	
	@FindBy(xpath = "//input[@id='fname']")
	public WebElement viewName;
	
	@FindBy(xpath = "//input[@id='devname']")
	public WebElement viewUniqueName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	public WebElement saveView;
	
	@FindBy(xpath = "//select[@id='hotlist_mode']")
	public WebElement recentDropdown;
	
	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement contactViewDropdown;
	
	@FindBy(xpath = "//a[contains(text(),'LastName')]")
	public WebElement nameField;
	
	@FindBy(xpath = "//div[@class='requiredInput']//div[@class='errorMsg']")
	public WebElement errorMessage;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")
	public WebElement cancel;
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save & New']")
	public WebElement saveandNew;
	
	
	
	public boolean validateErrorMessage(WebDriver driver) {
		logger.info("Validating error message");
		boolean isSeen = false;
		CommonUtils.waitForElement(driver, errorMessage);
		if(errorMessage.isDisplayed()) {
			isSeen = true;
		}
		return isSeen;
	}
	
	
	public boolean selectMyContactsfromDropdown() {
		logger.info("Selecting my contacts");
		boolean isSelected = false;
		if(contactViewDropdown.isDisplayed()) {
			contactViewDropdown.click();
			Select dropdown = new Select(contactViewDropdown);
			dropdown.selectByVisibleText("My Contacts");
			isSelected = true;
		}
		return isSelected;
	}
	
	public boolean selectRecentlyCreatedfromDropdown() {
		logger.info("Selecting recently created");
		boolean isSelected = false;
		if(recentDropdown.isDisplayed()) {
			recentDropdown.click();
			Select dropdown = new Select(recentDropdown);
			dropdown.selectByVisibleText("Recently Created");
			isSelected = true;
		}
		
		return isSelected;
	}
	
}