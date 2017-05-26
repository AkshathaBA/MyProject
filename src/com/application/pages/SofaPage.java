package com.application.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="//div[@class='sorting-sec animBounce']")
	private WebElement sortByDropdown;
	
	@FindBy(xpath="//ul[@class='sort-value']/li[5]")
	private WebElement freshArrivalDropdown;
	
	public SofaPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sofaAction() throws InterruptedException{
		
		
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> itr = wh.iterator();
		String home= itr.next();
		String sofa = itr.next();
		driver.switchTo().window(sofa);
		
		//we can use array list also instead of set
		/*ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		tabs2.get(1);
		driver.switchTo().window(tabs2.get(1));*/
		
		//wait.until(ExpectedConditions.visibilityOf(addToC//a[@title='Books']artButton));
		addToCartButton.click();
		
	    //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartContainer col-xs-11 reset-padding']")));
		Thread.sleep(3000);
		cart.click();

		//wait.until(ExpectedConditions.visibilityOf(remove));
		Thread.sleep(3000);
		remove.click();

		Thread.sleep(3000);
		books.click();
		
		Thread.sleep(3000);
		ceIcon.click();
		
		Thread.sleep(3000);
		sortByDropdown.click();
		
		Thread.sleep(3000);
		freshArrivalDropdown.click();
		
		driver.findElement(By.id("660569015061")).click();
		Thread.sleep(3000);
		
	}
	
}
