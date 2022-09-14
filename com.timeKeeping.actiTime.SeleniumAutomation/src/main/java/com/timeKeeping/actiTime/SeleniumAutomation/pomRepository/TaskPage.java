package com.timeKeeping.actiTime.SeleniumAutomation.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//Constructor which will load all the findBy during object creation
	WebDriver driver;
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	
	//We are identifying all the elements
	@FindBy(xpath= "//div[text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy (xpath ="//div[text()='+ New Customer']")
	private WebElement newCustomerButton;
	
	//Getters Methods
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getAddNewButton() {
		return addNewButton;
	}


	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}
	
	//Business Logic/Generic Method for TaskPage
	public void clickOnNewCustomerButton()
	{
		addNewButton.click();
		newCustomerButton.click();
		
	}
    //Creting one more generic method for verification of cutomer name
	public String verifyCustomerName(String customerName)
	{
		return driver.findElement(By.xpath("//div[@title='"+customerName+"']")).getText();
	}
}
