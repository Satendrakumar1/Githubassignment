package com.qait.assignment.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
   WebDriver driver;
   public LoginPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   @FindBy(xpath="//input[@id='login_field']")
   WebElement txt_username;
   
   @FindBy(xpath="//input[@id='password']")
   WebElement txt_password;
   
   @FindBy(xpath="//input[@class='btn btn-primary btn-block']")
   WebElement btn_signin;
   
   public void setusername(String username)
   {
	    txt_username.sendKeys(username);
   }
   public void  setpassword(String password)
   {
	   txt_password.sendKeys(password);
   }
   public void clickonsigin()
   {
	    btn_signin.click();
   }
}
