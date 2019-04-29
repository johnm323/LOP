package com.LorealPages_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.AllProducts_Page;
import com.LorealPages.BaseClass;


public class AllProducts extends BaseClass {

	@Test(priority = 60)
	public void verifyallProductLink() throws InterruptedException {

		logger = report.createTest("Verify Hair Care Path");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.verifyallProductLink();

		logger.info("Verified Product Link in the header successfully");

	}

	@Test(priority = 61)
	public void verifyallProductHeader() throws InterruptedException {
		
		logger = report.createTest("Verify All Product Header");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.verifyallProductHeader();

		logger.info("Verified All Product Header successfully");

	}

	@Test(priority = 62)
	public void verifyallProductsFilters() throws InterruptedException {

		logger = report.createTest("Verify Filter is Displayed");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.verifyallProductsFilters();

		logger.info("Verified Filter is displayed successfully");

	}

	@Test(priority = 63)
	public void verifyallProductsOpenFilterOptions() throws InterruptedException {

		logger = report.createTest("Verify Filter Options are displayed");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.verifyallProductsOpenFilterOptions();

		logger.info("Filter Options are displayed successfully");
	}
	

	@Test(priority = 64)
	public void verifyallProductsClearAll() throws InterruptedException {

		logger = report.createTest("Verify Clear All is displayed");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.verifyallProductsClearAll();

		logger.info("Verified Clear All is displayed successfully");

	}

	@Test(priority = 65)
	public void verifyallProductsGrid() throws InterruptedException {

		logger = report.createTest("Verify Product Grid is displayed");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.verifyallProductsGrid();

		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("window.scrollBy(0,-450)");
		logger.info("Verified Product Grid is displayed successfully");

	}

	@Test(priority = 66)
	public void verifyclickonLoadMoreButton() throws InterruptedException {

		logger = report.createTest("Verify All Product Load More Button is cickable");
		AllProducts_Page allproducts = PageFactory.initElements(driver, AllProducts_Page.class);

		allproducts.clickonLoadMoreButton();

		logger.info("Verified all product Load More Button is clickable");

	}

}
