package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrl {

   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   System.out.println("current url is : " +driver.getCurrentUrl());
	   //instead of direct printing of current url
	   //we can also store current url in reference variable for future reference
	   driver.close();
   }
}
