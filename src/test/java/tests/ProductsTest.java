package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ProductsTest extends BaseTest {

    @Test
    public void checkProductListSize(){
        String product = "jeans pants";

        int productListSize = new HomePage(driver)
                .searchProduct(product)
                .getProductsListSize();
        Assert.assertEquals(productListSize, 12, String.format("Number of products on result page is %s, should be %s", productListSize, 12));
    }

    @Test
    public void checkResultText(){
        String product = "jeans pants";

        String resultText  = new HomePage(driver)
                .searchProduct(product)
                .getResultText();
        Assert.assertEquals(resultText, String.format("Search results for: '%s'", product), "Result text is incorrect");
    }
}
