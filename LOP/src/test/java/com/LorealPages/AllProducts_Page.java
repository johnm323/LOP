package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.LorealPages_Utilities.CommonUtilities;

public class AllProducts_Page {

	WebDriver driver;

	public AllProducts_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//a[@class='all'][contains(text(),'All Products')]")
	WebElement allProductLink;

	@FindBy(xpath = "//strong[contains(text(),'All')]")
	WebElement allProductHeader;

	@FindBy(xpath = "//a[contains(text(),'Add filters')]")
	WebElement allProductsFilters;

	@FindBy(xpath = "//div[@class='cols']")
	WebElement allProductsOpenFilterOptions;

	@FindBy(xpath = "//a[contains(text(),'Clear All')]")
	WebElement allProductsClearAll;

	@FindBy(xpath = "//section[@class='products account-products']//div[@class='wrapper']")
	WebElement allProductsGrid;

	@FindBy(xpath = "//a[@class='more-content']")
	WebElement allProductsLoadMoreButton;

	public void verifyallProductLink() {

		try {
			CommonUtilities.expliciteWait(driver, allProductLink);
			CommonUtilities.highLightElement(driver, allProductLink);

			String ActualResult = allProductLink.getText();

			if (ActualResult.contains("All Products")) {
				System.out.println("All Product Link is displayed in the Header");
			}

		} catch (Exception e) {
			System.out.println("All Product Link is not displayed" + e.getMessage());
		}
		allProductLink.click();
	}

	public void verifyallProductHeader() {

		try {
			CommonUtilities.expliciteWait(driver, allProductHeader);
			CommonUtilities.highLightElement(driver, allProductHeader);

			String ActualResult = allProductHeader.getText();
			if (ActualResult.contains("All")) {
				System.out.println("All Product Header is displayed");
			}

		} catch (Exception e) {
			System.out.println("All Product Header is not present" + e.getMessage());

		}

	}

	public void verifyallProductsFilters() {

		try {
			CommonUtilities.expliciteWait(driver, allProductsFilters);
			CommonUtilities.highLightElement(driver, allProductsFilters);

			String Actual_Result = allProductsFilters.getText();
			if (Actual_Result.contains("Add filters")) {
				System.out.println("Add Filters is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Add Filters not found" + e.getMessage());
		}

	}

	public void verifyallProductsOpenFilterOptions() {

		try {
			allProductsFilters.click();
			CommonUtilities.expliciteWait(driver, allProductsOpenFilterOptions);
			CommonUtilities.highLightElement(driver, allProductsOpenFilterOptions);

			boolean ActualResult = allProductsOpenFilterOptions.isDisplayed();
			Assert.assertTrue(ActualResult);

		} catch (Exception e) {
			System.out.println("Filter Options not displayed" + e.getMessage());
		}

	}

	public void verifyallProductsClearAll() {

		try {
			CommonUtilities.expliciteWait(driver, allProductsClearAll);
			CommonUtilities.highLightElement(driver, allProductsClearAll);

			String Actual_Result = allProductsClearAll.getText();
			if (Actual_Result.contains("Clear All")) {
				System.out.println("Clear All is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Clear All not found" + e.getMessage());
		}
		allProductsClearAll.click();
	}

	public void verifyallProductsGrid() {

		try {
			CommonUtilities.expliciteWait(driver, allProductsGrid);
			CommonUtilities.scrollIntoView(driver, allProductsGrid);
			CommonUtilities.highLightElement(driver, allProductsGrid);

		} catch (Exception e) {
			System.out.println("Product Grid not found" + e.getMessage());
		}

	}

	public void clickonLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait_Clickable(driver, allProductsLoadMoreButton);
			allProductsLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
