package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingEnterKey {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");                 //First inspect the tags in HTML Tree
		
         driver.findElement(By.id("username")).sendKeys("Admin");         // sending keys in (text and password type) of input tags
        
         WebElement passwordTextField = driver.findElement(By.name("pwd")); // It could also have done in the same  way as above line 
         passwordTextField.sendKeys("manager");                               // but we want Enter from PasswordTextField at same time
         passwordTextField.sendKeys(Keys.ENTER);                              // so creating reference variable and its return type
	}
}