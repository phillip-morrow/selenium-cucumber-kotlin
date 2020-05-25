package testautomationgym.beginner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/test-automation-gym/beginner/gherkin" })
public class BeginnerTest {

}
