package steps.yop;

import org.openqa.selenium.WebDriver;
import pages.yopmail.YopEmailGeneratorPage;

public class YopEmailGeneratorPageSteps {

    private YopEmailGeneratorPage generatorPage;

    public YopEmailGeneratorPageSteps(WebDriver driver){
        generatorPage = new YopEmailGeneratorPage(driver);
    }

    public String getEmailAddressText(){
        return generatorPage.getEmailAddressText().getText();
    }


}
