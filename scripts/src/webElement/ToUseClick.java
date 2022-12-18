package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");    // First inspect the tags in HTML Tree
		
		driver.findElement(By.linkText("About Selenium")).click();  // copy the attribute value from HTML Tree and paste into LinkText
		
		 
	}

}