package com.timeKeeping.actiTime.SeleniumAutomation.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Constructor which will load all the findBy during object creation
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
    //We are identifying all the elements
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;

	//Getters Methods
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	//Business Logic/Generic Method for Login
    public void loginAction(String username,String password) 
    {
    	usernameTextField.sendKeys(username);
    	passwordTextField.sendKeys(password);
    	loginButton.click();	
    }

}
