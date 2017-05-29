package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePage  {

		WebDriver driver;
		
		@FindBy(id="inputValEnter")
		private WebElement searchTextField;
		
		@FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']")
		private WebElement searchButton;
		
		@FindBy(xpath="//p[@title='BLS Tulip Brown & Cream 3+1+1 Seater Sofa Set']")
		private WebElement firstSofa;
		
		public HomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void Action() throws InterruptedException{

			searchTextField.sendKeys("sofa");
			Reporter.log("Enters Search item", true);
			
			searchButton.click();
			Reporter.log("Clicks on search Button", true);

			firstSofa.click();
			Reporter.log("Clicks on the item", true);


			Thread.sleep(5000);
			
			

		}
	
	
}