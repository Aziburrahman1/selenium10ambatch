package com.timeKeeping.actiTime.SeleniumAutomation.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Constructor which will load all the findBy during object creation
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//We are identifying all the elements
	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutLink;
	
	//Getters Methods
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTaskButton() {
		return taskButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	//Business Logic/Generic Method for HomePage
	public void clickOnTaskButton()
	{
		taskButton.click();
	}
	public void logoutAction()
	{
		logoutLink.click();
	}

}
