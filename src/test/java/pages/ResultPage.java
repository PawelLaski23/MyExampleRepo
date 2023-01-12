package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage extends BasePage{

    private final By products = By.xpath("//div[@data-container='product-grid']");
    private final By resultTile = By.tagName("h1");

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public int getProductsListSize(){
        return getListSize(products);
    }

    public String getResultText(){
        return getWebElementText(resultTile);
    }
}
