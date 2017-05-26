package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  {

		WebDriver driver;
		
		@FindBy(id="inputValEnter")
		private WebElement searchTextField;
		
		@FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']")
		private WebElement searchButton;
		
		@FindBy(xpath="//p[@title='Bharat Lifestyle Tulip Fabric 3 Seater Sofa']")
		private WebElement firstSofa;
		
		public HomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void Action() throws InterruptedException{

			searchTextField.sendKeys("sofa");
			searchButton.click();
			firstSofa.click();

			Thread.sleep(3000);
			
			

		}
	
	
}