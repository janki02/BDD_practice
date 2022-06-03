package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingStep {
	int billingamount;
	double txtamount;
	double tottalamount;
	
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	    
	}

	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer billingamount) {
	  
	}
	@When("user enters txt amount {string}")
	public void user_enters_txt_amount(String string) {
	   
	}

	@When("user enters billing amount {string}")
	public void when_user_enters_billing_amount(String string) {
	   
	}

	@When("user clicks checkout button")
	public void user_clicks_checkout_button() {
	    
	}

	@Then("it should be gives the tottal amount\"{int}\"")
	public void it_should_be_gives_the_tottal_amount(Integer int1) {
	    
	}

	@Then("it should be gives the tottal amount\"{double}\"")
	public void it_should_be_gives_the_tottal_amount(Double double1) {
	   
	}

}
