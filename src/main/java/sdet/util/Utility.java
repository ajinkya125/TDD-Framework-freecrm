package sdet.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testbase.TestBase;

public class Utility extends TestBase {
	
	public static void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
		
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
}
