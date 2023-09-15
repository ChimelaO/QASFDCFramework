package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.FileUtils;

public class OpportunitiesPage extends BasePage {
	
	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@title='Opportunities Tab']")
	public WebElement opportunities;
	
	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement opportunitiesDropdown;
	
	@FindBy(xpath = "//select[@id='fcf']/option")
	public List<WebElement> opportunitiesDropdownItems;
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement newBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Opportunity Pipeline']")
	public WebElement oppPipeline;
	
	@FindBy(xpath = "//a[normalize-space()='Stuck Opportunities']")
	public WebElement stuckOpp;
	
	@FindBy(xpath = "//input[@title='Run Report']")
	public WebElement runReport;
	
	public boolean selectOpportunitiesfromTab() {
		logger.info("Selecting opportunities");
		boolean isSelected = false;
		if(opportunities.isDisplayed()) {
			opportunities.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean verifyOpportunitiesDropdownItems() throws IOException {
		logger.info("OpportunitiesPage : verifyOpportunitiesDropdownItems : started");
		boolean isItemVerified = true;
		
		String[] expectedDropdownItems = FileUtils.readOpportunitiesTestData("opportunities_dropdown").split(",");
		
		for(int i =0; i < expectedDropdownItems.length; i++) {
			String actualItem = opportunitiesDropdownItems.get(i).getText();
			
			if(expectedDropdownItems[i].equals(actualItem)) {
				
				logger.info("Option: " +expectedDropdownItems[i] + " || Actual Option: " + actualItem);
				
			} else {
				logger.warn("Opportunities Page : verify dropdown Items : Failed to match the order of dropdown");
				logger.info("Expected option " + expectedDropdownItems[i] + "failed to match with Actual Option" + actualItem);
				isItemVerified = false;
			}
		}
		return isItemVerified;
		
	}
	
	
}
