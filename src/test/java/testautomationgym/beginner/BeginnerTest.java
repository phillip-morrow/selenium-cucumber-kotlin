package testautomationgym.beginner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "java/testautomationgym/beginner/gherkin" })
public class BeginnerTest {

}
