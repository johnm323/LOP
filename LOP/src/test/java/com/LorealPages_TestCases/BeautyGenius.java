package com.LorealPages_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.BeautyGenius_Page;

public class BeautyGenius extends BaseClass {

	@Test(priority = 55)
	public void verifybeautyGeniusIcon() throws InterruptedException {

		logger = report.createTest("Verify Beauty Genius Icon");
		BeautyGenius_Page beautygenius = PageFactory.initElements(driver, BeautyGenius_Page.class);

		beautygenius.verifybeautyGeniusIcon();

		logger.info("Verified Beauty Genius Icon successfully");

	}

	@Test(priority = 56)
	public void verifybeautyGeniusLogo() throws InterruptedException {

		logger = report.createTest("Verify Beauty Genius Header");
		BeautyGenius_Page beautygenius = PageFactory.initElements(driver, BeautyGenius_Page.class);

		beautygenius.verifybeautyGeniusLogo();

		logger.info("Verified Beauty Genius Header successfully");

	}

	@Test(priority = 57)
	public void verifybeautyGeniusHeader() throws InterruptedException {

		logger = report.createTest("Verify Beauty Genius Description");
		BeautyGenius_Page beautygenius = PageFactory.initElements(driver, BeautyGenius_Page.class);

		beautygenius.verifybeautyGeniusHeader();

		logger.info("Verified Beauty Genius Description successfully");

	}

	@Test(priority = 58)
	public void verifybeautyGeniusRegistrationForm() throws InterruptedException {

		logger = report.createTest("Verify Beauty Genius Form");
		BeautyGenius_Page beautygenius = PageFactory.initElements(driver, BeautyGenius_Page.class);

		beautygenius.verifybeautyGeniusRegistrationForm();

		logger.info("Verified Beauty Genius Form successfully");
	}

	@Test(priority = 59)
	public void verifymenExpertProductGrid() throws InterruptedException {

		logger = report.createTest("Verify Beauty Genius Registration Buttons");
		BeautyGenius_Page beautygenius = PageFactory.initElements(driver, BeautyGenius_Page.class);

		beautygenius.verifybeautyGeniusRegistrationButtons();

		logger.info("Verified Beauty Genius Registration Buttons successfully");

	}

}
