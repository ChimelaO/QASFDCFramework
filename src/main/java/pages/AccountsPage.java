package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage extends BasePage{

	public AccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//a[@title='Accounts Tab']")
	public WebElement accounts;
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement newButton;
	
	
	
	
	
	
	public boolean selectAccountsfromTab() {
		logger.info("Selecting accounts from Tab");
		boolean isSelected = false;
		if(accounts.isDisplayed()) {
			accounts.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean clickNewButton() {
		logger.info("Clicking new button");
		boolean isSelected = false;
		if(newButton.isDisplayed()) {
			newButton.click();
			isSelected = true;
		}
		return isSelected;	
	}
}
