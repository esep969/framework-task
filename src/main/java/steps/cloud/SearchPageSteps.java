package steps.cloud;

import org.openqa.selenium.WebDriver;
import pages.cloud.SearchPage;

public class SearchPageSteps {

    private SearchPage searchPage;

    public  SearchPageSteps(WebDriver driver) {
        searchPage = new SearchPage(driver);
    }

    public void openCalculatorForm() {
      searchPage.getCalculatorLink().click();
    }
}
