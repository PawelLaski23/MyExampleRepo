package Pages;

import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean waitToMyAcountPageLoad(){
        return waitToTitleContains("My Account");
    }
}
