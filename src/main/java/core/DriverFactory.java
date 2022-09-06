package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;

public final class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {
    }

    public static WebDriver createWebDriver(String driverName) {
        switch (driverName) {
            case CHROME:
                setUpChromeDriver();
                break;
            case "firefox":
                setUpFirefoxDriver();
                break;
            default:
                setUpChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        return driver;
    }

    private static void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private static void setUpFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
