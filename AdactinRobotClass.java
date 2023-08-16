package org.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactinRobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdeiver.chrome.driver","C:\\Users\\jeevi\\eclipse-workspace\\New\\AdactinHotel\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		Actions act = new Actions(driver);
		act.doubleClick(username).build().perform();
		
		Robot b = new Robot();
		
		b.keyPress(KeyEvent.VK_J);
		b.keyRelease(KeyEvent.VK_J);
		
		b.keyPress(KeyEvent.VK_E);
		b.keyRelease(KeyEvent.VK_E);
		
		b.keyPress(KeyEvent.VK_E);
		b.keyRelease(KeyEvent.VK_E);
		
		b.keyPress(KeyEvent.VK_V);
		b.keyRelease(KeyEvent.VK_V);

		b.keyPress(KeyEvent.VK_I);
		b.keyRelease(KeyEvent.VK_I);
		
		b.keyPress(KeyEvent.VK_G);
		b.keyRelease(KeyEvent.VK_G);
		
		b.keyPress(KeyEvent.VK_U);
		b.keyRelease(KeyEvent.VK_U);
		
		b.keyPress(KeyEvent.VK_N);
		b.keyRelease(KeyEvent.VK_N);
	
		b.keyPress(KeyEvent.VK_A);
		b.keyRelease(KeyEvent.VK_A);
		
		b.keyPress(KeyEvent.VK_TAB);
		b.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		b.keyPress(KeyEvent.VK_J);
		b.keyRelease(KeyEvent.VK_J);
		
		b.keyPress(KeyEvent.VK_E);
		b.keyRelease(KeyEvent.VK_E);
		
		b.keyPress(KeyEvent.VK_E);
		b.keyRelease(KeyEvent.VK_E);

		b.keyPress(KeyEvent.VK_V);
		b.keyRelease(KeyEvent.VK_V);
		
		b.keyPress(KeyEvent.VK_I);
		b.keyRelease(KeyEvent.VK_I);
		
		b.keyPress(KeyEvent.VK_SHIFT);
		b.keyPress(KeyEvent.VK_2);
		b.keyRelease(KeyEvent.VK_SHIFT);
		b.keyRelease(KeyEvent.VK_2);
		
		b.keyPress(KeyEvent.VK_1);
		b.keyRelease(KeyEvent.VK_1);

		b.keyPress(KeyEvent.VK_2);
		b.keyRelease(KeyEvent.VK_2);
		
		b.keyPress(KeyEvent.VK_3);
		b.keyRelease(KeyEvent.VK_3);
		
		Thread.sleep(2000);
		
		b.keyPress(KeyEvent.VK_TAB);
		b.keyRelease(KeyEvent.VK_TAB);
		

		b.keyPress(KeyEvent.VK_TAB);
		b.keyRelease(KeyEvent.VK_TAB);
		
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement locate = driver.findElement(By.id("location"));
        Select s=new Select(locate);	
        s.selectByValue(Melbourne);
        
		


		
		
		
		
		
	}

}
