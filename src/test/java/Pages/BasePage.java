package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void clickToElement(By element) {
        driver.findElement(element).click();
    }
    protected String getTextFromElement(By element) {
        return driver.findElement(element).getText();
    }
    protected void sendKeys(By element, String keys) {
        driver.findElement(element).sendKeys(keys);
    }
}
