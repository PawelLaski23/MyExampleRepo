package pages;

import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean waitToMyAccountPageLoad(){
        return waitToTitleContains("My Account");
    }
}
