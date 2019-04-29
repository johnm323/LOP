package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HairStyling_Page;
import com.LorealPages.MegaMenu_Page;
import com.LorealPages.SkinCare_Page;

public class SkinCare extends BaseClass {

	@Test(priority = 27)
	public void verifyskinCarePathPath() throws InterruptedException {

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		megamenu.clickOnMegaMenu();
		megamenu.clickskinCare();

		logger = report.createTest("Verify Skin Care Path");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);

		skinCare.verifyskinCarePath();

		logger.info("Verified Skin Care Path successfully");

	}

	@Test(priority = 28)
	public void verifyskinCareHeader() throws InterruptedException {

		logger = report.createTest("Verify Skin Care Header");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);

		skinCare.verifyskinCareHeader();

		logger.info("Verified Skin Care Header successfully");

	}

	@Test(priority = 29)
	public void verifyskinCareDescription() throws InterruptedException {

		logger = report.createTest("Verify Skin Care Description");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);
		
		skinCare.verifyhairStyleDescription();

		logger.info("Verified Skin Care Description successfully");

	}

	@Test(priority = 30)
	public void verifyskinCareAllProducts() throws InterruptedException {

		logger = report.createTest("Verify Skin Care All Products");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);

		skinCare.verifyskinCareAllProducts();
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-200)");

		logger.info("Verified Skin Care All Products successfully");
	}

	@Test(priority = 31)
	public void verifyskinCareProductGrid() throws InterruptedException {

		logger = report.createTest("Verify Skin Care Product Grid");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);
		
		skinCare.verifyskinCareProductGrid();

		logger.info("Verified Skin Care Product Grid successfully");

	}

	@Test(priority = 32)
	public void verifyskinCareLoadMoreButton() throws InterruptedException {

		logger = report.createTest("Verify Skin Care Load More Button");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);
		
		skinCare.verifyskinCareLoadMoreButton();
		
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");
		logger.info("Verified Hair Styling Load More Button successfully");

	}

	@Test(priority = 33)
	public void verifyLoadMoreisClickable() throws InterruptedException {

		logger = report.createTest("Verify Skin Care Load More Button is cickable");
		SkinCare_Page skinCare = PageFactory.initElements(driver, SkinCare_Page.class);

		skinCare.clickonLoadMoreButton();

		logger.info("Verified Skin Care Load More Button is clickable");

	}

}
