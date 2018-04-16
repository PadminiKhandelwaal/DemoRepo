package com.crm.qa.practice.util;

import com.crm.qa.practice.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=40;
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}

}


