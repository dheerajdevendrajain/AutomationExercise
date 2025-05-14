package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AccountHomePage;
import pages.pageBucket;

public class AccountHomePageSteps {
    AccountHomePage accountHomePage = new AccountHomePage();

    @And("Verify that {string} is visible on account home page")
    public void verifyThatACCOUNTCREATEDIsVisibleOnAccountHomePage(String message) {
        Assert.assertEquals(message, accountHomePage.verifyAccountCreatedMessage());

    }

    @And("Click {string} button account home page")
    public void clickContinueButtonAccountHomePage(String button) {
        accountHomePage.clickOnContinueButtonOnAccountCreatedPage();

    }

    @And("Verify that {string} is visible on account page")
    public void verifyThatLoggedInAsUsernameIsVisibleOnAccountPage(String message) {
        Assert.assertEquals(message, accountHomePage.loggedInUser());
    }

    @And("Click {string} button account page")
    public void clickDeleteAccountButtonAccountPage(String link) {
        accountHomePage.clickOnDeleteAccountLink();
    }

    @And("Verify that {string} is visible and click {string} button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton(String account, String button) {
        Assert.assertEquals(account, accountHomePage.verifyAccountDeletionMessage());
        accountHomePage.clickOnContinueButton();

    }

    @Then("Verify that {string} is visible after login")
    public void verifyThatACCOUNTDELETEDIsVisibleAfterLogin(String message) {
        Assert.assertEquals(message, accountHomePage.verifyAccountDeletionMessage());
    }

    @And("Click {string} button")
    public void clickLogoutButton(String buttonName) {
        accountHomePage.clickOnButton(buttonName);
    }
}
