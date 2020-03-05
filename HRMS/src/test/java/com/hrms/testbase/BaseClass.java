package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.hrms.utils.ConfigReader;
import com.hrms.utils.Constants;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentHtmlReporter html;
	public static ExtentTest test;
	
	@BeforeTest(alwaysRun=true)
	public void generateReports() {
		ConfigReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		html=new ExtentHtmlReporter(Constants.REPORT_FILEPATH);
		html.config().setTheme(Theme.STANDARD);
		html.config().setDocumentTitle("Syntax Batch V Report");
		html.config().setReportName("HRM Execution Report");
		
		report=new ExtentReports();
		report.attachReporter(html);
		report.setSystemInfo("QA Engineer", Constants.USER_NAME);
		report.setSystemInfo("Environemnt", "Test");
		report.setSystemInfo("OS Name", Constants.OS_NAME);
		report.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
	}
	@AfterTest(alwaysRun=true)
	public void completeReport() {
		report.flush();
	}
    @BeforeMethod(alwaysRun=true)
    public void setUp() {
    	ConfigReader.readProperties(Constants.CREDENTIALS_FILEPATH);
        switch (ConfigReader.getProperty("browser").toLowerCase()) {
        case "chrome":
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            break;
        case "firefox":
            System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
            driver = new FirefoxDriver();
            break;
        default:
            System.err.println("Browser is not supported");
        }
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
    }
    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}