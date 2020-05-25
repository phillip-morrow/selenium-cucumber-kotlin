package testautomationgym.beginner;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BeginnerSteps implements En {
    WebDriver driver;
    final String BASE_URL = "localhost:3000";

    BeginnerSteps() {
        Given("^I am on the \"([^\"]*)\" page$", (String page) -> {
            driver.get(BASE_URL);
        });
    }

    private void BeginnerSteps(WebDriver driver) {
        Before((Scenario scenario) -> {
            this.driver = new FirefoxDriver();
        });
    }
}
