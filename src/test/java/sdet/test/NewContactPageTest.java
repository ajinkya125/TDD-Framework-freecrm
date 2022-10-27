package sdet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewContactPage;
import testbase.TestBase;

public class NewContactPageTest extends TestBase {
	
		LoginPage loginpage;
		HomePage homepage;
		NewContactPage newcontactpage;

		@BeforeMethod
		public void setup() {
			initialization();
			loginpage = new LoginPage();
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			newcontactpage = homepage.createNewContact();
		}
		
		@Test
		public void validateNewContactPage() {
			newcontactpage.newcontact("ajinkya", "aji");
		}
		
		@AfterMethod
		public void closeResources() {
			driver.close();
		}
}
