package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import setup.DriverManager;
import utilities.ConfigurationReader;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Hooks before executed-----------------------------------------");
        DriverManager.getInstance().getDriver().manage().window().maximize();
        DriverManager.getInstance().getDriver().get(ConfigurationReader.get("url"));
        DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Hooks After executed-----------------------------------------");
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "-");
            final byte[] screenshot = ((TakesScreenshot) DriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", screenshotName);
        }
        DriverManager.quitDriver();
    }
}
