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
        Assert.assertEquals(productListSize, 12);
    }
}
