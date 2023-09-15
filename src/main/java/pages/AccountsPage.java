package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;

public class AccountsPage extends BasePage{

	public AccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//a[@title='Accounts Tab']")
	public WebElement accounts;
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement newButton;
	
	@FindBy(xpath = "//a[normalize-space()='Create New View']")
	public WebElement createNewView;
	
	@FindBy(xpath = "//input[@id='acc2']")
	public WebElement accName;
	
	@FindBy(xpath = "//input[@id='fname']")
	public WebElement viewName;
	
	@FindBy(id = "devname")
	public WebElement uniqueName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement saveView;
	
	@FindBy(id = "acc6")
	public WebElement typeDropdown;
	
	@FindBy(xpath = "//*[@id=\"acc6\"]/option[7]")
	public WebElement techPartnerDropdown;
	
	@FindBy(id = "00NHu00000PEI36")
	public WebElement customerPriorityDropdown;
	
	@FindBy(xpath = "//*[@id=\"00NHu00000PEI36\"]/option[2]")
	public WebElement highPriority;
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")
	public WebElement saveAccountBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Edit']")
	public WebElement editViewBtn;
	
	@FindBy(xpath = "//select[@id='fcol1']")
	public WebElement fieldDropdown;
	
	@FindBy(xpath = "//*[@id=\"fcol1\"]/option[2]")
	public WebElement accNameOption;
	
	@FindBy(xpath = "//select[@id='fop1']")
	public WebElement operatorDropdown;
	
	@FindBy(xpath = "//*[@id=\"fop1\"]/option[4]")
	public WebElement containsOption;
	
	@FindBy(xpath = "//input[@id='fval1']")
	public WebElement valueTextbox;
	
	@FindBy(xpath = "//a[normalize-space()='Merge Accounts']")
	public WebElement mergeAccountBtn;
	
	@FindBy(id = "srch")
	public WebElement mergeAccountTextbox;
	
	@FindBy(xpath = "//input[@name='srchbutton']")
	public WebElement mergeAccountSearchButton;
	
	@FindBy(xpath = "//input[@id='cid0']")
	public WebElement acc1;
	
	@FindBy(xpath = "//input[@id='cid1']")
	public WebElement acc2;
	
	@FindBy(xpath = "//div[@class='pbTopButtons']//input[@title='Next']")
	public WebElement next;
	
	@FindBy(xpath = "//div[@class='pbTopButtons']//input[@title='Merge']")
	public WebElement merge;
	
	@FindBy(xpath = "//a[normalize-space()='Accounts with last activity > 30 days']")
	public WebElement lastActivityBtn;
	
	@FindBy(id = "ext-gen152")
	public WebElement fromCalender;
	
	@FindBy(xpath = "//button[@id='ext-gen276']")
	public WebElement fromToday;
	
	@FindBy(id = "ext-gen154")
	public WebElement toCalender;
	
	@FindBy(xpath = "//button[@id='ext-gen277']")
	public WebElement toToday;
	
	@FindBy(xpath = "//button[@id='ext-gen49']")
	public WebElement saveReport;
	
	@FindBy(xpath = "//input[@id='saveReportDlg_reportNameField']")
	public WebElement reportName;
	
	@FindBy(xpath = "//input[@id='saveReportDlg_DeveloperName']")
	public WebElement uniqueReportName;
	
	@FindBy(xpath = "//button[normalize-space()='Save and Run Report']")
	public WebElement saveRunReport;
	
	
	public boolean saveandRunReport() {
		logger.info("Saving report");
		boolean isSelected = false;
		if(saveRunReport.isDisplayed()) {
			saveRunReport.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean enterReportName(String rValue) {
		logger.info("Entering report name");
		boolean isEntered = false;
		if(reportName.isDisplayed()) {
			reportName.click();
			reportName.sendKeys(rValue);
			isEntered = true;
		}
		return isEntered;	
	}
	
	public boolean enterReportUniqueName(String urValue) {
		logger.info("Entering unique report name");
		boolean isEntered = false;
		if(uniqueReportName.isDisplayed()) {
			uniqueReportName.click();
			uniqueReportName.sendKeys(urValue);
			isEntered = true;
		}
		return isEntered;	
	}
	
	public boolean clickSaveAccountReport() {
		logger.info("Clicking save report");
		boolean isSelected = false;
		if(saveReport.isDisplayed()) {
			saveReport.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean createFromDate(WebDriver driver) {
		logger.info("Creating from Date");
		boolean isSelected = false;
		if(fromCalender.isDisplayed()) {
			fromCalender.click();
			CommonUtils.waitForElement(driver, fromToday);
			fromToday.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean createToDate(WebDriver driver) {
		logger.info("Creating to Date");
		boolean isSelected = false;
		if(toCalender.isDisplayed()) {
			toCalender.click();
			CommonUtils.waitForElement(driver, toToday);
			toToday.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean clickLastActivity() {
		logger.info("Clicking last Activity Tab");
		boolean isSelected = false;
		if(lastActivityBtn.isDisplayed()) {
			lastActivityBtn.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
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
	
	public boolean clickNewView() {
		logger.info("Clicking create new view");
		boolean isSelected = false;
		if(createNewView.isDisplayed()) {
			createNewView.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean enterAccountName(String acName) {
		logger.info("Creating new view");
		boolean isCreated = false;
		if(accName.isDisplayed()) {
			accName.click();
			accName.clear();
			accName.sendKeys(acName);
			isCreated = true;
		}
		return isCreated;	
	}
	
	public boolean selectAccountType(WebDriver driver) {
		logger.info("Selecting account type");
		boolean isSelected = false;
		if(typeDropdown.isDisplayed()) {
			typeDropdown.click();
			CommonUtils.waitForElement(driver, techPartnerDropdown );
			techPartnerDropdown.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean selectPriorityType(WebDriver driver) {
		logger.info("Selecting account type");
		boolean isSelected = false;
		if(customerPriorityDropdown.isDisplayed()) {
			customerPriorityDropdown.click();
			CommonUtils.waitForElement(driver, highPriority );
			highPriority.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean selectField(WebDriver driver) {
		logger.info("Selecting field");
		boolean isSelected = false;
		if(fieldDropdown.isDisplayed()) {
			fieldDropdown.click();
			CommonUtils.waitForElement(driver, accNameOption );
			accNameOption.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean selectOperator(WebDriver driver) {
		logger.info("Selecting operator");
		boolean isSelected = false;
		if(operatorDropdown.isDisplayed()) {
			operatorDropdown.click();
			CommonUtils.waitForElement(driver, containsOption );
			containsOption.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean enterValue(String sValue) {
		logger.info("Inserting value");
		boolean isCreated = false;
		if(valueTextbox.isDisplayed()) {
			valueTextbox.click();
			valueTextbox.clear();
			valueTextbox.sendKeys(sValue);
			isCreated = true;
		}
		return isCreated;	
	}
	
	public boolean saveAccount() {
		logger.info("Clicking new button");
		boolean isSelected = false;
		if(saveAccountBtn.isDisplayed()) {
			saveAccountBtn.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean enterViewName(String nView) {
		logger.info("Creating new view");
		boolean isCreated = false;
		if(viewName.isDisplayed()) {
			viewName.click();
			viewName.clear();
			viewName.sendKeys(nView);
			isCreated = true;
		}
		return isCreated;	
	}
	
	public boolean enterViewUniqueName(String uView) {
		logger.info("Creating new view");
		boolean isCreated = false;
		if(uniqueName.isDisplayed()) {
			uniqueName.click();
			uniqueName.clear();
			uniqueName.sendKeys(uView);
			isCreated = true;
		}
		return isCreated;	
	}
	
	public boolean saveView() {
		logger.info("Saving new view");
		boolean isSelected = false;
		if(saveView.isDisplayed()) {
			saveView.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean clickEditView() {
		logger.info("Clicking create new view");
		boolean isSelected = false;
		if(editViewBtn.isDisplayed()) {
			editViewBtn.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean clickMergeAccounts() {
		logger.info("Clicking merge accounts");
		boolean isSelected = false;
		if(mergeAccountBtn.isDisplayed()) {
			mergeAccountBtn.click();
			isSelected = true;
		}
		return isSelected;	
	}
	
	public boolean findAccountsToMerge(String mValue) {
		logger.info("Finding accounts to merge");
		boolean isFound = false;
		if(mergeAccountTextbox.isDisplayed() && mergeAccountSearchButton.isDisplayed()) {
			mergeAccountTextbox.click();
			mergeAccountTextbox.clear();
			mergeAccountTextbox.sendKeys(mValue);
			mergeAccountSearchButton.click();
			isFound = true;
		}
		return isFound;	
	}
	
	public boolean selectAccountsToMerge() {
		logger.info("Selecting accounts to merge");
		boolean isSelected = false;
		if(acc1.isDisplayed()&& acc2.isDisplayed()) {
			if(acc1.isSelected() && acc2.isSelected()) {
				isSelected = true;
				next.click();
			} 
			else {
				acc1.click();
				acc2.click();
				isSelected = true;
				next.click();
			}	
		}
		return isSelected;
	}
	
	public boolean mergeAccounts(WebDriver driver) {
		logger.info("Merging accounts");
		boolean isSelected = false;
		if(merge.isDisplayed()) {
			merge.click();
			Alert alert = driver.switchTo().alert();
			CommonUtils.waitForAlert(driver, alert);
			alert.accept();
			isSelected = true;
		}
		return isSelected;	
	}
	
	
	

	
	 
	
}
