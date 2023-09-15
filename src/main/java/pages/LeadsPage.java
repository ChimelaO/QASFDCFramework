package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.FileUtils;

public class LeadsPage extends BasePage {
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//a[@title='Leads Tab']")
	public WebElement leadsTab;
	
	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement leadsDropdown;
	
	@FindBy(xpath = "//select[@id='fcf']/option")
	public List<WebElement> leadsDropdownItems;
	
	@FindBy(xpath = "//input[@title='Go!']")
	public WebElement leadsGoBtn;
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement leadsNewBtn;
	
	@FindBy(id = "name_lastlea2")
	public WebElement lastName;
	
	@FindBy(id = "lea3")
	public WebElement companyName;
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")
	public WebElement saveBtn;
	
	
	
	public boolean selectTodaysLeadfromDropdown() {
		logger.info("Selecting todays view");
		boolean isSelected = false;
		if(leadsDropdown.isDisplayed()) {
			leadsDropdown.click();
			Select dropdown = new Select(leadsDropdown);
			dropdown.selectByVisibleText("Today's Leads");
			isSelected = true;
		}
		return isSelected;
	}
	
	public boolean selectLeadsfromTab() {
		logger.info("Saving report");
		boolean isSelected = false;
		if(leadsTab.isDisplayed()) {
			leadsTab.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean verifyLeadsDropdownItems() throws IOException {
		logger.info("LeadsPage : verifyLeadsDropdownItems : started");
		boolean isItemVerified = true;
		
		String[] expectedDropdownItems = FileUtils.readLeadsTestData("leads_dropdown").split(",");
		
		for(int i =0; i < expectedDropdownItems.length; i++) {
			String actualItem = leadsDropdownItems.get(i).getText();
			
			if(expectedDropdownItems[i].equals(actualItem)) {
				
				logger.info("Option: " +expectedDropdownItems[i] + " || Actual Option: " + actualItem);
				
			} else {
				logger.warn("Leads Page : verify dropdown items : Failed to match the order of leads dropdown");
				logger.info("Expected option " + expectedDropdownItems[i] + "failed to match with Actual Option" + actualItem);
				isItemVerified = false;
			}
		}
		return isItemVerified;
		
	}
}
