package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AccountCreationPage;
import pages.pageBucket;

import java.util.List;
import java.util.Map;

public class AccountCreationSteps {

    AccountCreationPage accountCreationPage = new AccountCreationPage();

    @Then("Verify that {string} is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible(String accountInformation) {
        Assert.assertEquals(accountInformation, accountCreationPage.getTitle());
    }

    @And("Fill account details")
    public void fillAccountDetails(DataTable dataTable) {
        Map<String, String> accountDetails = dataTable.asMaps().get(0);
        accountCreationPage.selectGender(accountDetails.get("Title"));
        accountCreationPage.enterName(accountDetails.get("Name"));
//        accountCreationPage.enterEmail(accountDetails.get("Email"));
        accountCreationPage.enterPassword(accountDetails.get("Password"));
        accountCreationPage.selectDOB(accountDetails.get("Date of birth"));
    }

    @Then("Select checkbox {string}")
    public void selectCheckboxSignUpForOurNewsletter(String checkBox) {
        accountCreationPage.clickOnNewsLetterCheckbox(checkBox);
    }

    @Then("Fill address details")
    public void fillAddressDetails(DataTable dataTable) {
        Map<String, String> addressDetails = dataTable.asMaps().get(0);
        accountCreationPage.enterFirstname(addressDetails.get("First name"));
        accountCreationPage.enterLastname(addressDetails.get("Last name"));
        accountCreationPage.enterCompany(addressDetails.get("Company"));
        accountCreationPage.enterAddress1(addressDetails.get("Address"));
        accountCreationPage.enterAddress2(addressDetails.get("Address2"));
        accountCreationPage.selectCountry(addressDetails.get("Country"));
        accountCreationPage.enterState(addressDetails.get("State"));
        accountCreationPage.enterCity(addressDetails.get("City"));
        accountCreationPage.enterZipcode(addressDetails.get("Zipcode"));
        accountCreationPage.enterMobileNumber(addressDetails.get("Mobile Number"));
    }

    @And("Click {string} button on account creation page")
    public void clickCreateAccountButtonOnAccountCreationPage(String buttonName) {
        accountCreationPage.clickOnButton(buttonName);
    }
}
