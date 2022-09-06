package steps.cloud;

import core.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.cloud.HomePage;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public HomePageSteps openHomePage(String url) {
        DriverFactory.getDriver().get(url);
        return this;
    }
    public void searchGoogleCalculator(String name) {
        homePage.getSearchButton().click();
        homePage.getSearchField().sendKeys(name);
        homePage.getSearchField().sendKeys(Keys.ENTER);

    }
}
