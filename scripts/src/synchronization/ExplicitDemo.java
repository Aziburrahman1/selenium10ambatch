package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		WebElement facebookOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Facebook")));
		facebookOption.click();
	

	}

}
