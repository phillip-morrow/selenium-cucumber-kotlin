package testautomationgym.beginner

import io.cucumber.java8.En
import org.openqa.selenium.WebDriver
import io.cucumber.java8.Scenario
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver

class BeginnerSteps : En {
    var driver: WebDriver? = null
    val BASE_URL = "localhost:3000"

    init {
        Before { scenario: Scenario? ->
            run {
                WebDriverManager.chromedriver().setup()
                driver = ChromeDriver()
            }
        }

        After { scenario: Scenario? ->
            run {
                if (scenario?.isFailed!!) driver!!.quit()
            }
        }

        Given("I am on the {string} page") { page: String? ->
            driver!![BASE_URL]
        }
    }
}