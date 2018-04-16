package com.crm.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.practice.base.TestBase;

public class LoginPage extends TestBase
{
	
	//declaration /Object repositories
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	private WebElement crmLogo;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement SignUpBtn;
	
	//initialization
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pw){
		Username.sendKeys(un);
		Password.sendKeys(pw);
		LoginBtn.click();
		return new HomePage();
		
	}
	
	

}
