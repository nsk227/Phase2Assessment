package StepsDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
WebDriver driver;
	
	@Before
	public WebDriver setup() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyaswari Khadka\\Downloads\\chromedriver_win32\\chromedriver.exe");
if (driver==null)
driver=new ChromeDriver();
return driver;

	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
		driver=null;
		
}

}
