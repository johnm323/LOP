package com.LorealPages_TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BK_LinksVersion2 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links is "+ totalLinks.size());
		
		
		for(int i=0; i<totalLinks.size();i++){
		//	String hrefvalue = totalLinks.get(i).getAttribute("href");
			WebElement element = totalLinks.get(i);
			String url = element.getAttribute("href");
			
			URL links = new URL(url);
			
			HttpURLConnection httpconnect = (HttpURLConnection)links.openConnection();
		Thread.sleep(3000);
		
		httpconnect.connect();
		
		int responseCode = httpconnect.getResponseCode();
			
		if(responseCode>=400){
			System.out.println(url + " Links are Broken " + responseCode);
		}
		else {
			System.out.println(url + " Links are valid "+ responseCode);
		}
			
		}
		
		
		
	}

}
