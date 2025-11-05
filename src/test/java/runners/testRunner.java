package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import java.io.File;

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

public class testRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite()
    public void clearLogFile() {
        String logFilePath = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + "Logs" + File.separator + "test_automation.log";
        File f = new File(logFilePath);
        if (f.exists())
            f.delete();

        String log4jConfPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources"
                + File.separator + "config" + File.separator + "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
