package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
	
	@Given("Amazon logins avaialble")
	public void amazon_logins_avaialble() {
	    
		System.out.println("step1 ");
	}
	
	
	@When("enter {string} and {string}")
	public void enter_and(String username, String password) {
		
		System.out.println("Enter " +username+" and "+password);
	  
	}

	@When("search for a product with price {int} and enter")
	public void search_for_a_product_with_price_and_enter(Integer price) {
	    System.out.println("search for productwith cost "+price);
	}

	@When("search for a product")
	public void search_for_a_product() {
	    System.out.println("step2");
	}

	@Then("add to cart")
	public void add_to_cart() {
	    System.out.println("step3");
	}

}
