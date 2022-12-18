package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(2000);
		 /*Handling pop up using Robot class because pop up is not inspect able and
        selenium is not providing any libraries to handle it(pop up)
        Robot class provided by java ....by java.awt package
        VK stands for virtual key*/
		
		Robot robot = new Robot();  
		robot.keyPress(KeyEvent.VK_TAB);      // shifting for X (cross button) or sign
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);       // shifting for Allow button
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);       // shifting for Block button
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);		// for enter...performing keyboard simulation using Robot class 

   }
}