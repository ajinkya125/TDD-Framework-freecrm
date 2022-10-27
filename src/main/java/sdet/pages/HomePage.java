package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(css=".fa.fa-sign-out.icon-2x")
	WebElement logoutLink;
	
	@FindBy(xpath = "//a[@title='Contacts']")	//mouse over
	WebElement Contacts;
	@FindBy(linkText = "New Contact")
	WebElement newContact;
	@FindBy(name = "mainpanel")	//frame
	WebElement frame;
	
	public NewContactPage createNewContact() {
		Utility.switchToFrame(frame);

		Utility.mouseOverAction(Contacts);
	
		newContact.click();
		return new NewContactPage();
	}
	
	
	public void logout() {
		driver.switchTo().frame("mainpanel");
		logoutLink.click();
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
