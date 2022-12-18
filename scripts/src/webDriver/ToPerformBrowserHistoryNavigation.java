package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws MalformedURLException {

		
		
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com/");             // to(String as argument) method
         URL url = new URL("https://www.instagram.com/");              // to(URL as argument) method and it throws MalformedURLException
        driver.navigate().to(url);
        
        driver.navigate().back();               // back method
        driver.navigate().forward();            // forward method
        driver.navigate().refresh();            // refresh method
        
	}

}
