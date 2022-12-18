package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToFlipkartURL {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.get("https://www.flipkart.com/");
	}

}
