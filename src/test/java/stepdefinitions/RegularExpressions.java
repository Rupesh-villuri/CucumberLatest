package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegularExpressions {
	
	
	//we can provide either in the format of cucumber expression or regular expression
	//first one is regular expression format which was used in cucumber earlier versions, now we can directly use cucumber expressions.
	
	
	@Given("user login page launched")
	public void user_login_page_launched() {
	    
	}

	@When("^provide valid login crdentials \"([^\"]*)\" and \"([^\"]+)\"$")
	public void provide_valid_login_crdentials_and(String username, String password) {
		
		/*
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();	
		 */
	}
	

	@Then("user launched application home page")
	public void user_launched_application_home_page() {
	   
	}

	
	@Then("user enters {string} and {string} and {string}")
	public void user_enters_and_and(String string, String string2, String string3) {
	   	}
	

	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search page");
	}

	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name : " + productName + " price: " + price);
		
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName + " is displayed");

	}

	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer int1, String string) {

	}
	@Then("user closes session")
	public void user_closes_session() {
	  
	}
}
