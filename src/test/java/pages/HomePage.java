package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By createAccountLink = By.linkText("Create an Account");
    private final By searchInput = By.id("search");
    private final By searchButton = By.xpath("//button[@type='submit']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CreateAcountPage goToCreateAccountPage() {
        clickToElement(createAccountLink);
        return new CreateAcountPage(driver);
    }

    public ResultPage searchProduct(String product) {
        sendKeys(searchInput, product);
        submitElement(searchButton);
        return new ResultPage(driver);
    }
}

