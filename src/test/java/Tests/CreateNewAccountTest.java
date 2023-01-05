package Tests;

import Models.User;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateNewAccountTest extends BaseTest {
    @Test
    public void createAccountTest(){

        User user = new User();
        String sectorTitleText = new HomePage(driver)
                .goToCreateAccPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword())
                .clickCreateAccount()
                .getSectorTitleText();

        Assert.assertEquals(sectorTitleText, "My Account");
    }
}
