package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HairColor_Page;
import com.LorealPages.MegaMenu_Page;
import com.LorealPages.MenExpert_Page;

public class MenExpert extends BaseClass {

	@Test(priority = 48)
	public void verifymenExpertPathPath() throws InterruptedException {

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		megamenu.clickOnMegaMenu();
		megamenu.clickmenExpert();

		logger = report.createTest("Verify Men Expert Path");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.verifymenExpertPath();

		logger.info("Verified Men Expert Path successfully");

	}

	@Test(priority = 49)
	public void verifymenExpertHeader() throws InterruptedException {

		logger = report.createTest("Verify Men Expert Header");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.verifymenExpertHeader();

		logger.info("Verified Men Expert Header successfully");

	}

	@Test(priority = 50)
	public void verifymenExpertDescription() throws InterruptedException {

		logger = report.createTest("Verify Hair Color Description");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.verifymenExpertDescription();

		logger.info("Verified Men Expert Description successfully");

	}

	@Test(priority = 51)
	public void verifymenExpertAllProducts() throws InterruptedException {

		logger = report.createTest("Verify Hair Care All Products");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.verifymenExpertAllProducts();
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-200)");

		logger.info("Verified Men Expert All Products successfully");
	}

	@Test(priority = 52)
	public void verifymenExpertProductGrid() throws InterruptedException {

		logger = report.createTest("Verify Men Expert Product Grid");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.verifymenExpertProductGrid();

		logger.info("Verified Men Expert Product Grid successfully");

	}

	@Test(priority = 53)
	public void verifymenExpertLoadMoreButton() throws InterruptedException {

		logger = report.createTest("Verify Men Expert Load Load More Button");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.verifymenExpertLoadMoreButton();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");
		logger.info("Verified Men Expert Load More Button successfully");

	}

	@Test(priority = 54)
	public void verifyLoadMoreisClickable() throws InterruptedException {

		logger = report.createTest("Verify Men Expert Load More Button is cickable");
		MenExpert_Page menexpert = PageFactory.initElements(driver, MenExpert_Page.class);

		menexpert.clickonLoadMoreButton();

		logger.info("Verified Men Expert Load More Button is clickable");

	}


}
