package com.crm.qa.practice.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.practice.base.TestBase;
import com.crm.qa.practice.pages.ContactsPage;
import com.crm.qa.practice.pages.HomePage;
import com.crm.qa.practice.pages.LoginPage;
import com.crm.qa.practice.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage  homePage;
	TestUtil  testUtil;
	ContactsPage contactsPage;
	

	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		TestBase.initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		contactsPage=new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
	
	/*@Test (priority=1)
	public void validateHomePageTitleTest(){
		String homePageTitle=homePage.HomePageTitle();
	Assert.assertEquals(homePageTitle,"CRMPRO","Home page title not matched");	
		
	}*/
	
	@Test (priority=2)
	public void verifyUserNameTest(){
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
		//homePage.clickonCalendarLink();
	}
	
	/*@Test (priority=3)
    public void verifyContactsLinkTest(){
		testUtil.switchToFrame();
		contactsPage=homePage.clickOnContactsLink();
		
	}*/	
	
	 @AfterMethod
	   public void tearDown(){
		  // driver.quit();
	   }

}