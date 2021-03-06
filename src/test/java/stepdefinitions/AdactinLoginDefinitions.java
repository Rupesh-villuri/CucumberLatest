package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLoginDefinitions {
	
	@Given("CRM login page launched")
	public void crm_login_page_launched() {
	    
	}

	@When("provide login crdentials {string} and {string}")
	public void provide_login_crdentials_and(String string, String string2) {
	    
	}

	@Then("user launched home page")
	public void user_launched_home_page() {
	  
	}

	@Then("provide company details {string} and {string} and {string} and Click Save")
	public void provide_company_details_and_and_and_click_save(String string, String string2, String string3) {
	    
	}

	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer int1) {
	    
	}

	@When("user enters tax amount {int}")
	public void user_enters_tax_amount(Integer int1) {
	    
	}

	@Then("it gives the final amount {int}")
	public void it_gives_the_final_amount(Integer int1) {
	    
	}

	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(Double double1) {
	   
	}

	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(Double double1) {
	    
	}

	
}
