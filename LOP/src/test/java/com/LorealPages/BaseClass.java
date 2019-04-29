package com.LorealPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.LorealPages_Utilities.BrowserFactory;
import com.LorealPages_Utilities.CommonUtilities;
import com.LorealPages_Utilities.ConfigDataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void initSetup() {

		config = new ConfigDataProvider();

		ExtentHtmlReporter extent = new ExtentHtmlReporter(
				new File(System.getProperty("user.dir") + "/Reports/" + CommonUtilities.currentDateTime() + ".html"));
		// ExtentHtmlReporter extent = new ExtentHtmlReporter(new
		// File(System.getProperty("user.dir")+"/Reports/LOP.html"));

		report = new ExtentReports();
		report.attachReporter(extent);

	}

	@BeforeSuite
	public void launchApp() {

		System.out.println("Launching Application");
		driver = BrowserFactory.launchApplication(driver, config.getBrowser(), config.getURL());
		// System.out.println(driver.getTitle());

	}

	/*
	 * @AfterClass public void closeBrowser(){
	 * BrowserFactory.closeBrowser(driver);
	 * 
	 * }
	 */

	@AfterMethod
	public void takeScreenshot(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {

			logger.fail("Test Failed",
					MediaEntityBuilder.createScreenCaptureFromPath(CommonUtilities.captureScreenshot(driver)).build());

		} else if (result.getStatus() == ITestResult.SUCCESS) {

			logger.pass("Test Passed",
					MediaEntityBuilder.createScreenCaptureFromPath(CommonUtilities.captureScreenshot(driver)).build());

		}

		report.flush();
		
		//System.out.println("Close Browser");
		//BrowserFactory.closeBrowser(driver);
	}
	

	


}
