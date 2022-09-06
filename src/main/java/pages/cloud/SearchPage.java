package pages.cloud;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class SearchPage extends BasePage {

    @FindBy(xpath = "//div[@class='gsc-thumbnail-inside']//a/b[text()='Google Cloud Pricing Calculator']")
    private WebElement calculatorLink;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
