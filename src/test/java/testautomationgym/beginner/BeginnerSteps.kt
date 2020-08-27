package testautomationgym.beginner

import io.cucumber.java8.En
import org.openqa.selenium.WebDriver
import io.cucumber.java8.HookBody
import io.cucumber.java8.Scenario
import org.openqa.selenium.firefox.FirefoxDriver
import io.cucumber.java8.StepDefinitionBody

class BeginnerSteps : En {
    var driver: WebDriver? = null
    val BASE_URL = "localhost:3000"

    init {
        Before { scenario: Scenario? -> driver = FirefoxDriver() }
        Given("^I am on the {string} page$") { page: String? -> driver!![BASE_URL] }
    }
}