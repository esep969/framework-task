package pages.yopmail;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class YopInboxPage extends BasePage {

    @FindBy(xpath = "//td[@colspan]/following::td/h3")
    private WebElement totalPrice;

    @FindBy(id = "refresh")
    private WebElement refreshButton;

    @FindBy(id = "ifmail")
    private WebElement frame;

    public YopInboxPage(WebDriver driver) {
        super(driver);
    }
}
