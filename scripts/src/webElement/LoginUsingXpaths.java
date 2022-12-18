package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingXpaths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");  //because of <td> Xpath Attribute
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager"); //because of <td> Xpath Attribute
		driver.findElement(By.xpath("//div[text()='Login ']")).click();                     // Xpath by text()
				

	}

}
