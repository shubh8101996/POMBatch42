package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	WebDriver driver;
	
	
	@FindBy(id="modalusername")
	WebElement email;
	
	@FindBy(id="current-password")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	WebElement forgotPass;
	
	
	
	public LoginPageClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterCred() {
		
		email.sendKeys("shubhamshedge810@gmail.com");
		password.sendKeys("AdminShubham@123");
	}
	
	public void logClick() {
		
		loginBtn.click();
	}
	
	
	public void forgotPass() {
		
		forgotPass.click();
		
	}
	
	
	


}
