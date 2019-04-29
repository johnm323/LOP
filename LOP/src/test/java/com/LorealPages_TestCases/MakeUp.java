package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.MakeUp_Page;
import com.LorealPages.MegaMenu_Page;

public class MakeUp extends BaseClass {

	@Test(priority = 20)
	public void verifymakeUpPath() throws InterruptedException {

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		megamenu.clickOnMegaMenu();
		megamenu.clickMakeup();

		logger = report.createTest("Verify Makeup Path");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);
		makeup.verifymakeUpPath();

		logger.info("Verified Makeup Path successfully");

	}

	@Test(priority = 21)
	public void verifymakeUpHeader() {

		logger = report.createTest("Verify Makeup Header");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);

		makeup.verifymakeUpHeader();

		logger.info("Verified Makeup Header successfully");

	}

	@Test(priority = 22)
	public void verifymakeUpDescription() {

		logger = report.createTest("Verify Makeup Description");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);

		makeup.verifymakeUpDescription();

		logger.info("Verified Makeup Description successfully");

	}

	@Test(priority = 23)
	public void verifymakeUpAllProducts() {

		logger = report.createTest("Verify makeUp All Products");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);

		makeup.verifymakeUpAllProducts();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-200)");

		logger.info("Verified makeUp All Products successfully");
	}

	@Test(priority = 24)
	public void verifymakeUpProductGrid() {

		logger = report.createTest("Verify Makeup Product Grid");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);

		makeup.verifymakeUpProductGrid();

		logger.info("Verified Makeup Product Grid successfully");

	}

	@Test(priority = 25)
	public void verifymakeUpLoadMoreButton() {

		logger = report.createTest("Verify Makeup Load More Button");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);

		makeup.verifymakeUpLoadMoreButton();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");

		logger.info("Verified Makeup Load More Button successfully");

	}

	@Test(priority = 26)
	public void verifyLoadMoreisClickable() {

		logger = report.createTest("Verify Makeup Load More Button is cickable");
		MakeUp_Page makeup = PageFactory.initElements(driver, MakeUp_Page.class);

		makeup.clickonLoadMoreButton();

		logger.info("Verified Makeup Load More Button is clickable");

	}

}
