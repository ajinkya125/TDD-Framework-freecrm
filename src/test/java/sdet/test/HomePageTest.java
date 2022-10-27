package sdet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	
	@Test
	public void validateCrateNewContact() {
		homepage.createNewContact();
	}
	
	@Ignore
	@Test
	public void validatelogout() {
		homepage.logout();
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
