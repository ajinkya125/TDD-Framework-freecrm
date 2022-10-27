package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.TestBase;

public class CompaniesPage extends TestBase {
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[3]/a")
//	@FindBy(linkText = "Companies")
	WebElement companies;
	
	@FindBy(xpath = "//a[@title='New Company']")
	WebElement newCompany;
	
	@FindBy(id = "company_name")
	WebElement companyName;
	
	@FindBy(name = "mainpanel")
	WebElement frame;
	
	
	
	public void clickOnCompany() {
		Utility.switchToFrame(frame);
		Utility.mouseOverAction(companies);
		
		newCompany.click();
		
		companyName.sendKeys("aju");
	}
	
	public CompaniesPage() {
		PageFactory.initElements(driver, this);
	}
	

}
