package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import utilities.ConfigurationReader;

import java.io.Serializable;

public class DriverManager implements Serializable {
    private static volatile DriverManager driverInstance;
    private static final InheritableThreadLocal<WebDriver> tlDriver = new InheritableThreadLocal<>();

    private DriverManager() {
    }

    private void initializeDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                tlDriver.set(new ChromeDriver());
                break;
            case "firefox":
                tlDriver.set(new FirefoxDriver());
                break;
            case "edge":
                tlDriver.set(new EdgeDriver());
                break;
            case "safari":
                tlDriver.set(new SafariDriver());
                break;
            case "remote":
                ChromeOptions options = new ChromeOptions();
                tlDriver.set(new RemoteWebDriver(options));
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser" + browser);
        }

    }

    public static DriverManager getInstance() {
        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = ConfigurationReader.get("browser");
        }
        if (driverInstance == null) {
            synchronized (DriverManager.class) {
                if (driverInstance == null) {
                    driverInstance = new DriverManager();
                }
            }
        }
        if (tlDriver.get() == null)
            driverInstance.initializeDriver(browser);
        return driverInstance;
    }

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void quitDriver() {
        if (tlDriver != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }

}
