package test;

import com.epam.reportportal.junit5.ReportPortalExtension;
import core.DriverFactory;
import core.PageStepsFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
@ExtendWith(ReportPortalExtension.class)
public abstract class BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
    private WebDriver driver;
    protected PageStepsFactory pageStepsFactory;
    public static final String GOOGLE_URL = "https://cloud.google.com/";
    public static final String YOP_MAIL_URL = "https://yopmail.com/";

    @BeforeEach
    public void setUp() {
        LOGGER.info("Setup driver");
        driver = DriverFactory.createWebDriver("chrome");
        pageStepsFactory = new PageStepsFactory(driver);
    }

    @AfterEach
    public void tearDown() {
        LOGGER.info("Close driver");
        driver.quit();
    }
}

