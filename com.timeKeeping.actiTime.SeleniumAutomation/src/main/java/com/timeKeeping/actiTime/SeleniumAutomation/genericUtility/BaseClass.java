package com.timeKeeping.actiTime.SeleniumAutomation.genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.timeKeeping.actiTime.SeleniumAutomation.pomRepository.HomePage;
import com.timeKeeping.actiTime.SeleniumAutomation.pomRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public JavaUtility jUtils = new JavaUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("=====DataBase Connectivity Extablished=======");
	}
	
	@BeforeClass
	public void bcConfig() throws IOException
	{
		String url = jUtils.fetchDataFromPropertyFile("url");
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url); 
		System.out.println("=====The Browser Has been Launched============");
		System.out.println("=====Navigated to the URL======");
	}
	@BeforeMethod
	public void bmConfig() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		String username = jUtils.fetchDataFromPropertyFile("username");
		String password = jUtils.fetchDataFromPropertyFile("password");
		login.loginAction(username, password);
		System.out.println("=====Logged in to the Application============");
	
	}
	
	@AfterMethod
	public void amConfig()
	{
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("=====Log out from the Application============");
	}
	
	@AfterClass
	public void acConfig()
	{
		driver.quit();
		System.out.println("=====The Browser is closed============");
	}
	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("=====The Database has been closed============");
	}
		
}
