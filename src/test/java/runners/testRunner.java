package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-reports",
                "junit:target/cucumber-reports/test-report.xml",
                "json:target/cucumber-reports/test-report.json"},
        glue = "stepDefinitions",
        tags = "@LogoutUser",
        strict = true
)

public class testRunner {

}
