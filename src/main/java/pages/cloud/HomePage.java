package pages.cloud;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class HomePage extends BasePage {

    @FindBy(css = "devsite-search[aria-expanded=false] [role=searchbox]")
    private WebElement searchButton;

    @FindBy(css = "input[aria-label='Search']")
    private WebElement searchField;


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
