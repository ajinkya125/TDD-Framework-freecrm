package sdet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import sdet.pages.LoginPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	
	@Test(priority=0)
	public void validateLogo() {
		boolean value = loginpage.logo();
		Assert.assertEquals(value, true);
		
	}
	
	
	@Test(priority=1)
	public void validateLogin() {
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "CRMPRO");
	}
	
	@AfterMethod
	public void closeresources() {
		driver.close();
	}

}
