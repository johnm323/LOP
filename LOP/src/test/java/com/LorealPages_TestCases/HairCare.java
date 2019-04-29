package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HairCare_Page;
import com.LorealPages.MegaMenu_Page;
import com.LorealPages_Utilities.BrowserFactory;

public class HairCare extends BaseClass {

	@Test(priority = 34)
	public void verifyhairCarePathPath() throws InterruptedException {

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		megamenu.clickOnMegaMenu();
		megamenu.clickhairCare();

		logger = report.createTest("Verify Hair Care Path");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.verifyhairCarePath();

		logger.info("Verified Hair Care Path successfully");

	}

	@Test(priority = 35)
	public void verifyhairCareHeader() throws InterruptedException {
		
		logger = report.createTest("Verify Hair Care Header");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.verifyhairCareHeader();

		logger.info("Verified Hair Care Header successfully");

	}

	@Test(priority = 36)
	public void verifyhairCareDescription() throws InterruptedException {

		logger = report.createTest("Verify Hair Care Description");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.verifyhairCareDescription();

		logger.info("Verified Hair Care Description successfully");

	}

	@Test(priority = 37)
	public void verifyhairCareAllProducts() throws InterruptedException {

		logger = report.createTest("Verify Hair Care All Products");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.verifyhairCareAllProducts();
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-200)");

		logger.info("Verified Skin Care All Products successfully");
	}

	@Test(priority = 38)
	public void verifyhairCareProductGrid() throws InterruptedException {

		logger = report.createTest("Verify Hair Care Product Grid");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.verifyhairCareProductGrid();

		logger.info("Verified Hair Care Product Grid successfully");

	}

	@Test(priority = 39)
	public void verifyhairCareLoadMoreButton() throws InterruptedException {

		logger = report.createTest("Verify Hair Care Load More Button");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.verifyhairCareLoadMoreButton();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");
		logger.info("Verified Hair Styling Load More Button successfully");

	}

	@Test(priority = 40)
	public void verifyLoadMoreisClickable() throws InterruptedException {

		logger = report.createTest("Verify Hair Care Load More Button is cickable");
		HairCare_Page hairCare = PageFactory.initElements(driver, HairCare_Page.class);

		hairCare.clickonLoadMoreButton();

		logger.info("Verified Hair Care Load More Button is clickable");

	}

}
