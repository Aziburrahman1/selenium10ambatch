package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) {
		
       // String expectedErrorMessage="Username ";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_5_6_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_5_6_na_na_na&as-pos=5&as-type=RECENT&suggestionId=iphone&requestId=69b13b7a-3bb5-4938-ab21-dbb5d57a2f35&as-searchtext=iphone");
		
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']/../..//div[text()='₹65,999']")).getText();
	        //	Two times backward traverse is done to find common element /../..
		System.out.println("Price:"+ price);
		driver.quit();
	}

}
