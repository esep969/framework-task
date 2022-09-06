package core;

import org.openqa.selenium.WebDriver;
import steps.cloud.HomePageSteps;
import steps.cloud.SearchPageSteps;
import steps.cloud.pricing.CalculatorFormPageSteps;
import steps.cloud.pricing.EmailFormPageSteps;
import steps.cloud.pricing.EstimateBlockPageSteps;
import steps.yop.YopEmailGeneratorPageSteps;
import steps.yop.YopHomePageSteps;
import steps.yop.YopInboxPageSteps;

import java.util.Objects;

public class PageStepsFactory {

    private WebDriver driver;
    private HomePageSteps homePageSteps;
    private SearchPageSteps searchPageSteps;
    private CalculatorFormPageSteps calculatorFormPageSteps;
    private EstimateBlockPageSteps estimateBlockPageSteps;
    private EmailFormPageSteps emailFormPageSteps;
    private YopHomePageSteps yopHomePageSteps;
    private YopEmailGeneratorPageSteps yopEmailGeneratorPageSteps;
    private YopInboxPageSteps yopInboxPageSteps;


    public PageStepsFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageSteps getHomePageSteps() {
        if (Objects.isNull(homePageSteps)) {
            homePageSteps = new HomePageSteps(driver);
        }
        return homePageSteps;
    }

    public SearchPageSteps getSearchPageSteps() {
        if (Objects.isNull(searchPageSteps)) {
            searchPageSteps = new SearchPageSteps(driver);
        }
        return searchPageSteps;
    }

    public CalculatorFormPageSteps getCalculatorFormPageSteps() {
        if (Objects.isNull(calculatorFormPageSteps)){
            calculatorFormPageSteps = new CalculatorFormPageSteps(driver);
        }
        return calculatorFormPageSteps;
    }

    public EstimateBlockPageSteps getEstimateBlockPageSteps() {
        if (Objects.isNull(estimateBlockPageSteps)){
            estimateBlockPageSteps = new EstimateBlockPageSteps(driver);
        }
        return estimateBlockPageSteps;
    }

    public EmailFormPageSteps getEmailFormPageSteps() {
        if (Objects.isNull(emailFormPageSteps)){
            emailFormPageSteps = new EmailFormPageSteps(driver);
        }
        return emailFormPageSteps;
    }

    public YopHomePageSteps getYopHomePageSteps() {
        if (Objects.isNull(yopHomePageSteps)) {
            yopHomePageSteps = new YopHomePageSteps(driver);
        }
        return yopHomePageSteps;
    }

    public YopEmailGeneratorPageSteps getYopEmailGeneratorPageSteps() {
        if (Objects.isNull(yopEmailGeneratorPageSteps)) {
            yopEmailGeneratorPageSteps = new YopEmailGeneratorPageSteps(driver);
        }
        return yopEmailGeneratorPageSteps;
    }

    public YopInboxPageSteps getYopInboxPageSteps() {
        if (Objects.isNull(yopInboxPageSteps)) {
            yopInboxPageSteps = new YopInboxPageSteps(driver);
        }
        return yopInboxPageSteps;
    }
}
