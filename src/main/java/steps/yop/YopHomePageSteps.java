package steps.yop;

import core.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.yopmail.YopHomePage;

import static core.Utils.DEFAULT_TIMEOUT;
import static core.Utils.clickWithWait;
import static core.Utils.waitForElementBeVisible;

public class YopHomePageSteps {

    private YopHomePage yopHomePage;

    public YopHomePageSteps(WebDriver driver) {
        yopHomePage = new YopHomePage(driver);
    }

    public void openEmailGeneratorPage(){
        clickWithWait(yopHomePage.getEmailGeneratorButton(), DEFAULT_TIMEOUT);
    }

    public YopHomePageSteps openYopHomePage(String url){
        DriverFactory.getDriver().get(url);
        return this;
    }

    public void openInboxPage(String address){
        waitForElementBeVisible(yopHomePage.getEmailInput(), DEFAULT_TIMEOUT);
        yopHomePage.getEmailInput().clear();
        yopHomePage.getEmailInput().sendKeys(address);
        yopHomePage.getEmailInput().sendKeys(Keys.ENTER);
    }
}
