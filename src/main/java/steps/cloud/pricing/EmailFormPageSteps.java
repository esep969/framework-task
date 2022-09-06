package steps.cloud.pricing;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import pages.cloud.pricing.EmailFormPage;

import static core.Utils.DEFAULT_TIMEOUT;
import static core.Utils.clickWithWait;
import static core.Utils.switchToFrameWithWait;

public class EmailFormPageSteps {

    private EmailFormPage page;

    public EmailFormPageSteps(WebDriver driver) {
        page = new EmailFormPage(driver);
    }

    public void sendEmail(String email) {
        switchToFrameWithWait(page.getParentFrame(), DEFAULT_TIMEOUT);
        switchToFrameWithWait(page.getChildFrame(), DEFAULT_TIMEOUT);
        page.getEmailInput().sendKeys(email);
        clickWithWait(page.getSendEmailButton(), DEFAULT_TIMEOUT);
        DriverFactory.getDriver().switchTo().defaultContent();
    }

}
