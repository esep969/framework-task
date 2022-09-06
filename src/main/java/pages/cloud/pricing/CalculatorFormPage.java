package pages.cloud.pricing;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

@Getter
public class CalculatorFormPage extends BasePage {

    @FindBy(css = "iframe[src*=products]")
    private WebElement parentFrame;

    @FindBy(css = "iframe#myFrame")
    private WebElement childFrame;

    @FindBy(xpath = "//md-tab-item//div[text()='Compute Engine']")
    private WebElement computeEngineButton;

    @FindBy(css = "[ng-model*='computeServer.quantity']")
    private WebElement numberOfInstancesInput;

    @FindBy(css = "[ng-model*='computeServer.os']")
    private WebElement operationSystemSelect;

    @FindBy(css = "md-option[value=free]")
    private WebElement freeOSOption;

    @FindBy(css = "[ng-model*='computeServer.class']")
    private WebElement vMClassSelect;

    @FindBy(css = "md-option[value=regular]")
    private WebElement regularOption;

    @FindBy(css = "[ng-model*='computeServer.series']")
    private WebElement seriesSelect;

    @FindBy(css = "md-option[value=n1]")
    private WebElement n1Option;

    @FindBy(css = "[ng-model*='computeServer.instance']")
    private WebElement machineTypeSelect;

    @FindBy(css = "md-option[value*=N1-STANDARD-8]")
    private WebElement standardOption;

    @FindBy(css = "md-checkbox[ng-model*='computeServer.addGPUs']")
    private WebElement addGPUsCheckbox;

    @FindBy(css = "md-select[ng-model*='computeServer.gpuType']")
    private WebElement gpuTypeSelect;

    @FindBy(css = "md-option[ng-disabled*=checkGpuAvailability] div")
    private List<WebElement> gpuTypeOptions;

    @FindBy(css = "md-select[ng-model*='computeServer.gpuCount']")
    private WebElement gpuCountSelect;

    @FindBy(xpath = "//div[@aria-hidden='false']//md-option[@value='1']")
    private WebElement singleGpuOption;

    @FindBy(css = "[ng-model*='computeServer.ssd']")
    private WebElement localSSDSelect;

    @FindBy(xpath = "//div[@aria-hidden='false']//md-option[@value='2']")
    private WebElement _2x375gbOption;

    @FindBy(css = "[ng-model*='computeServer.location']")
    private WebElement locationSelect;

    @FindBy(xpath = "//div[@aria-hidden='false']//md-option[@value='europe-west3']")
    private WebElement frankfurtOption;

    @FindBy(css = "[ng-model*='computeServer.cud']")
    private WebElement committedUsageSelect;

    @FindBy(xpath = "//div[@aria-hidden='false']//md-option[@value='1']")
    private WebElement _1yearOption;

    @FindBy(css = "button[ng-disabled*=ComputeEngineForm]")
    private WebElement addToEstimateButton;

    public CalculatorFormPage(WebDriver driver) {
        super(driver);
    }

}
