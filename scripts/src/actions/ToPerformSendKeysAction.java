package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformSendKeysAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");

		WebElement element = driver.findElement(By.name("q"));  // identifying google text field
		
		Actions action = new Actions(driver);                                        // identifying Google Search
        action.sendKeys(element,"automation").click(driver.findElement(By.xpath("//input[@name='btnK'][1]"))).perform();
	}
	
}
