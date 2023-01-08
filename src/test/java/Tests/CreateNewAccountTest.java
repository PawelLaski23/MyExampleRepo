package Tests;

import Models.User;
import Pages.CreateAcountPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewAccountTest extends BaseTest {
    @Test
    public void createAccount() {

        User user = new User();
        boolean isMyAccountPagePresent = new HomePage(driver)
                .goToCreateAccPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getConfirmPassword())
                .clickCreateAccount()
                .waitToMyAcountPageLoad();

        Assert.assertTrue(isMyAccountPagePresent, "My account page is not present");
    }

    @Test
    public void createAccountWithInvalidEmail() {

        User user = new User();
        user.setEmail("InvalidEmail");
        CreateAcountPage createAccountPage = new HomePage(driver)
                .goToCreateAccPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getConfirmPassword());
        createAccountPage.clickCreateAccount();

        Assert.assertEquals(createAccountPage.getEmailError(), "Please enter a valid email address (Ex: johndoe@domain.com).");
    }

    @Test
    public void createAccountWithInvalidConfirmPass() {

        User user = new User();
        user.setConfirmPassword("InvalidPassword");
        CreateAcountPage createAccountPage = new HomePage(driver)
                .goToCreateAccPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getConfirmPassword());
        createAccountPage.clickCreateAccount();

        Assert.assertEquals(createAccountPage.getConfirmPasswordError(), "Please enter the same value again.");
    }
}
