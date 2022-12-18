package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropUsingOffset {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);             // only single frame is there so using index value 0
		
		WebElement element = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 50, 50).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(element, -50, 0).perform();
	}
}