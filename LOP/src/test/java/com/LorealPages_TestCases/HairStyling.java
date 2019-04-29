package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HairStyling_Page;
import com.LorealPages.MegaMenu_Page;

public class HairStyling extends BaseClass {

	@Test(priority = 13)
	public void verifyhairStylePath() throws InterruptedException {

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		megamenu.clickOnMegaMenu();
		megamenu.clickHairStyling();

		logger = report.createTest("Verify Hair Styling Path");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.verifyhairStylePath();

		logger.info("Verified Hair Styling Path successfully");

	}

	@Test(priority = 14)
	public void verifyhairStyleHeader() throws InterruptedException {

		logger = report.createTest("Verify Hair Styling Header");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.verifyhairStyleHeader();

		logger.info("Verified Hair Styling Header successfully");

	}

	@Test(priority = 15)
	public void verifyhairStyleDescription() throws InterruptedException {

		logger = report.createTest("Verify Hair Styling Description");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.verifyhairStyleDescription();

		logger.info("Verified Hair Styling Description successfully");

	}

	@Test(priority = 16)
	public void verifyhairStyleAllProducts() throws InterruptedException {

		logger = report.createTest("Verify Hair Styling All Products");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.verifyhairStyleAllProducts();
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-200)");

		logger.info("Verified Hair Styling All Products successfully");
	}

	@Test(priority = 17)
	public void verifyhairStyleProductGrid() throws InterruptedException {

		logger = report.createTest("Verify Hair Styling Product Grid");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.verifyhairStyleProductGrid();

		logger.info("Verified Hair Styling Product Grid successfully");

	}

	@Test(priority = 18)
	public void verifyhairStyleLoadMoreButton() throws InterruptedException {

		logger = report.createTest("Verify Hair Styling Load More Button");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.verifyhairStyleLoadMoreButton();
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");
		logger.info("Verified Hair Styling Load More Button successfully");

	}

	@Test(priority = 19)
	public void verifyLoadMoreisClickable() throws InterruptedException {

		logger = report.createTest("Verify Hair Styling Load More Button is cickable");
		HairStyling_Page hairstyle = PageFactory.initElements(driver, HairStyling_Page.class);

		hairstyle.clickonLoadMoreButton();

		logger.info("Verified Hair Styling Load More Button is clickable");

	}

}
