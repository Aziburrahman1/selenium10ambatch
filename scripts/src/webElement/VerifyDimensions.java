package webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDimensions {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Java%20program/seleniumwebelement/DemoSiteFor10am2.html"); //web site created
		
        Dimension usernameDimension = driver.findElement(By.id("id1")).getSize();
        Dimension passwordDimension = driver.findElement(By.id("id2")).getSize();
          
        int usernameHeight= usernameDimension.getHeight();
        int usernameWidth= usernameDimension.getWidth();
        
        
        int passwordHeight =passwordDimension.getHeight();
        int passwordWidth =passwordDimension.getWidth();
        
        System.out.println("Username height is "+usernameHeight);
        System.out.println("Username Width is "+usernameWidth);
        System.out.println("Password height is "+passwordHeight);
        System.out.println("password Width is "+passwordWidth);
        
        if(usernameHeight==passwordHeight&&usernameWidth==passwordWidth)
        {
        	System.out.println("Pass: the dimensions are verified");
        }
        else
        	System.out.println("Fail: the dimensions are not verified");
         
        
	}

}
