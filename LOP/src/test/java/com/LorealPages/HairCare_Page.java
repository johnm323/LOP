package com.LorealPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.LorealPages_Utilities.CommonUtilities;

public class HairCare_Page {

	WebDriver driver;

	public HairCare_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//li[contains(text(),'Hair Care')]")
	WebElement hairCarePath;

	// @FindBy(xpath="//strong[contains(text(),'Hair')]") WebElement
	// hairStyleHeader;
	@FindBy(xpath = "//strong[contains(text(),'Hair')]")
	WebElement hairCareHeader;

	@FindBy(xpath = "//*[contains(text(),'Expert care for every haircare need')]")
	WebElement hairCareDescription;

	@FindBy(xpath = "//h3[contains(text(),'All products')]")
	WebElement hairCareAllProducts;

	@FindBy(xpath = "//strong[@class='panelName']")
	WebElement hairCareAToZ;

	@FindBy(xpath = "//div[@class='grids slider sliderGrid sliderGridHome']//div[@class='sliderContent']//div[@class='wrapper']")
	WebElement hairCareProductGrid;

	// @FindBy(xpath="//a[@class='more-content']") WebElement
	// hairStyleLoadMoreButton;

	@FindBy(xpath = "//a[contains(text(),'Load More')]")
	WebElement hairCareLoadMoreButton;

	public void verifyhairCarePath() {

		try {
			CommonUtilities.expliciteWait(driver, hairCarePath);
			CommonUtilities.highLightElement(driver, hairCarePath);

			String Actual_Result = hairCarePath.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Hair Styling"));
			 */

			if (Actual_Result.contains("Hair Care")) {
				System.out.println("Hair Care Navigation Path is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyhairCareHeader() {

		try {
			CommonUtilities.expliciteWait(driver, hairCareHeader);
			CommonUtilities.highLightElement(driver, hairCareHeader);

			String Actual_Result = hairCareHeader.getText();

			/*
			 * System.out.println("Hair Style Header is " + Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("STYLING"));
			 */

			if (Actual_Result.contains("CARE")) {
				System.out.println("HAIR CARE Header is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairCareDescription() {

		try {
			CommonUtilities.expliciteWait(driver, hairCareDescription);
			CommonUtilities.highLightElement(driver, hairCareDescription);

			String Actual_Result = hairCareDescription.getText();
			/*
			 * System.out.println(Actual_Result);
			 * Assert.assertTrue(Actual_Result.contains("Become the Trend"));
			 */

			if (Actual_Result.contains("Expert care for every haircare")) {
				System.out.println("Hair Care Description is displayed successfully");
			}
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());
		}

	}

	public void verifyhairCareAllProducts() {

		try {
			CommonUtilities.expliciteWait(driver, hairCareAllProducts);
			CommonUtilities.scrollIntoView(driver, hairCareAllProducts);
			CommonUtilities.highLightElement(driver, hairCareAllProducts);

			String Actual_Result = hairCareAllProducts.getText();
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

	public void verifyhairCareProductGrid() {

		try {
			CommonUtilities.expliciteWait(driver, hairCareProductGrid);
			CommonUtilities.scrollIntoView(driver, hairCareAllProducts);
			CommonUtilities.highLightElement(driver, hairCareProductGrid);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}

	}

	public void verifyhairCareLoadMoreButton() {

		try {
			CommonUtilities.expliciteWait(driver, hairCareLoadMoreButton);
			CommonUtilities.scrollIntoView(driver, hairCareLoadMoreButton);
			CommonUtilities.highLightElement(driver, hairCareLoadMoreButton);

			String Actual_Result = hairCareLoadMoreButton.getText();
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
			CommonUtilities.expliciteWait_Clickable(driver, hairCareLoadMoreButton);
			hairCareLoadMoreButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found" + e.getMessage());

		}
	}

}
