package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingEnterKey1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");                 //First inspect the tags in HTML Tree and find webElement
		
         driver.findElement(By.id("username")).sendKeys("Admin");         // sending keys in (text and password type) of input tags
        
          driver.findElement(By.name("pwd")).sendKeys("manager"); 
          driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
	  }

}
