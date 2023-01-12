package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAcountPage extends BasePage {

    private By firstNameInput = By.id("firstname");
    private By lastNameInput = By.id("lastname");
    private By emailInput = By.id("email_address");
    private By passwordInput = By.id("password");
    private By confirmPasswordInput = By.id("password-confirmation");
    private By createAccountButton = By.xpath("//span[text()='Create an Account']");
    private By confirmPassError = By.id("password-confirmation-error");
    private By emailError = By.id("email_address-error");

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
