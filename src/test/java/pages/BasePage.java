package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected Logger logger = LogManager.getLogger();
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    protected void clickToElement(By element) {
        driver.findElement(element).click();
    }

    protected void sendKeys(By element, String keys) {
        logger.info("Send " + keys + " to "+ element);
        driver.findElement(element).sendKeys(keys);
    }
    protected boolean waitToTitleContains(String titlePagePart){
        return wait.until(ExpectedConditions.titleContains(titlePagePart));
    }
    protected WebElement waitToElementVisible(By element){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
