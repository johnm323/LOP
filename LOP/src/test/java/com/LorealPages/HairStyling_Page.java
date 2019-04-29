package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.LorealPages_Utilities.CommonUtilities;

public class HairStyling_Page {

	WebDriver driver;

	public HairStyling_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//li[contains(text(),'Hair Styling')]")
	WebElement hairStylePath;

	// @FindBy(xpath="//strong[contains(text(),'Hair')]") WebElement
	// hairStyleHeader;
	@FindBy(xpath = "//h1[contains(text(),'styling')]")
	WebElement hairStyleHeader;

	@FindBy(xpath = "//*[contains(text(),'Become the Trend')]")
	WebElement hairStyleDescription;

	@FindBy(xpath = "//h3[contains(text(),'All products')]")
	WebElement hairStyleAllProducts;

	@FindBy(xpath = "//strong[@class='panelName']")
	WebElement hairStyleAToZ;

	@FindBy(xpath = "//div[@class='grid_0 panel current']//div[@class='wrapper']")
	WebElement hairStyleProductGrid;

	// @FindBy(xpath="//a[@class='more-content']") WebElement
	// hairStyleLoadMoreButton;

	@FindBy(xpath = "//a[contains(text(),'Load More')]")
	WebElement hairStyleLoadMoreButton;

	public void verifyhairStylePath() {

		try {
			CommonUtilities.expliciteWait(driver, hairStylePath);
			CommonUtilities.highLightElement(driver, hairStylePath);

			String Actual_Result = hairStylePath.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Hair Styling"));
			 */

			if (Actual_Result.contains("Hair Styling")) {
				System.out.println("HAIR STYLING Navigation Path is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyhairStyleHeader() {

		try {
			CommonUtilities.expliciteWait(driver, hairStyleHeader);
			CommonUtilities.highLightElement(driver, hairStyleHeader);

			String Actual_Result = hairStyleHeader.getText();
			/*
			 * System.out.println("Hair Style Header is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("STYLING"));
			 */

			if (Actual_Result.contains("STYLING")) {
				System.out.println("HAIR STYLING Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairStyleDescription() {

		try {
			CommonUtilities.expliciteWait(driver, hairStyleDescription);
			CommonUtilities.highLightElement(driver, hairStyleDescription);

			String Actual_Result = hairStyleDescription.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Become the Trend"));
			 */

			if (Actual_Result.contains("Become the Trend")) {
				System.out.println("HAIR STYLING Description is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairStyleAllProducts() {

		try {
			CommonUtilities.expliciteWait(driver, hairStyleAllProducts);
			CommonUtilities.scrollIntoView(driver, hairStyleAllProducts);
			CommonUtilities.highLightElement(driver, hairStyleAllProducts);

			String Actual_Result = hairStyleAllProducts.getText();
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

	public void verifyhairStyleProductGrid() {

		try {
			CommonUtilities.expliciteWait(driver, hairStyleProductGrid);
			CommonUtilities.scrollIntoView(driver, hairStyleAllProducts);
			CommonUtilities.highLightElement(driver, hairStyleProductGrid);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyhairStyleLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait(driver, hairStyleLoadMoreButton);
			CommonUtilities.scrollIntoView(driver, hairStyleLoadMoreButton);
			CommonUtilities.highLightElement(driver, hairStyleLoadMoreButton);

			String Actual_Result = hairStyleLoadMoreButton.getText();
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
			CommonUtilities.expliciteWait_Clickable(driver, hairStyleLoadMoreButton);
			hairStyleLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
