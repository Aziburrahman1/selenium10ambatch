package PopUp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///E://Java program//seleniumwebelement/printPopUpFor10AM.html");
		
		driver.findElement(By.xpath("//button")).click(); // because single button is there..clicking on print button
		driver.switchTo().alert().accept();            // switching to print pop up..handling alert pop up using accept() function
		Runtime.getRuntime().exec("./autoIt/printpopupfor10am.exe");  // only okay button is there in alert pop up
		

	}

}
