package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.LorealPages_Utilities.CommonUtilities;

public class MakeUp_Page {

	WebDriver driver;

	public MakeUp_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//li[contains(text(),'Makeup')]")
	WebElement makeUpPath;

	// @FindBy(xpath="//strong[contains(text(),'Hair')]") WebElement
	// hairStyleHeader;

	@FindBy(xpath = "//strong[contains(text(),'Makeup')]")
	WebElement makeUpHeader;

	@FindBy(xpath = "//*[contains(text(),'Paris offers a complete range')]")
	WebElement makeUpDescription;

	@FindBy(xpath = "//h3[contains(text(),'All products')]")
	WebElement makeUpAllProducts;

	/*
	 * @FindBy(xpath = "//strong[@class='panelName']") WebElement hairStyleAToZ;
	 */

	@FindBy(xpath = "//div[@class='grid_0 panel current']//div[@class='wrapper']")
	WebElement makeUpProductGrid;

	@FindBy(xpath = "//a[contains(text(),'Load More')]")
	WebElement makeUpLoadMoreButton;

	public void verifymakeUpPath() {

		try {
			CommonUtilities.expliciteWait(driver, makeUpPath);
			CommonUtilities.highLightElement(driver, makeUpPath);

			String Actual_Result = makeUpPath.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Hair Styling"));
			 */

			if (Actual_Result.contains("Makeup")) {
				System.out.println("Makeup Navigation Path is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifymakeUpHeader() {

		try {
			CommonUtilities.expliciteWait(driver, makeUpHeader);
			CommonUtilities.highLightElement(driver, makeUpHeader);

			String Actual_Result = makeUpHeader.getText();
			/*
			 * System.out.println("Hair Style Header is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("STYLING"));
			 */

			if (Actual_Result.contains("MAKEUP")) {
				System.out.println("MAKEUP Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifymakeUpDescription() {

		try {
			CommonUtilities.expliciteWait(driver, makeUpDescription);
			CommonUtilities.highLightElement(driver, makeUpDescription);

			String Actual_Result = makeUpDescription.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Become the Trend"));
			 */

			if (Actual_Result.contains("Paris offers a complete range")) {
				System.out.println("HAIR STYLING Description is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifymakeUpAllProducts() {

		try {
			CommonUtilities.expliciteWait(driver, makeUpAllProducts);
			CommonUtilities.scrollIntoView(driver, makeUpAllProducts);
			CommonUtilities.highLightElement(driver, makeUpAllProducts);

			String Actual_Result = makeUpAllProducts.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("All products"));
			 */

			if (Actual_Result.contains("All products")) {
				System.out.println("MakeUp - All products banner is displayed");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifymakeUpProductGrid() {

		try {
			CommonUtilities.expliciteWait(driver, makeUpProductGrid);
			CommonUtilities.scrollIntoView(driver, makeUpProductGrid);
			CommonUtilities.highLightElement(driver, makeUpProductGrid);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifymakeUpLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait(driver, makeUpLoadMoreButton);
			CommonUtilities.scrollIntoView(driver, makeUpLoadMoreButton);
			CommonUtilities.highLightElement(driver, makeUpLoadMoreButton);

			String Actual_Result = makeUpLoadMoreButton.getText();
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
			CommonUtilities.expliciteWait_Clickable(driver, makeUpLoadMoreButton);
			makeUpLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
