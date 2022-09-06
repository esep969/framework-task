package test;

import core.DriverFactory;
import core.PageStepsFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

    private WebDriver driver;

    protected PageStepsFactory pageStepsFactory;
    public static final String GOOGLE_URL = "https://cloud.google.com/";
    public static final String YOP_MAIL_URL = "https://yopmail.com/";

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.createWebDriver("chrome");
        pageStepsFactory = new PageStepsFactory(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

