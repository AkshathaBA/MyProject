package com.application.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SofaPage {

	WebDriver driver;
	
	@FindBy(id="add-cart-button-id")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='cartContainer col-xs-11 reset-padding']")
	private WebElement cart;
	
	@FindBy(xpath="//span[@class='remove-item-shortlist']")
	private WebElement remove;
	
	@FindBy(xpath="//a[@title='Books']")
	private WebElement books;
	
	@FindBy(xpath="//div[@data-alt='Competitive Exams']")
	private WebElement ceIcon;


	public SofaPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void switchToSofaTab() throws InterruptedException{
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> itr = wh.iterator();
		String home = itr.next();
		String sofa = itr.next();
		
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(sofa);
		
		//we can use array list also instead of set
				/*ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				tabs2.get(1);
				driver.switchTo().window(tabs2.get(1));*/
	}
	
	public void clickAddToCartBotton(){
		//wait.until(ExpectedConditions.visibilityOf(addToC//a[@title='Books']artButton));
		addToCartButton.click();
		Reporter.log("clicks on add to cart button", true);
	}
	
	public void ClickCartIcon() throws InterruptedException{
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartContainer col-xs-11 reset-padding']")));
		Thread.sleep(3000);
		cart.click();
		Reporter.log("Clicks on cart icon", true);
	}
	
	public void clickRemove() throws InterruptedException{
		//wait.until(ExpectedConditions.visibilityOf(remove));
		Thread.sleep(3000);
		remove.click();
		Reporter.log("Clicks on Remove", true);
	}
	
	public void clickBooks() throws InterruptedException{
		Thread.sleep(3000);
		books.click();
		Reporter.log("Clicks on Books", true);
	}
	
	
	public void clickCompetitiveExamTab() throws InterruptedException{
		Thread.sleep(3000);
		ceIcon.click();
		Reporter.log("Clicks on Competitive Exams", true);
		
	}
	
}
