package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformQuitAction1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");       // demo website url 
        Thread.sleep(2000);                      // It throws Interrupted Exception 
        // clicking on the link
         driver.findElement(By.linkText("actiTIME Inc.")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("actiTIME Inc.")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("actiTIME Inc.")).click();
         Thread.sleep(2000);
         driver.quit();

	}

}
