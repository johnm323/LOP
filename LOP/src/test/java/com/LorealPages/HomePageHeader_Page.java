package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.LorealPages_Utilities.BrowserFactory;

public class HomePageHeader_Page {

	WebDriver driver;

	public HomePageHeader_Page(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(xpath = "//a[@class='logo']")
	WebElement logo;

	public void HomePageLogo() {

		String Actual_Result = logo.getText();
		Assert.assertTrue(Actual_Result.contains("PARIS"));
	}

	public void clickLogo() {

		logo.click();

	}

}
