package internet.herokuapp.com.Helper;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions (
		
		features = "src/test/resources/Home.feature",
		plugin = {"pretty","html:target/cucumber-herokuapp-report.html"},
		
		glue =  "internet.herokuapp.com.StepDefinition" 
		
		
		)

public class Runner {

}
