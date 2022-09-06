package pages.yopmail;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
@Getter
public class YopHomePage extends BasePage {

    @FindBy(css = "header a[href=email-generator]")
    private WebElement emailGeneratorButton;

    @FindBy(id ="login")
    private WebElement emailInput;

    public YopHomePage(WebDriver driver) {
        super(driver);
    }
}
