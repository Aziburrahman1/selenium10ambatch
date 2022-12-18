package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedErrorMessage="Username ";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		               
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		String actualErrorMessage= driver.findElement(By.xpath("//span[contains(text(),'Username ')]")).getText();
		
		if (actualErrorMessage.contains(expectedErrorMessage))
				{
			        System.out.println("Pass: Error Message is Verified");
			        
				}
		else
			System.out.println("Failed: Error Message is not Verified");
		
		driver.quit();	
		
	}

}
