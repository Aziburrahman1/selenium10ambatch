package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotificationPopUp {

	public static void main(String[] args) {
		          //creating an object/instance of ChromeOptions class
		ChromeOptions option = new ChromeOptions();
		          //Add chrome switch to disable notification "--disable-notifications"
		option.addArguments("--disable-notifications");
		           //Set path for the chrome driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		           //Pass ChromeOptions instance to ChromeDriver Constructor
		WebDriver driver = new ChromeDriver(option);
		           //Maximize the window
		driver.manage().window().maximize();
		          //implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        //Give the navigation of the web page in which we want to handle the notifications
		driver.get("https://www.yatra.com/");
		
	}

}
