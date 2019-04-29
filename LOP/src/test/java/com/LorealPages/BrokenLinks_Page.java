package com.LorealPages;


import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BrokenLinks_Page {


	WebDriver driver;

	public BrokenLinks_Page(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(tagName = "a")
	List<WebElement> Linklist;

	@FindBy(tagName = "img")
	List<WebElement> Images;

	

	

	public void verifyBrokenLinkList() throws MalformedURLException, IOException {



			List<WebElement> links = Linklist;
			links.addAll(Images);
			
			System.out.println("size of full links and images is "+ links.size());
			
			List<WebElement> activelinks = new ArrayList<WebElement>();
			
			
			for(int i=0; i<links.size(); i++){
			if(links.get(i).getAttribute("href")!=null && (!links.get(i).getAttribute("href").contains("javascript"))){
		//			if(links.get(i).getAttribute("href")!=null){

					activelinks.add(links.get(i));
				}
				
			}
			System.out.println("Side of active links and images is"+ activelinks.size());
		
			try{
				for(int j=0; j<activelinks.size();j++){
					
					
					 	URL url = new URL(activelinks.get(j).getAttribute("href"));
			           
			           HttpURLConnection connection=(HttpURLConnection)url.openConnection();
										
				//	HttpURLConnection connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
										
					connection.setConnectTimeout(3000);
					connection.connect();
					
					String response = connection.getResponseMessage();
				
				//	connection.disconnect();
					
					System.out.println(activelinks.get(j).getAttribute("href")+" ****** " + response);
					
				}	
			}catch(Exception e){
				 System.out.println("Error " + e.getMessage());
			}
			
	
	}

	


}
