package com.selenium.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	 public static void main(String[] args) throws IOException {
         
		 
         WebDriver driver = new FirefoxDriver();
        
         driver.manage().window().maximize();
        
         driver.get("http://www.centurylinkindia.com");
        
         File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screenshot, new File("D:\\demo.jpeg"));
        
         driver.close();
         driver.quit();
        
}

}