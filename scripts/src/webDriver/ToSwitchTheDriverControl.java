package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        //Fetching parent window Id
        String parentWindowId = driver.getWindowHandle();
        System.out.println("parentWindowId"+parentWindowId);
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        // Fetching all the windows IDs
        Set<String> allWindowIDs = driver.getWindowHandles();
        System.out.println("allwindowids"+allWindowIDs);
        for(String windowId:allWindowIDs) {
        	 // Switching any window..switching to child window
        	driver.switchTo().window(windowId);
        	//if windowId not equals to parentWindowId...means it is equal to childWindowId
        	if (!windowId.equals(parentWindowId)) {
        		
        		driver.findElement(By.linkText("Try Free")).click();
        		break;
	}

        }
         driver.switchTo().window(parentWindowId);
         driver.findElement(By.id("keepLoggedInCheckBox")).click(); 
    }
}
