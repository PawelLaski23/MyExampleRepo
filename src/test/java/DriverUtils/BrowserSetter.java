package DriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetter {
    protected WebDriver setBrowser(BrowserType browser){
        return switch (browser){
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
        };
    }
}
