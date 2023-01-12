package tests;

import models.User;
import pages.CreateAcountPage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewAccountTest extends BaseTest {
    @Test
    public void createAccount() {

        User user = new User("Pawel", "Laski", "pawel@email2.com", "Password123!", "Password123!");
        boolean isMyAccountPagePresent = new HomePage(driver)
                .goToCreateAccountPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getConfirmPassword())
                .clickCreateAccount()
                .waitToMyAccountPageLoad();

        Assert.assertTrue(isMyAccountPagePresent, "My account page is not present");
    }

    @Test
    public void createAccountWithInvalidEmail() {

        User user = new User("Pawel", "Laski", "InvalidEmail", "Password123!", "InvalidPassword");
        CreateAcountPage createAccountPage = new HomePage(driver)
                .goToCreateAccountPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getConfirmPassword());
        createAccountPage.clickCreateAccount();

        Assert.assertEquals(createAccountPage.getEmailError(), "Please enter a valid email address (Ex: johndoe@domain.com).");
    }

    @Test
    public void createAccountWithInvalidConfirmPass() {

        User user = new User("Pawel", "Laski", "pawel@email2.com", "Password123!", "InvalidPassword");
        CreateAcountPage createAccountPage = new HomePage(driver)
                .goToCreateAccountPage()
                .fillData(user.getName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getConfirmPassword());
        createAccountPage.clickCreateAccount();

        Assert.assertEquals(createAccountPage.getConfirmPasswordError(), "Please enter the same value again.");
    }
}
