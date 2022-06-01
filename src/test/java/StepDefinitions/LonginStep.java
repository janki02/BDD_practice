package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LonginStep { // we mapping feature file with step definition 
	
	@Given("user is on longin page")
	public void user_is_on_longin_page() {
	}
	
	@When("user enter the vaild deatils in {string} and {string}")
	public void user_enter_the_vaild_deatils_in_and(String Email, String Password) { // Parameter we passing
	   System.out.println("Email is: "+Email+ "    password is :" +Password );
	}
	@When("user click longin buttan")
	public void user_click_longin_buttan() {
	    
	}
	@Then("user able to see home page")
	public void user_able_to_see_home_page() {
	    
	}




}