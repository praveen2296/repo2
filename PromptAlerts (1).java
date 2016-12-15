package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class PromptAlerts {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://expertittutorials.com/#/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[text()='Alerts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='alertSec']/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Purple");
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.findElement(By.xpath(".//*[@id='alertSec']/div/div[2]/button")).click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Violet");
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}