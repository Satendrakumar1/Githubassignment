package com.qait.assignment.tests;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.assignment.pageobjects.DashboardPage;
import com.qait.assignment.pageobjects.HomePage;
import com.qait.assignment.pageobjects.LoginPage;
import com.qait.assignment.pageobjects.RepositoryPage;
import com.qait.assignment.terminal.ExecuteCommand;
import com.qait.assignment.terminal.Shellscript;



public class GitHub_Test_1 {
	WebDriver driver;
	HomePage homepage;
	LoginPage login;
	DashboardPage dashboard;
	RepositoryPage repository;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "U://chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://github.com/");
	}
	@Test(priority=0)
	public void Test_LoginToApplication()
	{
		homepage=new HomePage(driver);
		homepage.clickonsigin();
		login=new LoginPage(driver);
		login.setusername("hellosunny.07jan@gmail.com");
		login.setpassword("sunny9560");
		login.clickonsigin();	
		
	}
	@Test(priority=1)
	public void Test_CreateRepository()
	{
		dashboard=new DashboardPage(driver);
		dashboard.clickonnewrepository();
		dashboard.enterrepositoryname("Tatoc1");
		dashboard.createrepository();
	}
	@Test(dependsOnMethods={"Test_CreateRepository"})
	public void shellCommands() throws IOException, InterruptedException
	{
		Shellscript script=new Shellscript(this.driver);
		script.createShellFile();
		script.execute();
		
	}
	
	@Test(dependsOnMethods={"shellCommands"})
	public void executeCommands()
	{
		ExecuteCommand exec=new ExecuteCommand();
		exec.execute();
		System.out.println("done");
	}

}
