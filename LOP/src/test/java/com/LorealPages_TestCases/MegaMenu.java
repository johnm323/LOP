package com.LorealPages_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.HomePageHeader_Page;
import com.LorealPages.MegaMenu_Page;
import com.LorealPages_Utilities.BrowserFactory;

public class MegaMenu extends BaseClass {

	@Test(priority = 3)
	public void clickMegamenu() {

		logger = report.createTest("Verify Megamenu is clickable");
		
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);

		megamenu.clickOnMegaMenu();

		logger.info("Megamenu is clickable");

	}

	@Test(priority = 4)
	public void clickonHairStyling() throws InterruptedException {
		Thread.sleep(2000);
		logger = report.createTest("Verify HairStyling is clickable");

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);

		megamenu.clickHairStyling();

		logger.info("HairStyling is clickable");

	}

	@Test(priority = 5)
	public void clickonMakeup() throws InterruptedException {
		
		Thread.sleep(2000);
		logger = report.createTest("Verify Makeup is clickable");

		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clickMakeup();

		logger.info("Makeup is clickable");

	}

	@Test(priority = 6)
	public void clickonSkinCare() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify Skin Care is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clickskinCare();

		logger.info("Skin Care is clickable");

	}

	@Test(priority = 7)
	public void clickonHairCare() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify Hair Care is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clickhairCare();

		logger.info("Hair Care is clickable");

	}

	@Test(priority = 8)
	public void clickonHairColor() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify Hair Color is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clickhairColor();

		logger.info("Hair Color is clickable");

	}

	@Test(priority = 9)
	public void clickonNewMen() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify New Men is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clickmenExpert();

		logger.info("New Men is clickable");

	}

	@Test(priority = 10)
	public void clickonInspireMe() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify Inspire Me is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clickinspireMe();

		logger.info("Inspire Me is clickable");

	}

	@Test(priority = 11)
	public void clickonTips() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify Tips is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clicktips();

		logger.info("Tips is clickable");

	}

	@Test(priority = 11)
	public void clickonTutorials() throws InterruptedException {
		
		Thread.sleep(2000);

		logger = report.createTest("Verify Tutorials is clickable");
		MegaMenu_Page megamenu = PageFactory.initElements(driver, MegaMenu_Page.class);
		clickMegamenu();
		megamenu.clicktutorials();

		logger.info("Tutorials is clickable");

	}

}
