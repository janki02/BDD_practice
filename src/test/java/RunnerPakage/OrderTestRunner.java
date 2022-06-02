package RunnerPakage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"src/test/resources/AppFeature/order.feature"}, 
		 glue = {"StepDefinitions","MyHooks"},
		 tags = "@Regression",
          plugin = { "pretty"},
         dryRun = false,
         monochrome = true)


public class OrderTestRunner {

}
