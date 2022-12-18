package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginActiTimeUsing_ActionClassClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Actions action = new Actions(driver);
		driver.findElement(By.id("username")).sendKeys("akasha@113");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		
		action.sendKeys(password, Keys.ENTER).perform();
		Thread.sleep(2000);
        driver.quit();
	}

}
