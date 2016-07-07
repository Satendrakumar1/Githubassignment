package com.qait.assignment.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    WebDriver driver;
	
	@FindBy(xpath="//a[text()='Sign in']")
	 WebElement btn_signin;
	
    @FindBy(xpath="//a[text()='Sign up']")
    WebElement btn_signup;
    
    
    public HomePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
   public void clickonsigin()
   {
	   btn_signin.click();
   }
   
   public void clickonsignup()
   {
	    btn_signup.click();
   }
   
    
    
}
