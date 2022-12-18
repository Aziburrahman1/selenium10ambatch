package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLogo {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			
//			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");  //because of <td> Xpath Attribute
//			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager"); //because of <td> Xpath Attribute
//			driver.findElement(By.xpath("//img[text()='/static-assets-web.flixcart.com/www/linchpin/fk-cp-zion/img/plus_aef861.png ']")).click(); 
//			driver.findElement(By.xpath("//a[text()='/plus']")).click(); 
		   
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    driver.findElement(By.partialLinkText("Explore")).click();

		  	// Xpath by text()
					
		
	}

}
