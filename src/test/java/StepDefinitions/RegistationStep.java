package StepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistationStep {

	@Given("user is on registation page")
	public void user_is_on_registation_page() {
		System.out.println("user navigates on registration page");
	}

	@When("user enters to following deatils")
	public void user_enters_to_following_deatils(DataTable dataTable) {

		List<List<String>> userList = dataTable.asLists(String.class);

		for (List<String> e : userList) {
			System.out.println(e);
		}

	}

	@When("user enters to following deatils with columns")
	public void user_enters_to_following_deatils_with_columns(DataTable dataTable) {
		List<Map<String,String>> uselist =dataTable.asMaps(String.class,String.class);
//		System.out.println(uselist);
//		System.out.println(uselist.get(0).get("Firstname")); // give you the mapindex and passing key will get value from that index
//		
		for (Map<String,String> e : uselist) { // for loop
			System.out.println("Firstname");
			System.out.println("lastname");
			System.out.println("phone");
			System.out.println("city");
		}
		
	}

	
	
	@Then("user registation should be successful")
	public void user_registation_should_be_successful() {
		System.out.println("user registration should be successful");

	}

}
