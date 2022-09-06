package pages.cloud.pricing;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
@Getter
public class EmailFormPage extends BasePage {

    @FindBy(css = "iframe[src*=products]")
    private WebElement parentFrame;

    @FindBy(css = "iframe#myFrame")
    private WebElement childFrame;

    @FindBy(css = "[ng-model*='user.email']")
    private WebElement emailInput;

    @FindBy(css = "button[aria-label='Send Email']")
    private WebElement sendEmailButton;

    public EmailFormPage(WebDriver driver) {
        super(driver);
    }
}
