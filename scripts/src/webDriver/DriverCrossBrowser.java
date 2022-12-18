package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class DriverCrossBrowser {

	   static {

		     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		     System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		     //System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

	       	}
	
	public static void main(String[] args) {
		      WebDriver driver = null;

		      CrossBrowserTesting cross = new CrossBrowserTesting();
		      cross.test(new ChromeDriver());
		      System.out.println("=============Chrome Browser is Launched==============");
		      cross.test(new FirefoxDriver());
		      System.out.println("=============Firefox Browser is Launched==============");
		      //cross.test(new EdgeDriver());
		     // System.out.println("=============Edge Browser is Launched==============");
		      
		 
	}

}