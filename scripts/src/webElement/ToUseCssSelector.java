package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		                                                                         // LinkText ( right click on Forgot your password)
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin"); // it is used when there is no id,name etc webElement(attribute)
		                                                                                        // are there in HTML Tree
                                                      // copy attribute value (Username) from HTML Tree and paste into attribute value
		                                             // and pass key value as (admin ) into sendsKeys
		                                             // we can verify whether the used selector is correct or not by the command (control+f) in HTML Tree
	                                                  // click on placeholder
	}

}
