package Tests;

import DriverUtils.BrowserType;
import DriverUtils.BrowserSetter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest extends BrowserSetter {
    protected WebDriver driver;
    @BeforeTest
    public void setUp() {
        driver = setBrowser(BrowserType.CHROME);
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
