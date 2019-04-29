package com.LorealPages_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver launchApplication(WebDriver driver, String BrowserName, String AppURL) {

		if (BrowserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (BrowserName.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "./Drivers/chromedriver.exe");
			driver = new FirefoxDriver();
		}

		else if (BrowserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver", "./Drivers/IE.exe");
			driver = new InternetExplorerDriver();

		} else {

			System.out.println("We do not support this driver");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AppURL);

		return driver;

	}

	public static WebDriver closeBrowser(WebDriver driver) {

		driver.quit();
		return driver;

	}

}
