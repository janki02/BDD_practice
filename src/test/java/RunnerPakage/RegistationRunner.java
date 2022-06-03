package RunnerPakage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Registration.feature"}, 
		 glue = {"StepDefinitions"},
          plugin = { "pretty"},
         dryRun = false,
         monochrome = true)
		
	

public class RegistationRunner {

}
