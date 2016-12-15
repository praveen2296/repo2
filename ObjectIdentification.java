package com.ssa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectIdentification {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.typing.com/student/login");
		
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("qa.architect");
		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("qaarchitect");
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//*[@id='login-form']/p[2]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Teacher Login")).click();
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("Student")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".left-links>a")).click();
		Thread.sleep(3000);

		WebElement parentElement = driver.findElement(By.className("app-content"));
		WebElement childElement = parentElement.findElement(By.xpath(".//*[text()='Typing Lessons »']"));
		childElement.click();

		driver.close();

	}

}