package tests;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import constants.FileConstants;
import pages.LoginPage;

public class BaseTest {
	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	
	static ExtentReports extent = new ExtentReports();
	static ExtentSparkReporter spark = null;
	public static ExtentTest test = null;
	
	public static Logger logger = LogManager.getLogger("BASETEST");
	 
// Requirements
// Cross browser support
// Parallel support -
// Proper reporting - Accurate Assertions
// Generate logs in the framework
	
	@BeforeMethod
	public void setup(Method name) throws IOException {
		BaseTest.test = extent.createTest(name.getName());
		logger.info("BaseTest: setup : " + name.getName()+ "Test Object for reporting is created");
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(driver);
	}
	
//	@AfterTest
//	public void tearDown(Method name) {
//		logger.info("BaseTest : tearDown : "+ name.getName()+" Tear downn called");
//	}
	
	@Parameters({"browserName","isHeadless"})
	@BeforeTest
	public void setDriver(String browserName, boolean isHeadless) {
		spark = new ExtentSparkReporter(new File(FileConstants.REPORT_PATH));
		extent.attachReporter(spark);
		logger.info("BaseTest : setDriver :  Spark report configured");
		WebDriver driver = BaseTest.getBrowserType(browserName, isHeadless);
		logger.info("BaseTest : setDriver : driver object assigned");
		threadLocalDriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		return threadLocalDriver.get();
	}
	
	@AfterTest
	public static void removeDriver() throws InterruptedException {
		getDriver().close();
		threadLocalDriver.remove();
		logger.info("BaseTest : removeDriver : removed driver");
		extent.flush();
	}
	
	public static WebDriver getBrowserType(String browserName, boolean headless) {
		
		WebDriver driver;
		
		String browserType = browserName.toLowerCase();
		
		switch (browserType) {
		case "chrome":
			if (headless) {
				ChromeOptions co = new ChromeOptions();
				logger.info("BaseTest : getBrowserType : Headless chrome configured");
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
			} else {
				driver = new ChromeDriver();
				logger.info("BaseTest : getBrowserType : Chrome configured");
			}
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			logger.info("BaseTest : getBrowserType : Firefox configured");
			break;
			
		case "safari":
			driver = new SafariDriver();
			logger.info("BaseTest : getBrowserType : Safari configured");
			break;
			
		case "egde":
			driver = new EdgeDriver();
			logger.info("BaseTest : getBrowserType : EdgeDriver configured");
			break;

		default:
			driver = null;
			logger.fatal("BaseTest : getBrowserType : Incorrect browser name supplied");
			break;
		}
		
		return driver;
	}

}
