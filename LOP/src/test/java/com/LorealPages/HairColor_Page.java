package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.LorealPages_Utilities.CommonUtilities;

public class HairColor_Page {

	WebDriver driver;

	public HairColor_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//li[contains(text(),'Hair Colour')]")
	WebElement hairColorPath;

	// @FindBy(xpath="//strong[contains(text(),'Hair')]") WebElement
	// hairStyleHeader;
	@FindBy(xpath = "//h1[contains(text(),'colour')]")
	WebElement hairColorHeader;

	@FindBy(xpath = "//*[contains(text(),'Customize your look with')]")
	WebElement hairColorDescription;

	@FindBy(xpath = "//h3[contains(text(),'All products')]")
	WebElement hairColorAllProducts;

	@FindBy(xpath = "//strong[@class='panelName']")
	WebElement hairColorAToZ;

	@FindBy(xpath = "//div[@class='grid_0 panel current']//div[@class='wrapper']")
	WebElement hairColorProductGrid;

	// @FindBy(xpath="//a[@class='more-content']") WebElement
	// hairStyleLoadMoreButton;

	@FindBy(xpath = "//a[contains(text(),'Load More')]")
	WebElement hairColorLoadMoreButton;

	public void verifyhairColorPath() {

		try {
			CommonUtilities.expliciteWait(driver, hairColorPath);
			CommonUtilities.highLightElement(driver, hairColorPath);

			String Actual_Result = hairColorPath.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Hair Styling"));
			 */

			if (Actual_Result.contains("Hair Color")) {
				System.out.println("Hair Color Navigation Path is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyhairColorHeader() {

		try {
			CommonUtilities.expliciteWait(driver, hairColorHeader);
			CommonUtilities.highLightElement(driver, hairColorHeader);

			String Actual_Result = hairColorHeader.getText();

			/*
			 * System.out.println("Hair Style Header is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("STYLING"));
			 */

			if (Actual_Result.contains("COLOUR")) {
				System.out.println("HAIR COLOUR Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairColorDescription() {

		try {
			CommonUtilities.expliciteWait(driver, hairColorDescription);
			CommonUtilities.highLightElement(driver, hairColorDescription);

			String Actual_Result = hairColorDescription.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Become the Trend"));
			 */

			if (Actual_Result.contains("Customize your look with")) {
				System.out.println("Hair Colour Description is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairColorAllProducts() {

		try {
			CommonUtilities.expliciteWait(driver, hairColorAllProducts);
			CommonUtilities.scrollIntoView(driver, hairColorAllProducts);
			CommonUtilities.highLightElement(driver, hairColorAllProducts);

			String Actual_Result = hairColorAllProducts.getText();
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

	public void verifyhairColorProductGrid() {

		try {
			CommonUtilities.expliciteWait(driver, hairColorProductGrid);
			CommonUtilities.scrollIntoView(driver, hairColorAllProducts);
			CommonUtilities.highLightElement(driver, hairColorProductGrid);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyhairColorLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait(driver, hairColorLoadMoreButton);
			CommonUtilities.scrollIntoView(driver, hairColorLoadMoreButton);
			CommonUtilities.highLightElement(driver, hairColorLoadMoreButton);

			String Actual_Result = hairColorLoadMoreButton.getText();
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
			CommonUtilities.expliciteWait_Clickable(driver, hairColorLoadMoreButton);
			hairColorLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
