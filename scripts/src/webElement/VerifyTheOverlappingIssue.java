package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheOverlappingIssue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Java%20program/seleniumwebelement/DemoSiteFor10am2.html"); //web site created
		
	    Rectangle usernameRect = driver.findElement(By.id("id1")).getRect();
	    Rectangle passwordRect = driver.findElement(By.id("id2")).getRect();
	    
	    int usernameEndY = usernameRect.getY()+usernameRect.getHeight();
	    int passwordStartY = passwordRect.getY();
	    
	    int space = passwordStartY - usernameEndY;
	    System.out.println("The space is :"+space);
	    
	    System.out.println("The Username EndY:"+usernameEndY);
	    System.out.println("The Username EndY:"+passwordStartY);
	    
	    if(usernameEndY<=passwordStartY)
	    {
	    	System.out.println("Pass: There is no overlapping");
	    }
	    else
	    	System.out.println("Fail: There is overlapping");
	}
}
