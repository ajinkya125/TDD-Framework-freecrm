package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.TestBase;

public class NewContactPage extends TestBase {
	
	@FindBy(id = "first_name")
	WebElement firstname;
	
	@FindBy(id = "surname")
	WebElement lastname;
	
	@FindBy(xpath = "(//input[@value='Save'])[1]")
	WebElement savebtn;
	
	
	@FindBy(name = "mainpanel")		//frame
	WebElement frame;
	
	
	
	public void newcontact(String fn, String ln) {
	//	Utility.switchToFrame(frame);
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		savebtn.click();
		}
	
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}

}

	