package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.LorealPages_Utilities.CommonUtilities;

public class BeautyGenius_Page {

	WebDriver driver;

	public BeautyGenius_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//div[@class='public-only']//a[@class='myaccount']")
	WebElement beautyGeniusIcon;

	@FindBy(xpath = "//img[@class='bg-logo']")
	WebElement beautyGeniusLogo;

	@FindBy(xpath = "//ul[@class='benefits-list']")
	WebElement beautyGeniusBenefits;

	@FindBy(xpath = "//a[@class='cta-transp step step-desktop']")
	WebElement beautyGeniusBenefitsStartButtton;

	@FindBy(xpath = "//h3[contains(text(),'Beauty')]")
	WebElement beautyGeniusHeader;

	@FindBy(xpath = "//div[@id='formRegister']")
	WebElement beautyGeniusRegistrationForm;

	@FindBy(xpath = "//div[@id='mainRegister']//ul[@class='btns']")
	WebElement beautyGeniusRegistrationButtons;

	public void verifybeautyGeniusIcon() {

		try {
			CommonUtilities.expliciteWait(driver, beautyGeniusIcon);
			CommonUtilities.highLightElement(driver, beautyGeniusIcon);

			boolean iconpresent = beautyGeniusIcon.isDisplayed();
			Assert.assertTrue(iconpresent);

			beautyGeniusIcon.click();

		} catch (Exception e) {
			System.out.println("Beauty Genius Icon is not present" + e.getMessage());
		}

		/*
		 * String Actual_Result = beautyGeniusIcon.getText();
		 * 
		 * if (Actual_Result.contains("myaccount")) { System.out.println(
		 * "Beauty Genius Icon is displayed successfully"); }
		 */

	}

	public void verifybeautyGeniusLogo() {

		try {
			CommonUtilities.expliciteWait(driver, beautyGeniusLogo);
			CommonUtilities.highLightElement(driver, beautyGeniusLogo);

			boolean logoDisplayed = beautyGeniusLogo.isDisplayed();
			Assert.assertTrue(logoDisplayed);
		} catch (Exception e) {
			System.out.println("Beauty Genius Icon is not present" + e.getMessage());

		}

		/*
		 * String Actual_Result = beautyGeniusLogo.getText();
		 * 
		 * if (Actual_Result.contains("EXPERT")) { System.out.println(
		 * "Men Expert Header is displayed successfully"); }
		 */

	}

	public void verifybeautyGeniusHeader() {

		try {
			CommonUtilities.expliciteWait(driver, beautyGeniusHeader);
			CommonUtilities.highLightElement(driver, beautyGeniusHeader);

			String Actual_Result = beautyGeniusHeader.getText();
			System.out.println("*********************" + Actual_Result);

			if (Actual_Result.contains("Genius")) {
				System.out.println("Beauty Genius Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifybeautyGeniusRegistrationForm() {

		try {

			if (beautyGeniusBenefits.isDisplayed()) {
				CommonUtilities.highLightElement(driver, beautyGeniusBenefits);
				CommonUtilities.scrollIntoView(driver, beautyGeniusBenefitsStartButtton);
				beautyGeniusBenefitsStartButtton.click();
				
				Thread.sleep(2000);
				CommonUtilities.expliciteWait(driver, beautyGeniusRegistrationForm);
				CommonUtilities.scrollIntoView(driver, beautyGeniusRegistrationForm);
				CommonUtilities.highLightElement(driver, beautyGeniusRegistrationForm);

				boolean formDisplayed = beautyGeniusRegistrationForm.isDisplayed();
				Assert.assertTrue(formDisplayed);

			} else{
				CommonUtilities.expliciteWait(driver, beautyGeniusRegistrationForm);
				CommonUtilities.scrollIntoView(driver, beautyGeniusRegistrationForm);
				CommonUtilities.highLightElement(driver, beautyGeniusRegistrationForm);

				boolean formDisplayed = beautyGeniusRegistrationForm.isDisplayed();
				Assert.assertTrue(formDisplayed);
				
			}

		} catch (Exception e) {
			System.out.println("Form is not present" + e.getMessage());

		}

		/*
		 * String Actual_Result = beautyGeniusRegistrationForm.getText();
		 * 
		 * 
		 * if (Actual_Result.contains("All products")) { System.out.println(
		 * "All products banner is displayed"); }
		 */

	}

	public void verifybeautyGeniusRegistrationButtons() {

		try {
			CommonUtilities.expliciteWait(driver, beautyGeniusRegistrationButtons);
			CommonUtilities.scrollIntoView(driver, beautyGeniusRegistrationButtons);
			CommonUtilities.highLightElement(driver, beautyGeniusRegistrationButtons);

			boolean registrationButtons = beautyGeniusRegistrationButtons.isDisplayed();
			Assert.assertTrue(registrationButtons);
		} catch (Exception e) {
			System.out.println("Beauty Genius Icon is not present" + e.getMessage());
		}

	}

}
