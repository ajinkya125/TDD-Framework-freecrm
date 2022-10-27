package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css=".btn.btn-small")
	WebElement loginbtn;
	
	@FindBy(css=".navbar-brand > .img-responsive")
	WebElement logoimg;
	
	
	
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();  //with the help of new keyword we return the object of homepage
	}
	
	public boolean logo() {
		return logoimg.isDisplayed();
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
