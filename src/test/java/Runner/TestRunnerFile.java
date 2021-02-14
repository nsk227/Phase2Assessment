package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//
//import cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import cucumber
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Features"
,glue= {"StepsDefinations"}
//tags = "@Login"
)

public class TestRunnerFile {

}



