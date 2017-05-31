package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']")
	private WebElement signIN;

	@FindBy(xpath="//a[@href='https://www.snapdeal.com/login']")
	private WebElement loginLink;
	
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(id="checkUser")
	private WebElement continueButton;
	
	@FindBy(id="loginIframe")
	private WebElement loginFrame;
	
	@FindBy(id="userName-error")
	private WebElement usernameError;
	
	@FindBy(id="close-pop")
	private WebElement close;
	  
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignInButton(){
		signIN.click();
		Reporter.log("Clicks on signIn", true);
	}
	
	
	public void clickLoginLink(){
		if(loginLink.isDisplayed()){
			Reporter.log("loginLink is enabled", true);
			loginLink.click();
			Reporter.log("Clicks on login", true);
		}else{
			Reporter.log("loginLink is not enabled", true);
		}
	}
	
	
	public void switchToLoginFrame(){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginIframe")));
		driver.switchTo().frame(loginFrame);
		Reporter.log("Switched to Frame",true);
	}
	
	
	public void enterUsername(String name){
		if(username.isEnabled()){
			username.sendKeys("aaaaaa");
			Reporter.log(" Enters username", true);
		}else{
			Reporter.log("username is not enabled", true);
		}
	}
	
	
	public void clickContinueButton(){
		continueButton.click();
		Reporter.log("Clicks on Continue Button", true);
	}
	
	
	public void verifyInvalidLoginErrorMessage(){
		String expectedError = "Please enter a valid mobile number or email";
		String actualError = usernameError.getText();
		if(actualError.equals(expectedError)){
			Reporter.log("Login Failed...", true);
			close.click();
			driver.switchTo().defaultContent();
		}
	}
	
	
}
