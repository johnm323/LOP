package com.LorealPages_Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {

	public static String captureScreenshot(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir") + "./Screenshots/LOP_" + currentDateTime() + ".png";

		System.out.println("Screenshot Captured Successfully");

		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {

			System.out.println("Unable to capture screenshot" + e.getMessage());
		}
		return screenshotPath;
	}

	public static String currentDateTime() {

		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");

		Date currentdate = new Date();
		return customformat.format(currentdate);

	}

	public static void expliciteWait(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void expliciteWait_Clickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	}

	public static void unhighlightLast(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute='0px'", element);
	}

}
