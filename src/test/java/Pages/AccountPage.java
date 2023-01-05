package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    private By sectorTitle = By.xpath("//span[@data-ui-id='page-title-wrapper']");
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getSectorTitleText(){
        return getTextFromElement(sectorTitle);
    }
}
