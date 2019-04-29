package com.LorealPages_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LorealPages.BaseClass;
import com.LorealPages.BrokenLinks_Page;

public class BrokenLinks extends BaseClass {

	@Test(priority = 67)
	public void verifyBrokenLinksandImages() throws MalformedURLException, IOException {

		logger = report.createTest("Verify Broken Links and Images");
		BrokenLinks_Page BL = PageFactory.initElements(driver, BrokenLinks_Page.class);

		BL.verifyBrokenLinkList();
		
		logger.info("Verified Broken Links and Images");

	}

	
}
