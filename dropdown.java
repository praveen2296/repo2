package com.selenium.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://adam.goucher.ca/parkcalc/index.php");
		
		Select sel = new Select(driver.findElement(By.id("Lot")));
		
		//Print all the values in the drop down
		List <WebElement> lis = sel.getOptions();
		int size = lis.size();
		System.out.println("Size : " + size);
		
		for(int i=0;i<size;i++){
			System.out.println(lis.get(i).getText());
		}
		
		//select By Index
		sel.selectByIndex(1);
		Thread.sleep(3000);
		
		//select By Value
		sel.selectByValue("LTS");
		Thread.sleep(3000);
		
		//select By VisibleText
		sel.selectByVisibleText("Valet Parking");
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
