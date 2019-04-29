package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HairColor_Page;
import com.LorealPages.MegaMenu_Page;

public class HairColor extends BaseClass {

	@Test(priority = 41)
	public void verifyhairColorPathPath() throws InterruptedException {

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		megamenu.clickOnMegaMenu();
		megamenu.clickhairColor();

		logger = report.createTest("Verify Hair Color Path");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.verifyhairColorPath();

		logger.info("Verified Hair Color Path successfully");

	}

	@Test(priority = 42)
	public void verifyhairColorHeader() throws InterruptedException {

		logger = report.createTest("Verify Hair Color Header");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.verifyhairColorHeader();

		logger.info("Verified Hair Color Header successfully");

	}

	@Test(priority = 43)
	public void verifyhairColorDescription() throws InterruptedException {

		logger = report.createTest("Verify Hair Color Description");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.verifyhairColorDescription();

		logger.info("Verified Hair Color Description successfully");

	}

	@Test(priority = 44)
	public void verifyhairColorAllProducts() throws InterruptedException {

		logger = report.createTest("Verify Hair Care All Products");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.verifyhairColorAllProducts();
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-200)");

		logger.info("Verified Hair Color All Products successfully");
	}

	@Test(priority = 45)
	public void verifyhairColorProductGrid() throws InterruptedException {

		logger = report.createTest("Verify Hair Color Product Grid");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.verifyhairColorProductGrid();

		logger.info("Verified Hair Color Product Grid successfully");

	}

	@Test(priority = 46)
	public void verifyhairColorLoadMoreButton() throws InterruptedException {

		logger = report.createTest("Verify Hair Color Load More Button");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.verifyhairColorLoadMoreButton();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");
		logger.info("Verified Hair Styling Load More Button successfully");

	}

	@Test(priority = 47)
	public void verifyLoadMoreisClickable() throws InterruptedException {

		logger = report.createTest("Verify Hair Color Load More Button is cickable");
		HairColor_Page hairCare = PageFactory.initElements(driver, HairColor_Page.class);

		hairCare.clickonLoadMoreButton();

		logger.info("Verified Hair Color Load More Button is clickable");

	}


}
