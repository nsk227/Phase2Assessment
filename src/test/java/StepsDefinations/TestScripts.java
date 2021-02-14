package StepsDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScripts {
	
	WebDriver driver;
	public TestScripts (SharedClass sharedclass) throws InterruptedException {
	driver=sharedclass.setup();
		
	
}		
	@Given("^User is in the search page$")
	public void user_is_in_the_search_page() throws InterruptedException {
		
		  driver.get("https://www.swiggy.com/restaurants");
		  driver.manage().window().maximize(); WebElement
		  location=driver.findElement(By.
		  xpath("//input[@type='text'and @id='location']")); location.sendKeys("Pune");
		  Thread.sleep(5000); driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[3]/div[1]/span[2]")).click(); 
		  Thread.sleep(5000); 
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")).click();
		  Thread.sleep(3000);
		 
		System.out.println("Food Search Begins");
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^food item is entered$")
	public void food_item_is_entered() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for restaurants or dishes']")).sendKeys("Chicken Momos"+ "\n");
		Thread.sleep(5000);
		WebElement menuitem = driver.findElement(By.partialLinkText("mad momos"));
		menuitem.click();
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^it should return the food searched$")
	public void it_should_return_the_food_searched(){
		WebElement title=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[1]/div/h1"));
		
		
		String foodresult=title.getText();
		Assert.assertEquals("mad momos", foodresult);
		System.out.println("In Search Result- It should be displaying: " + title.getText());
		
		
		  try { Thread.sleep(5000); } catch (InterruptedException e1) {
		  
		  e1.printStackTrace(); }
		  driver.get("https://www.swiggy.com/restaurants");
		  driver.manage().window().maximize();
		  
		  try { Thread.sleep(3000); } 
		  catch (InterruptedException e) 
		  { // TODO   Auto-generated catch block e.printStackTrace();   }
		  }
		 
		System.out.println("Food Search Complete");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^User is in the searchin page$")
	public void user_is_in_the_searchin_page() throws InterruptedException  {
		
		driver.get("https://www.swiggy.com/restaurants");
		  driver.manage().window().maximize(); WebElement
		  location=driver.findElement(By.
		  xpath("//input[@type='text'and @id='location']")); location.sendKeys("Pune");
		  Thread.sleep(5000); driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[3]/div[1]/span[2]")).click(); 
		  Thread.sleep(5000); 
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")).click();
		  Thread.sleep(3000);
		 
				
		// Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^Resturant is entered$")
	public void resturant_is_entered() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for restaurants or dishes']")).sendKeys("Royal Pune"+ "\n");
		Thread.sleep(5000);
		WebElement spotitem = driver.findElement(By.partialLinkText("Royal Pune"));
		spotitem.click();
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^it should return the restaurant searched$")
	public void it_should_return_the_restaurant_searched()  {
		WebElement restaurant= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[1]/div/h1"));
		
		String spotresult=restaurant.getText();
		Assert.assertEquals("Royal Pune", spotresult);
		System.out.println("In Search Result- It should be displaying: " + restaurant.getText());
		
		System.out.println("Restaurant Search Complete");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
	
}
