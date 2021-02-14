package StepsDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	WebDriver driver;
	
	@Before
	public void setup() throws InterruptedException {
		System.out.println("Test Begin:");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyaswari Khadka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Guest User is on the application page");
	}
	
		@After
	public void teardown() {
		driver.close();
		System.out.println("Test Complete");
	}
}