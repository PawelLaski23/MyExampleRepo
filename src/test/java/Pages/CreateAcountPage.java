package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAcountPage extends BasePage {

    private By firstNameInput = By.id("firstname");
    private By lastNameInput = By.id("lastname");
    private By emailInput = By.id("email_address");
    private By passwordInput = By.id("password");
    private By confirmPasswordInput = By.id("password-confirmation");
    private By createAccountButton = By.xpath("//span[text()='Create an Account']");

    public CreateAcountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAcountPage fillData(String name, String lastName, String email, String password){
        sendKeys(firstNameInput, name);
        sendKeys(lastNameInput, lastName);
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        sendKeys(confirmPasswordInput, password);
        return this;
    }
    public AccountPage clickCreateAccount(){
        clickToElement(createAccountButton);
        return new AccountPage(driver);
    }
}
