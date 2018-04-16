package com.crm.qa.practice.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.practice.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;   //class variable
	public ExtentReports extent;
	public ExtentTest logger;
	
	
	//initialize all properties
	
	public TestBase(){
		
		try{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:/1SSM2/FreeCRMPractice/src/main/java/com/crm/qa/practice/config/config.properties");
			prop.load(ip);
					
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();		
		}		
		
	}
       public static void initialization(){
    	  String browserName=prop.getProperty("browser");
    	  if(browserName.equals("firefox")){
    		  System.setProperty("webdriver.gecko.driver","C:/Users/Padmini/Desktop/Selenium Required softwares/geckodriver.exe");
    		  driver=new FirefoxDriver();    		 
    	  }else if(browserName.equals("chrome")){
    		  System.setProperty("webdriver.chrome.driver","C:/Users/Padmini/Desktop/chromedriver.exe");
    		  driver=new ChromeDriver();  
    	  }
    	  
    	//  driver.manage().window().maximize();
    	// driver.manage().window().setSize(new Dimension(1920, 1080));
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
    	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
    	  driver.get(prop.getProperty("url"));
       }
 
      // public void getScreenShot(driver,String screenshotName){
    	   
     //  }
      
    	   
       
}
