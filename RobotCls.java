package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotCls {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		String HomeURL = "http://test.webdav.org/auth-basic/";
		
		driver.get(HomeURL);
		
		String UID = "user2";
		StringSelection userID = new StringSelection(UID);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(userID, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		String PWD = "user2";
		StringSelection passWrd = new StringSelection(PWD);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(passWrd, null);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.close();
	}
}