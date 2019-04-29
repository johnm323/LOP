package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.LorealPages_Utilities.CommonUtilities;

public class MegaMenu_Page {

	WebDriver driver;

	public MegaMenu_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//a[@class='expandMenu']")
	WebElement megaMenu;

	@FindBy(xpath = "//div[contains(@class,'expandMenu-box')]//a[contains(text(),'Hair Styling')]")
	WebElement HairStyling;

	@FindBy(xpath = "//div[@class='expandMenu-box']//a[contains(text(),'Makeup')]")
	WebElement Makeup;

	@FindBy(xpath = "//div[@class='expandMenu-box']//a[contains(text(),'Skin Care')]")
	WebElement SkinCare;

	@FindBy(xpath = "//div[@class='expandMenu-box']//a[contains(text(),'Hair Care')]")
	WebElement HairCare;

	@FindBy(xpath = "//div[contains(@class,'expandMenu-box')]//a[contains(text(),'Hair Colour')]")
	WebElement HairColor;

	@FindBy(xpath = "//div[contains(@class,'expandMenu-box')]//a[contains(text(),'MEN EXPERT')]")
	WebElement MenExpert;

	@FindBy(xpath = "//a[contains(@href,'/en/beautyblog/inspire-me')]")
	WebElement inspireME;

	@FindBy(xpath = "//a[contains(@href,'/en/beautyblog/tips')]")
	WebElement tips;

	@FindBy(xpath = "//a[contains(@href,'/en/beautyblog/tutorials')][contains(text(),'Tutorials')]")
	WebElement tutorials;

	@FindBy(xpath = "//a[contains(text(),'Close')]")
	WebElement close;

	@FindBy(xpath = "//a[contains(@class,'logo expand-logo')]")
	WebElement MegamenuLogo;

	@FindBy(xpath = "//div[contains(@class,'expandMenu-box')]//nav")
	WebElement entireMegamenuoptions;

	public void verifyMegamenuScreen() {

		String Actual_Result = MegamenuLogo.getText();
		Assert.assertTrue(Actual_Result.contains("PARIS"));

	}

	public void clickOnMegaMenu() {

		megaMenu.click();
		CommonUtilities.expliciteWait(driver, entireMegamenuoptions);

		System.out.println("Displays Megamenu options");
	}

	public void clickHairStyling() {

		System.out.println("Click on Hair Styling Megamenu option");
		CommonUtilities.expliciteWait(driver, HairStyling);
		HairStyling.click();

	}

	public void clickMakeup() {
		System.out.println("Click on Makeup Megamenu option");

		CommonUtilities.expliciteWait(driver, Makeup);
		Makeup.click();

	}

	public void clickskinCare() {
		System.out.println("Click on Skin Care Megamenu option");
		
		CommonUtilities.expliciteWait(driver, SkinCare);
		SkinCare.click();
	}

	public void clickhairCare() {
		System.out.println("Click on Hair Care Megamenu option");
		
		CommonUtilities.expliciteWait(driver, HairCare);
		HairCare.click();
	}

	public void clickhairColor() {
		System.out.println("Click on Hair Color Megamenu option");
		CommonUtilities.expliciteWait(driver, HairColor);
		HairColor.click();
	}

	public void clickmenExpert() {
		System.out.println("Click on Men Expert Megamenu option");
		
		CommonUtilities.expliciteWait(driver, MenExpert);
		MenExpert.click();
	}

	public void clickinspireMe() {
		System.out.println("Click on Inspire Me Megamenu option");
		
		CommonUtilities.expliciteWait(driver, inspireME);
		inspireME.click();
	}

	public void clicktips() {
		System.out.println("Click on Tips Megamenu option");
		
		CommonUtilities.expliciteWait(driver, tips);
		tips.click();
	}

	public void clicktutorials() {
		System.out.println("Click on Tutorials Megamenu option");
		
		CommonUtilities.expliciteWait(driver, tutorials);
		tutorials.click();

	}

}
