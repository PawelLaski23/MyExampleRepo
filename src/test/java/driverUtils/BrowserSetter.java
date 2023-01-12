package driverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.PropertiesLoader;

import java.io.IOException;

public class BrowserSetter {
    protected WebDriver setBrowser() throws IOException {
        return switch (BrowserType.valueOf(PropertiesLoader.getBrowserName().toUpperCase())){
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
        };
    }
}
