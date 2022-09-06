package pages.cloud.pricing;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
@Getter
public class EstimateBlockPage extends BasePage {

    @FindBy(css = "iframe[src*=products]")
    private WebElement parentFrame;

    @FindBy(css = "iframe#myFrame")
    private WebElement childFrame;

    @FindBy(id = "email_quote")
    private WebElement emailButton;

    @FindBy(xpath = "//md-content[@id='compute']/following::h2/b")
    private WebElement totalPrice;

    public EstimateBlockPage(WebDriver driver) {
        super(driver);
    }
}
