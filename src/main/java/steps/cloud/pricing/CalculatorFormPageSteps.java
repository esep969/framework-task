package steps.cloud.pricing;

import core.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.cloud.pricing.CalculatorFormPage;

import java.util.stream.Collectors;

import static core.Utils.DEFAULT_TIMEOUT;
import static core.Utils.clickWithJS;
import static core.Utils.clickWithWait;
import static core.Utils.switchToFrameWithWait;
import static core.Utils.waitForElementBeVisible;

public class CalculatorFormPageSteps {

    private CalculatorFormPage page;

    public CalculatorFormPageSteps(WebDriver driver) {
        page = new CalculatorFormPage(driver);
    }

    public CalculatorFormPageSteps fillForm() {
        switchToFrameWithWait(page.getParentFrame(), DEFAULT_TIMEOUT);
        switchToFrameWithWait(page.getChildFrame(), DEFAULT_TIMEOUT);
        page.getComputeEngineButton().click();
        page.getNumberOfInstancesInput().sendKeys("4");
        page.getOperationSystemSelect().click();
        clickWithWait(page.getFreeOSOption(), DEFAULT_TIMEOUT);
        page.getVMClassSelect().click();
        clickWithWait(page.getRegularOption(), DEFAULT_TIMEOUT);
        page.getSeriesSelect().click();
        clickWithWait(page.getN1Option(), DEFAULT_TIMEOUT);
        page.getMachineTypeSelect().click();
        clickWithWait(page.getStandardOption(), DEFAULT_TIMEOUT);
        page.getAddGPUsCheckbox().click();
        page.getGpuTypeSelect().click();
        waitForElementBeVisible(page.getGpuTypeOptions().get(0), DEFAULT_TIMEOUT);
        page.getGpuTypeOptions().stream()
                .filter(element -> "NVIDIA Tesla T4".equals(element.getText().trim()))
                .collect(Collectors.toList()).get(0).click();
        page.getGpuCountSelect().click();
        clickWithWait(page.getSingleGpuOption(), DEFAULT_TIMEOUT);
        clickWithJS(page.getLocalSSDSelect());
        clickWithJS(page.get_2x375gbOption());
        clickWithJS(page.getLocationSelect());
        clickWithJS(page.getFrankfurtOption());
        clickWithJS(page.getCommittedUsageSelect());
        clickWithJS(page.get_1yearOption());
        DriverFactory.getDriver().switchTo().defaultContent();
        return this;
    }

    public void addToEstimate() {
        switchToFrameWithWait(page.getParentFrame(), DEFAULT_TIMEOUT);
        switchToFrameWithWait(page.getChildFrame(), DEFAULT_TIMEOUT);
        page.getAddToEstimateButton().click();
        DriverFactory.getDriver().switchTo().defaultContent();
    }
}
