package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import setup.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @When("Navigate to url {string}")
    public void navigate_to_url(String string) {

    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertEquals("Automation Exercise", homePage.homePageName());
    }

    @And("Click on {string} button")
    public void clickOnSignupLoginButton(String hyperLink) {
        homePage.clickSignupLogin();
    }


}
