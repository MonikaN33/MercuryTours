package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{

	ChromeDriver driver;

	
	@Given("Launch Browser")
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@And("maximise browser")
	public void maximiseBrowser() 
	{
		driver.manage().window().maximize();
	    
	}

	@And("load url")
	public void loadUrl() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    
	}

	
	 @When("enter usename") 
	 public void enterUsename() 
	 {
		 driver.findElementByName("userName").sendKeys("abc@we");
	 }
	  
	 @And("enter password")
	 public void enterPassword() 
	 {
		 driver.findElementByName("password").sendKeys("password"); 
	}
	 
	 

	@And("click login")
	public void clickLogin()
	{
		driver.findElementByName("login").click();
	    
	}

	@Then("login successfull")
	public void loginSuccessfull()
	{
	    System.out.println("Login Completed");
	    
	}
	
	
 
 
}
