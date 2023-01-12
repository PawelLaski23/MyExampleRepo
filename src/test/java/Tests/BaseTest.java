package Tests;

import DriverUtils.BrowserType;
import DriverUtils.BrowserSetter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest extends BrowserSetter {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = setBrowser(BrowserType.CHROME);
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
