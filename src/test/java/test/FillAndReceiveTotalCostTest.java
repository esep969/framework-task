package test;

import org.junit.jupiter.api.Test;

import core.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FillAndReceiveTotalCostTest extends BaseTest {
    public static final String NAME = "Google Cloud Platform Pricing Calculator";

    @Test
    public void testFillAndReceiveTotalCost() {
       /* pageStepsFactory.getHomePageSteps().openHomePage(GOOGLE_URL);
        pageStepsFactory.getHomePageSteps().searchGoogleCalculator(NAME);
        pageStepsFactory.getSearchPageSteps().openCalculatorForm();
        pageStepsFactory.getCalculatorFormPageSteps().fillForm();
        pageStepsFactory.getCalculatorFormPageSteps().addToEstimate();
        String totalPrice = pageStepsFactory.getEstimateBlockPageSteps().getTotalPrice();
        pageStepsFactory.getEstimateBlockPageSteps().clickEmailButton();
        pageStepsFactory.getEmailFormPageSteps().sendEmail("kouwaukuppatta-4840@yopmail.com");*/
        pageStepsFactory.getHomePageSteps()
                .openHomePage(GOOGLE_URL)
                .searchGoogleCalculator(NAME);
        pageStepsFactory.getSearchPageSteps().openCalculatorForm();
        pageStepsFactory.getCalculatorFormPageSteps()
                .fillForm()
                .addToEstimate();
        String totalPrice = pageStepsFactory.getEstimateBlockPageSteps().getTotalPrice();
        pageStepsFactory.getEstimateBlockPageSteps().clickEmailButton();

        Utils.openNewTab();
        Utils.switchToWindow(2);
        pageStepsFactory.getYopHomePageSteps()
                .openYopHomePage(YOP_MAIL_URL)
                .openEmailGeneratorPage();
        String address = pageStepsFactory.getYopEmailGeneratorPageSteps().getEmailAddressText();
        Utils.switchToWindow(1);
        pageStepsFactory.getEmailFormPageSteps().sendEmail(address);

        Utils.switchToWindow(2);
        pageStepsFactory.getYopHomePageSteps()
                .openYopHomePage(YOP_MAIL_URL).openInboxPage(address);
        String emailTotalPrice = pageStepsFactory.getYopInboxPageSteps().getTotalPrice();
        assertEquals(totalPrice, emailTotalPrice);
    }
}
