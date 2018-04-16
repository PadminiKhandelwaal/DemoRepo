package com.crm.qa.practice.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.practice.base.TestBase;
import com.crm.qa.practice.pages.HomePage;
import com.crm.qa.practice.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage  homePage;
	
	public LoginPageTest(){
		super(); //if u dont use ull get null pointer exception coz we must initialize before using
	}
	
	@BeforeMethod
	public void setup(){
		TestBase.initialization();
		loginPage=new LoginPage();			
	}
	
	@Test(priority=3) 
	public void loginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle(); // insert assertion
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
		System.out.println(title);
		
		
	} 
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag=loginPage.validateCRMImage();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=1)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		
	}	
	
   @AfterMethod
   public void tearDown(){
	   driver.quit();
   }
}
