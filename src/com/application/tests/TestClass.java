package com.application.tests;

import org.testng.annotations.Test;

import com.application.library.BaseClass;
import com.application.pages.HomePage;
import com.application.pages.NewBookPage;
import com.application.pages.SofaPage;

public class TestClass extends BaseClass{
	
	@Test
	public void testHome() throws InterruptedException{
		
		HomePage hp = new HomePage(driver);
		hp.Action();
		
		SofaPage sp = new SofaPage(driver);
		sp.sofaAction();
		
		NewBookPage nbp = new NewBookPage(driver);
		nbp.bookAction();
		
	}

}
