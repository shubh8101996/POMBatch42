package com.test.cases;

import org.testng.annotations.Test;

import com.base.classes.BaseClass;
import com.page.classes.HomePageClass;
import com.page.classes.LoginPageClass;

public class TestCase_LoginFunction extends BaseClass {
	
	
	
	@Test
	public void LogIn() {
		
		HomePageClass h=new HomePageClass(driver);
		h.HomeLoginBtnClick();
	
		LoginPageClass l=new LoginPageClass(driver);
		
		l.enterCred();
		
		l.logClick();
		
	}
	
	
	
			
	

}
