package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingId {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	     WebElement usernameTextField = driver.findElement(By.id("username"));  // First inspect the tags (input tags n all ) in HTML Tree nd then copy paste its attribute value
	     WebElement passwordTextField= driver.findElement(By.name("pwd"));       // Same as above
	     
	     usernameTextField.sendKeys("admin");                          // passing the key in input tags
	     Thread.sleep(2000);                                                // it is done to slow down the process by 2 seconds because everything is happening very fast
	     passwordTextField.sendKeys("manager");                        // passing the key in input tags
	     Thread.sleep(2000);
	     driver.findElement(By.id("keepLoggedInCheckBox")).click();    // It will click on keepLoggedInCheckBox
	        // or
	    // WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	    // checkBox.click();
	     
	}
}
