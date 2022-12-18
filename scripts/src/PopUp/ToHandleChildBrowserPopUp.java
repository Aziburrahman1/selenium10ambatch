package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildBrowserPopUp {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String parentWindowId = driver.getWindowHandle();
		//System.out.println(parentWindowId);
		
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		//System.out.println(allWindowIds);
		
		for(String windowId:allWindowIds) {
			
			driver.switchTo().window(windowId);
			if(!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("keepLoggedInLabel")).click();
		
	}

}
