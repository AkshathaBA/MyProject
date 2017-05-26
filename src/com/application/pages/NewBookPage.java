package com.application.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NewBookPage {

	WebDriver driver;

	public NewBookPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bookAction(){
		
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> itr = wh.iterator();
		itr.next();
		itr.next();
		String book = itr.next();
		
		driver.switchTo().window(book);
		
		driver.findElement(By.id("pincode-check")).sendKeys("560010");
		Reporter.log("Enters pin code", true);

		driver.findElement(By.id("pincode-check-bttn")).click();
		Reporter.log("Clicks on Check Button", true);

		
	}
	
	
	
}
