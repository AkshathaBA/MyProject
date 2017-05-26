package com.application.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewBookPage {

	WebDriver driver;

	public NewBookPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bookAction(){
		
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> itr = wh.iterator();
		String home= itr.next();
		String sofa = itr.next();
		String book = itr.next();
		
		driver.switchTo().window(book);
		String bookUrl = driver.getCurrentUrl();
		System.out.println(bookUrl);
		
		driver.findElement(By.id("pincode-check")).sendKeys("560010");
		
		driver.findElement(By.id("pincode-check-bttn")).click();

		
	}
	
	
	
}
