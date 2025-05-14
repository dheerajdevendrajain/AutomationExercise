package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverManager;

import java.time.Duration;

public class AccountHomePage {
    public AccountHomePage() {
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
        DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @FindBy(xpath = "//h2/b")
    private WebElement accountCreationMessage;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;

    @FindBy(xpath = "//li[10]//a[1]")
    private WebElement loggedInUser;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    private WebElement accountDeletionMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement continueButtonOnDeletedAccountPage;

    @FindBy(xpath = "//a[contains(text(), 'Delete Account')]")
    private WebElement deleteAccountLink;

    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    private WebElement logoutLink;

    public String verifyAccountCreatedMessage() {
        return accountCreationMessage.getText();
    }

    public String loggedInUser() {
        return loggedInUser.getText();
    }

    public void clickOnContinueButtonOnAccountCreatedPage() {
        continueButton.click();
    }

    public String verifyAccountDeletionMessage() {
        return accountDeletionMessage.getText();
    }

    public void clickOnContinueButton() {
        continueButtonOnDeletedAccountPage.click();
    }

    public void clickOnDeleteAccountLink() {
        deleteAccountLink.click();
    }

    public void clickOnButton(String buttonName) {
        logoutLink.click();
    }
}
