package core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public final class Utils {

    public static final long DEFAULT_TIMEOUT = 10;

    private Utils() {
    }

    public static void clickWithWait(WebElement element, long timeout) {
        waitForElementToBeClickable(element, timeout);
        element.click();
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", element);
    }

    public static void switchToFrameWithWait(WebElement element, long timeout) {
        waitForElementBeVisible(element, timeout);
        DriverFactory.getDriver().switchTo().frame(element);
    }

    public static void waitForElementToBeClickable(WebElement element, long timeout) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.of(timeout, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForElementBeVisible(WebElement element, long timeToWait) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.of(timeToWait, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void openNewTab() {
        ((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.open()");
    }

    public static void switchToWindow(int n) {
        WebDriver driver = DriverFactory.getDriver();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(n - 1));
    }
}
