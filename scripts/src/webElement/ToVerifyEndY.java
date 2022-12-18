package webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEndY {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Java%20program/seleniumwebelement/DemoSiteFor10am2.html"); //web site created
		
       Rectangle usernameRect = driver.findElement(By.id("id1")).getRect();
       Rectangle passwordRect = driver.findElement(By.id("id2")).getRect();
       
       int usernameStartX = usernameRect.getX();
       int passwordStartX = passwordRect.getX();
       int usernameWidth =  usernameRect.getWidth();
       int passwordWidth =  passwordRect.getWidth();
      
       int usernameEndX = usernameStartX+usernameWidth;
       int passwordEndX = passwordStartX+passwordWidth;
      
       System.out.println("Username EndX:"+usernameEndX);
       System.out.println("Password EndX:"+passwordEndX);
      
       if(usernameEndX==passwordEndX)
       {
    	  System.out.println("Pass:The Username and Password EndX is verified");
       }
       else
    	  System.out.println("Fail:The Username and Password EndX is not verified");

       driver.quit();
	 }
}