package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.LorealPages_Utilities.CommonUtilities;

public class MenExpert_Page {

	WebDriver driver;

	public MenExpert_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//li[contains(text(),'MEN EXPERT')]")
	WebElement menExpertPath;

	// @FindBy(xpath="//strong[contains(text(),'Hair')]") WebElement
	// hairStyleHeader;
	@FindBy(xpath = "//h1[contains(text(),'EXPERT')]")
	WebElement menExpertHeader;

	@FindBy(xpath = "//*[contains(text(),'Advanced technology powered')]")
	WebElement menExpertDescription;

	@FindBy(xpath = "//h3[contains(text(),'All products')]")
	WebElement menExpertAllProducts;

	@FindBy(xpath = "//strong[@class='panelName']")
	WebElement menExpertAToZ;

	@FindBy(xpath = "//div[contains(@class,'grids slider sliderGrid sliderGridHome')]//div[contains(@class,'sliderContent')]//div[contains(@class,'wrapper')]")
	WebElement menExpertProductGrid;

	// @FindBy(xpath="//a[@class='more-content']") WebElement
	// hairStyleLoadMoreButton;

	@FindBy(xpath = "//a[contains(text(),'Load More')]")
	WebElement menExpertLoadMoreButton;

	public void verifymenExpertPath() {

		try {
			CommonUtilities.expliciteWait(driver, menExpertPath);
			CommonUtilities.highLightElement(driver, menExpertPath);

			String Actual_Result = menExpertPath.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Hair Styling"));
			 */

			if (Actual_Result.contains("Men Expert")) {
				System.out.println("Men Expert Navigation Path is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifymenExpertHeader() {

		try {
			CommonUtilities.expliciteWait(driver, menExpertHeader);
			CommonUtilities.highLightElement(driver, menExpertHeader);

			String Actual_Result = menExpertHeader.getText();

			/*
			 * System.out.println("Hair Style Header is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("STYLING"));
			 */

			if (Actual_Result.contains("EXPERT")) {
				System.out.println("Men Expert Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifymenExpertDescription() {

		try {
			CommonUtilities.expliciteWait(driver, menExpertDescription);
			CommonUtilities.highLightElement(driver, menExpertDescription);

			String Actual_Result = menExpertDescription.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Become the Trend"));
			 */

			if (Actual_Result.contains("Advanced technology powered by raw ingredients")) {
				System.out.println("Men Expert Description is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifymenExpertAllProducts() {

		try {
			CommonUtilities.expliciteWait(driver, menExpertAllProducts);
			CommonUtilities.scrollIntoView(driver, menExpertAllProducts);
			CommonUtilities.highLightElement(driver, menExpertAllProducts);

			String Actual_Result = menExpertAllProducts.getText();
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

	public void verifymenExpertProductGrid() {

		try {
			CommonUtilities.expliciteWait(driver, menExpertProductGrid);
			CommonUtilities.scrollIntoView(driver, menExpertAllProducts);
			CommonUtilities.highLightElement(driver, menExpertProductGrid);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifymenExpertLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait(driver, menExpertLoadMoreButton);
			CommonUtilities.scrollIntoView(driver, menExpertLoadMoreButton);
			CommonUtilities.highLightElement(driver, menExpertLoadMoreButton);

			String Actual_Result = menExpertLoadMoreButton.getText();
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
			CommonUtilities.expliciteWait_Clickable(driver, menExpertLoadMoreButton);
			menExpertLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
