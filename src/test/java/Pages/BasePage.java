package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    protected Logger logger = LogManager.getLogger();

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
        logger.info("Send " + keys + " to "+ element);
        driver.findElement(element).sendKeys(keys);
    }
}