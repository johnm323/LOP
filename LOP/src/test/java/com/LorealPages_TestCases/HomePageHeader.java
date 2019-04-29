package com.LorealPages_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HomePageHeader_Page;
import com.LorealPages_Utilities.BrowserFactory;

public class HomePageHeader extends BaseClass {

	@Test(priority = 1)
	public void verifyLogo() {

		logger = report.createTest("Verify Logo");

		HomePageHeader_Page homePageHeader = PageFactory.initElements(driver, HomePageHeader_Page.class);

		homePageHeader.HomePageLogo();

		// logger.info("Logo Verified");

	}

	@Test(priority = 2)
	public void clickOnLogo() {

		logger = report.createTest("Verify Logo is clickable");

		HomePageHeader_Page homePageHeader = PageFactory.initElements(driver, HomePageHeader_Page.class);

		homePageHeader.clickLogo();

		// logger.info("Logo is clickable");

	}

}
