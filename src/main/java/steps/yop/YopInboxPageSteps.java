package steps.yop;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import pages.yopmail.YopInboxPage;

import static core.Utils.DEFAULT_TIMEOUT;
import static core.Utils.clickWithWait;
import static core.Utils.switchToFrameWithWait;

public class YopInboxPageSteps {

    private YopInboxPage yopInboxPage;

    public YopInboxPageSteps(WebDriver driver) {
      yopInboxPage = new YopInboxPage(driver);
    }

    public String getTotalPrice() {
        for(int i = 0; i < 10; i++) {
            clickWithWait(yopInboxPage.getRefreshButton(), DEFAULT_TIMEOUT);
            if(yopInboxPage.getFrame().isDisplayed()) {
                break;
            }
        }
        switchToFrameWithWait(yopInboxPage.getFrame(), DEFAULT_TIMEOUT);
        return yopInboxPage.getTotalPrice().getText();
    }
}
