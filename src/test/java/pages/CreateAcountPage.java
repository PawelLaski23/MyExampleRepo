package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAcountPage extends BasePage {

    private final By firstNameInput = By.id("firstname");
    private final By lastNameInput = By.id("lastname");
    private final By emailInput = By.id("email_address");
    private final By passwordInput = By.id("password");
    private final By confirmPasswordInput = By.id("password-confirmation");
    private final By createAccountButton = By.xpath("//span[text()='Create an Account']");
    private final By confirmPassError = By.id("password-confirmation-error");
    private final By emailError = By.id("email_address-error");

    public CreateAcountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAcountPage fillData(String name, String lastName, String email, String password, String confirmPassword){
        sendKeys(firstNameInput, name);
        sendKeys(lastNameInput, lastName);
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        sendKeys(confirmPasswordInput, confirmPassword);
        logger.info("Register data was filled");
        return this;
    }

    public AccountPage clickCreateAccount(){
        clickToElement(createAccountButton);
        logger.info("Create Account button was clicked");
        return new AccountPage(driver);
    }

    public String getConfirmPasswordError(){
        return waitToElementVisible(confirmPassError).getText();
    }

    public String getEmailError(){
        return waitToElementVisible(emailError).getText();
    }
}
