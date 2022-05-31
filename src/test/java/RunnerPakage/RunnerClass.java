package RunnerPakage;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Janki_project\\Practice\\BDD_practice\\src\\test\\resources\\Feature.feature"
		,glue={"stepdefination"}
		)


public class RunnerClass {

}
