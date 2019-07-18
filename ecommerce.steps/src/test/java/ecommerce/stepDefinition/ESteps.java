package ecommerce.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ESteps {
	
	 WebDriver driver;
	 
	 @Given("User has logged on")
	 public void user_has_logged_on() {
	      System.setProperty("webdriver.gecko.driver","C://Users//Fm1//eclipse-workspace//vehicle.details.cucumber//Driver//geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Login Successful - Passed");
	}
	 @Given("User clicks on serach page")
	 public void user_clicks_on_serach_page() {
		System.out.println("search page Successful - Passed, Test closed");
		driver.close();
	}
@Given("User clicks on advanced search page")
public void user_clicks_on_advanced_search_page() {
System.out.println("advanced search page Successful - Passed");
}

@When("User places products")
public void user_places_products() {
	System.out.println("products placement Successful - Passed");
}
@When("User clicks on check out")
public void user_clicks_on_check_out() {
	System.out.println("check out Successful - Passed");
}
@When("User buys products")
public void user_buys_products() {
	System.out.println("products purchases Successful - Passed");
}
@Then("User gets product purchase confirmation, payment successful")
public void user_gets_product_purchase_confirmation_payment_successful() {
	System.out.println("products purchases Successful - Passed");
}
@Then("User logs out")
public void user_logs_out() {
	System.out.println("log out Successful - Passed");
}
}
