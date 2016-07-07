package com.qait.assignment.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	@FindBy(css="a[class='btn btn-sm btn-primary']")
	WebElement btn_newrepository;
	
	@FindBy(xpath="//input[@id='repository_name']")
	WebElement txt_repositoryname;
	
	@FindBy(xpath="//button[@class='btn btn-primary first-in-line']")
	WebElement btn_createrepo;
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickonnewrepository()
	{
		btn_newrepository.click();
	}
	public void enterrepositoryname(String name)
	{
		txt_repositoryname.sendKeys(name);
	}
	public void createrepository()
	{
		btn_createrepo.click();
	}

}
