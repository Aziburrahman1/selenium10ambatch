package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSimulationDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		WebElement compendiumDevLink = driver.findElement(By.linkText("compendiumdev"));
		Actions action = new Actions(driver);
		action.moveToElement(compendiumDevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();

	}

}
