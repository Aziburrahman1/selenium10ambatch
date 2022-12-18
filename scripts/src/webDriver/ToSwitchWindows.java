package webDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='https://hotel.irctctourism.com/hotels']")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId:allWindowIds) 
		{     
			//switching to child window
			driver.switchTo().window(windowId);
			if(!windowId.equals(parentWindowId)) 
			{
				driver.findElement(By.xpath("//div[@class='Nav-icons BusTickets']")).click();
				break;
			}
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();

	}

}
