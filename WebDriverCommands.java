package com.ssa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		//To initialize the browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		//Open the URL
		driver.get("http://www.seleniumhq.org");
		
		//get the title of the page
		String title = driver.getTitle();
		System.out.println("Title of the Page : " + title);
		int titlelength = driver.getTitle().length();
		System.out.println("Length of the Title : " + titlelength);

		if(title.equals("Selenium - Web Browser Automation123")){
			System.out.println("Title is Correct");
		}else{
			System.out.println("Title is Wrong");
		}
		
		//To get the Current url
		String URL = driver.getCurrentUrl();
		int URLlength = URL.length();
		System.out.println("URL : " + URL);
		System.out.println("URL Length : " + URLlength);
		
		//To get the Page Source
		String Pgsrc = driver.getPageSource();
		int pgsrclen =Pgsrc.length();
		System.out.println("PageSource : " + Pgsrc);
		System.out.println("PageSource Length : " + pgsrclen);
		
		//To CLose only one instance of the Browser
		driver.close();
		
		//To Close all instances of the browser
		driver.quit();
		
		
	}

}
