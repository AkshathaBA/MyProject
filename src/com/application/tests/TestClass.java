package com.application.tests;

import org.testng.annotations.Test;

import com.application.library.BaseClass;
import com.application.library.ExcelLibrary;
import com.application.library.ReadPropertyData;
import com.application.pages.HomePage;
import com.application.pages.LoginPage;
import com.application.pages.SofaPage;

public class TestClass extends BaseClass{
	
	ReadPropertyData rpd ;
	
	@Test(priority=0)
	public void invalidLogin() throws InterruptedException{
	
		rpd = new ReadPropertyData();
		String un = rpd.readValue("username");
		
		/*ExcelLibrary xlib = new ExcelLibrary();
		String username = xlib.getData("Login",1,0);*/
		
		LoginPage lp = new LoginPage(driver);
		lp.clickSignInButton();
		lp.clickLoginLink();
		lp.switchToLoginFrame();
		lp.enterUsername(un);
		lp.clickContinueButton();
		lp.verifyInvalidLoginErrorMessage();
		
	}
	
	@Test(priority=1)
	public void testHome() throws InterruptedException{
		
		rpd = new ReadPropertyData();
		String item = rpd.readValue("searchItem");
		
		HomePage hp = new HomePage(driver);
		hp.enterSearchItem(item);
		hp.clickSearchButton();
		hp.clickItem();
		
		SofaPage sp = new SofaPage(driver);
		sp.switchToSofaTab();
		sp.clickAddToCartBotton();
		sp.ClickCartIcon();
		sp.clickRemove();
		sp.clickBooks();
		sp.clickCompetitiveExamTab();
	}
		
}
