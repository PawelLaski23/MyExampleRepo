package tests;

import driverUtils.BrowserSetter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public abstract class BaseTest extends BrowserSetter {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() throws IOException {
        driver = setBrowser();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
