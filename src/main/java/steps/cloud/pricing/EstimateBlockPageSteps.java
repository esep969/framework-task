package steps.cloud.pricing;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import pages.cloud.pricing.EmailFormPage;
import pages.cloud.pricing.EstimateBlockPage;

import static core.Utils.DEFAULT_TIMEOUT;
import static core.Utils.clickWithWait;
import static core.Utils.switchToFrameWithWait;

public class EstimateBlockPageSteps {

    private EstimateBlockPage page;

    public EstimateBlockPageSteps(WebDriver driver) {
        page = new EstimateBlockPage(driver);
    }

    public void clickEmailButton() {
        DriverFactory.getDriver().switchTo().defaultContent();
        switchToFrameWithWait(page.getParentFrame(), DEFAULT_TIMEOUT);
        switchToFrameWithWait(page.getChildFrame(), DEFAULT_TIMEOUT);
        clickWithWait(page.getEmailButton(), DEFAULT_TIMEOUT);
        DriverFactory.getDriver().switchTo().defaultContent();
    }

    public String getTotalPrice() {
        switchToFrameWithWait(page.getParentFrame(), DEFAULT_TIMEOUT);
        switchToFrameWithWait(page.getChildFrame(), DEFAULT_TIMEOUT);
        return page.getTotalPrice().getText()
                .replace("Total Estimated Cost:", "")
                .replace("per 1 month", "")
                .trim();
    }

}
