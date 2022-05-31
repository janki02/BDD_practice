package RunnerPakage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Janki_project\\Practice\\BDD_practice\\src\\test\\java\\AppFeature\\LoginFeature.feature"},
		glue={"StepDefinitions"},
		plugin = {"pretty"}
		)




public class longintestRunner {
	
	
	
	

}
