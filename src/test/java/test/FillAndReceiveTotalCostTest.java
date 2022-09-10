package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import core.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FillAndReceiveTotalCostTest extends BaseTest {
    public static final String NAME = "Google Cloud Platform Pricing Calculator";

    private static final Logger LOGGER = LogManager.getLogger(FillAndReceiveTotalCostTest.class);

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
        LOGGER.info("Open Google Calculator");
        LOGGER.trace("Using Search");
        pageStepsFactory.getHomePageSteps()
                .openHomePage(GOOGLE_URL)
                .searchGoogleCalculator(NAME);
        pageStepsFactory.getSearchPageSteps().openCalculatorForm();
        pageStepsFactory.getCalculatorFormPageSteps()
                .fillForm()
                .addToEstimate();
        String totalPrice = pageStepsFactory.getEstimateBlockPageSteps().getTotalPrice();
        LOGGER.info("Total price is {}", totalPrice);
        pageStepsFactory.getEstimateBlockPageSteps().clickEmailButton();

        LOGGER.info("Open new tab");
        Utils.openNewTab();
        LOGGER.trace("Switch to new tab");
        Utils.switchToWindow(2);
        pageStepsFactory.getYopHomePageSteps()
                .openYopHomePage(YOP_MAIL_URL)
                .openEmailGeneratorPage();
        String address = pageStepsFactory.getYopEmailGeneratorPageSteps().getEmailAddressText();
        LOGGER.info("Email address is {}", address);
        Utils.switchToWindow(1);
        pageStepsFactory.getEmailFormPageSteps().sendEmail(address);

        Utils.switchToWindow(2);
        pageStepsFactory.getYopHomePageSteps()
                .openYopHomePage(YOP_MAIL_URL)
                .openInboxPage(address);
        String emailTotalPrice = pageStepsFactory.getYopInboxPageSteps().getTotalPriceText();
        LOGGER.info("Total price from email is {}", totalPrice);
        LOGGER.warn("Price in email - {}, price in calc - {}", emailTotalPrice, totalPrice);
        assertEquals(totalPrice, emailTotalPrice);
    }
}
