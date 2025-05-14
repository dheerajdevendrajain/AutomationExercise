package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverManager;

import java.time.Duration;

public class SignupPage {

    public SignupPage() {
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
        DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmail;

    @FindBy(name = "name")
    WebElement nameField;

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement signupButton;

    @FindBy(id = "password") // Example of password field for the form after sign-up initiation
    WebElement passwordField;

    @FindBy(name = "submitAccount") // Example submit button (might vary based on the website)
    WebElement createAccountButton;

    @FindBy(css = ".alert-danger")
    WebElement errorMessage;


    public void enterEmail(String email) {
        signUpEmail.sendKeys(email);
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void enterEmailSignUp(String email) {
        signUpEmail.sendKeys(email);
    }

    public void enterName(String name) {
        signUpName.sendKeys(name);
    }
}
