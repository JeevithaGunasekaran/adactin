package org.com;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jeevi\\eclipse-workspace\\New\\AdactinHotel\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(username).perform();
		
		Robot a = new Robot();
		
		a.keyPress(KeyEvent.VK_SHIFT);
		a.keyPress(KeyEvent.VK_J);
		a.keyRelease(KeyEvent.VK_SHIFT);
		a.keyRelease(KeyEvent.VK_J);
		
		a.keyPress(KeyEvent.VK_E);
		a.keyRelease(KeyEvent.VK_E);
		
		a.keyPress(KeyEvent.VK_E);
		a.keyRelease(KeyEvent.VK_E);
		
		a.keyPress(KeyEvent.VK_V);
		a.keyRelease(KeyEvent.VK_V);
		
		a.keyPress(KeyEvent.VK_I);
		a.keyRelease(KeyEvent.VK_I);
		
		a.keyPress(KeyEvent.VK_SPACE);
		a.keyRelease(KeyEvent.VK_SPACE);
		
		a.keyPress(KeyEvent.VK_SHIFT);
		a.keyPress(KeyEvent.VK_A);
		a.keyRelease(KeyEvent.VK_SHIFT);
		a.keyRelease(KeyEvent.VK_A);
		
		a.keyPress(KeyEvent.VK_R);
		a.keyRelease(KeyEvent.VK_R);
		
		a.keyPress(KeyEvent.VK_U);
		a.keyRelease(KeyEvent.VK_U);
		
		a.keyPress(KeyEvent.VK_N);
		a.keyRelease(KeyEvent.VK_N);
		
		a.keyPress(KeyEvent.VK_E);
		a.keyRelease(KeyEvent.VK_E);
		
		a.keyPress(KeyEvent.VK_S);
		a.keyRelease(KeyEvent.VK_S);
		
		a.keyPress(KeyEvent.VK_H);
		a.keyRelease(KeyEvent.VK_H);
		
		Thread.sleep(2000);
		
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		
		
		a.keyPress(KeyEvent.VK_9);
		a.keyRelease(KeyEvent.VK_9);
		
		a.keyPress(KeyEvent.VK_0);
		a.keyRelease(KeyEvent.VK_0);
		
		a.keyPress(KeyEvent.VK_0);
		a.keyRelease(KeyEvent.VK_0);
		
		a.keyPress(KeyEvent.VK_3);
		a.keyRelease(KeyEvent.VK_3);
		
		a.keyPress(KeyEvent.VK_6);
		a.keyRelease(KeyEvent.VK_6);
		
		a.keyPress(KeyEvent.VK_2);
		a.keyRelease(KeyEvent.VK_2);
		
		a.keyPress(KeyEvent.VK_8);
		a.keyRelease(KeyEvent.VK_8);
		
		a.keyPress(KeyEvent.VK_9);
		a.keyRelease(KeyEvent.VK_9);
		
		a.keyPress(KeyEvent.VK_6);
		a.keyRelease(KeyEvent.VK_6);
		
		a.keyPress(KeyEvent.VK_5);
		a.keyRelease(KeyEvent.VK_5);
		
        //a.keyPress(KeyEvent.VK_ENTER);
        //a.keyRelease(KeyEvent.VK_ENTER);
       	
		
	}

}
