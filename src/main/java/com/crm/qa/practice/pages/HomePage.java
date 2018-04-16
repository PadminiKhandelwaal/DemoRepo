package com.crm.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.practice.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: Padmini12 K')]")
	//@FindBy(xpath="//a[contains(text(),'New Help Center')]")
	private WebElement userNamelabel;
	//@FindBy(xpath="//td[@class='headertext']/..//td[@align='left']")
	
	
	//@FindBy (xpath="//td[contains(text(),'&nbsp;&nbsp;User: Padmini12 K')]")
	//private WebElement userNameLabel;
	
	//@FindBy (xpath="//a[contains(text(),'Calendar')]")
	//private WebElement calendarLink;
	
	//@FindBy (xpath="//td[contains(text(),'User: Padmini12 K')]")
	//private WebElement companiesLink;
	
	@FindBy(xpath="//a[contains(.,'Contacts')]")
	private WebElement contactsLink;
	
	//@FindBy (xpath="//a[contains(.,'Deals')]")
	//private WebElement dealsLink;
	
	//@FindBy(xpath="//a[contains(.,'Tasks')]")
	//private WebElement tasksLink;
	
	//initialization
	
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	public String HomePageTitle(){
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	/*
	public void clickOnDealsLink(){
		dealsLink.click();
	}
	
	public void clickonTasksLink(){
		tasksLink.click();
	}
	
	public void clickonCalendarLink(){
		calendarLink.click();
	}*/
	
	public boolean verifyCorrectUserName(){
		return userNamelabel.isDisplayed();
		
	}
	
		/*public boolean verifyCorrectUserName() {
			if (userNameLabel == null)
			{
				System.out.println("user name label is null");
			}		
		return userNameLabel.isDisplayed();
		*/
		
	}
	
		
	
	

