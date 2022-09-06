package pages.yopmail;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class YopEmailGeneratorPage extends BasePage {

    @FindBy(id = "egen")
    private WebElement emailAddressText;

    public YopEmailGeneratorPage(WebDriver driver) {
        super(driver);
    }
}
