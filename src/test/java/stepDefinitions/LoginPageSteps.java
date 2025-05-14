package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.zh_cn.而且;
import org.junit.Assert;
import pages.LoginPage;
import pages.SignupPage;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();

    @Then("Enter name {string} and email address {string}")
    public void enterNameAndEmailAddress(String name, String email) {
        signupPage.enterName(name);
        signupPage.enterEmail(email);
    }

    @And("Click {string} button on login page")
    public void clickSignupButton(String buttonName) {
        signupPage.clickSignupButton();
    }

    @Then("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String hyperLink) {
        Assert.assertEquals(hyperLink, loginPage.getNewUserSignupText());
    }


    @Then("Verify {string} is visible on login page")
    public void verifyLoginToYourAccountIsVisibleOnLoginPage(String loginText) {
        Assert.assertEquals(loginText, loginPage.getLoginText());
    }

    @Then("Enter email address {string} and password {string} on login page")
    public void enterEmailAddressEmailAndPasswordPasswordOnLoginPage(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @Then("Click {string} button on login button")
    public void clickLoginButtonOnLoginButton(String loginButton) {
        loginPage.clickLoginButton();
    }


}
