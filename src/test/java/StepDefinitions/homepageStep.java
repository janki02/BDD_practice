package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepageStep {
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("step -1");
	}

	@When("user select desktop")
	public void user_select_desktop() {
	    System.out.println("step -2");

	}

	@When("user click desktop buttan")
	public void user_click_desktop_buttan() {
	    System.out.println("step -3");

	}

	@Then("user able to see desktop page")
	public void user_able_to_see_desktop_page() {
	    System.out.println("step -4");

	}

	@Given("user is on desktop page")
	public void user_is_on_desktop_page() {
		System.out.println("step -5");
	}

	@When("user select tablets")
	public void user_select_tablets() {
		System.out.println("step -6");
	}

	@Then("user click tablets buttan")
	public void user_click_tablets_buttan() {
		System.out.println("step -7");
	}

	@Then("user able to see tablets page")
	public void user_able_to_see_tablets_page() {
		System.out.println("step -8");
	   
	}

	@Then("user select the {string} and price is {int} USD")
	public void user_select_the_and_price_is_usd(String product, Integer ammount) {
		System.out.println("step -9"+product+  " "  +ammount+  " ");
	}
	
	@Given("user is on desktop page for camera")
	public void user_is_on_desktop_page_for_camera() {
		System.out.println("step -10");
	}

@When("user select camera")
public void user_select_camera() {
   
}




@Then("user click camera buttan")
public void user_click_camera_buttan() {
    
}
@Then("user able to see camera page")
public void user_able_to_see_camera_page() {
    
}

}
