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
		
		@FindBy(xpath="//img[@title='BLS Tulip Brown & Cream 3+1+1 Seater Sofa Set']")
		private WebElement firstSofa;
		
		public HomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
		public void enterSearchItem(String item){
			searchTextField.sendKeys(item);
			Reporter.log("Enters Search item", true);
		}
		
		public void clickSearchButton(){
			searchButton.click();
			Reporter.log("Clicks on search Button", true);
		}
		
		public void clickItem(){
			firstSofa.click();
			Reporter.log("Clicks on the item", true);
		}
		
		public void Action() throws InterruptedException{

			
			
		}
}