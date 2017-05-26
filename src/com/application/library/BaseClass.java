package com.application.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {

	public WebDriver driver;
	public ExcelLibrary lib;
	
	@BeforeClass
	public void launch(){
		
		lib = new ExcelLibrary();
		String browser = lib.getData("Config",1,0);
		String url = lib.getData("Config",1,1);
		
		if(browser.toLowerCase().equals("firefox")){
			System.setProperty("webdriver.gecko.driver","geckodriver");
			driver = new FirefoxDriver();
		}
		
		else if(browser.toLowerCase().equals("chrome")){
			System.setProperty("webdriver.chrome.driver","chromedriver");
			driver = new ChromeDriver();
		}
		else if(browser.toLowerCase().equals("ie")){
			System.setProperty("webdriver.ie.driver","IEDriverServer");
			driver = new InternetExplorerDriver();
		}
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(url);
		
	}
	
	@BeforeMethod
	public void login(){
		//code for login if required
	}
	
	@AfterMethod
	public void logout(){
		//code for logout
	}
	
	@AfterClass
	public void quit(){
		
		driver.quit();
	}
	
}
