package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.LorealPages_Utilities.CommonUtilities;

public class SkinCare_Page {

	WebDriver driver;

	public SkinCare_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//li[contains(text(),'Skin Care')]")
	WebElement skinCarePath;

	// @FindBy(xpath="//strong[contains(text(),'Hair')]") WebElement
	// hairStyleHeader;
	@FindBy(xpath = "//strong[contains(text(),'EXPERTS IN SKINCARE')]")
	WebElement skinCareHeader;

	@FindBy(xpath = "//*[contains(text(),'With more than 30 years of dedicated research')]")
	WebElement skinCareDescription;

	@FindBy(xpath = "//h3[contains(text(),'All products')]")
	WebElement skinCareAllProducts;

	@FindBy(xpath = "//strong[@class='panelName']")
	WebElement skinCareAToZ;

	@FindBy(xpath = "//div[@class='grids slider sliderGrid sliderGridHome']//div[@class='sliderContent']//div[@class='wrapper']")
	WebElement skinCareProductGrid;
	
	

	// @FindBy(xpath="//a[@class='more-content']") WebElement
	// hairStyleLoadMoreButton;

	@FindBy(xpath = "//a[contains(text(),'Load More')]")
	WebElement skinCareLoadMoreButton;

	public void verifyskinCarePath() {

		try {
			CommonUtilities.expliciteWait(driver, skinCarePath);
			CommonUtilities.highLightElement(driver, skinCarePath);

			String Actual_Result = skinCarePath.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Hair Styling"));
			 */

			if (Actual_Result.contains("Skin Care")) {
				System.out.println("Skin Care Navigation Path is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyskinCareHeader() {

		try {
			CommonUtilities.expliciteWait(driver, skinCareHeader);
			CommonUtilities.highLightElement(driver, skinCareHeader);

			String Actual_Result = skinCareHeader.getText();
			/*
			 * System.out.println("Hair Style Header is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("STYLING"));
			 */

			if (Actual_Result.contains("EXPERTS IN SKINCARE")) {
				System.out.println("EXPERTS IN SKINCARE Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairStyleDescription() {

		try {
			CommonUtilities.expliciteWait(driver, skinCareDescription);
			CommonUtilities.highLightElement(driver, skinCareDescription);

			String Actual_Result = skinCareDescription.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Become the Trend"));
			 */

			if (Actual_Result.contains("With more than 30 years")) {
				System.out.println("Skin Care Description is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyskinCareAllProducts() {

		try {
			CommonUtilities.expliciteWait(driver, skinCareAllProducts);
			CommonUtilities.scrollIntoView(driver, skinCareAllProducts);
			CommonUtilities.highLightElement(driver, skinCareAllProducts);

			String Actual_Result = skinCareAllProducts.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("All products"));
			 */

			if (Actual_Result.contains("All products")) {
				System.out.println("All products banner is displayed");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyskinCareProductGrid() {

		try {
			CommonUtilities.expliciteWait(driver, skinCareProductGrid);
			CommonUtilities.scrollIntoView(driver, skinCareAllProducts);
			CommonUtilities.highLightElement(driver, skinCareProductGrid);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyskinCareLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait(driver, skinCareLoadMoreButton);
			CommonUtilities.scrollIntoView(driver, skinCareLoadMoreButton);
			CommonUtilities.highLightElement(driver, skinCareLoadMoreButton);

			String Actual_Result = skinCareLoadMoreButton.getText();
			/*
			 * System.out.println("Load More is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("LOAD MORE"));
			 */

			if (Actual_Result.contains("LOAD MORE")) {
				System.out.println("LOAD MORE button is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void clickonLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait_Clickable(driver, skinCareLoadMoreButton);
			skinCareLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
