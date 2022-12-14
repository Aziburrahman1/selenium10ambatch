package com.timeKeeping.actiTime.SeleniumAutomation.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	//Constructor which will load all the findBy during object creation
	WebDriver driver;
	public CreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//We are identifying all the elements
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTextField;
	
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropDown;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	
	
	//Getters Methods
	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}


	public WebDriver getDriver() {
		return driver;
	}
	

	public WebElement getEnterCustomerNameTextField() {
		return enterCustomerNameTextField;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomerDropDown() {
		return selectCustomerDropDown;
	}
	
	
	//Business Logic/Generic Method for CreateNewCustomerPage
	public void createCustomerAction(String customerName, String description)
	{
		enterCustomerNameTextField.sendKeys(customerName);
		enterCustomerDescription.sendKeys(description);
		selectCustomerDropDown.click();
		
		Actions action = new Actions(driver);
		action.moveByOffset(170, 500).click().perform();
		createCustomerButton.click();	
	}
	
}
