package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage extends BasePage{

    private By products = By.xpath("//div[@data-container='product-grid']");

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public int getProductsListSize(){
        return getListSize(products);
    }
}
