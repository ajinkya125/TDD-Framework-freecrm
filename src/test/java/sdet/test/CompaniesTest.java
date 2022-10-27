package sdet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.CompaniesPage;
import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class CompaniesTest extends TestBase {
	
	CompaniesPage companies;
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		companies = new CompaniesPage();
		}
	
	@Test
	public void validatecompanypage() {
		companies.clickOnCompany();
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
