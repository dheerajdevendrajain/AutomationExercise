package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverManager;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
    }
    @FindBy(name = "email")
    WebElement emailField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @FindBy(css = ".alert-danger")
    WebElement errorMessage;

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignup;

    @FindBy(xpath ="//h2[normalize-space()='Login to your account']")
    WebElement loginText;


    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
    public String getErrorMessage() {return errorMessage.getText();}
    public String getNewUserSignupText(){return newUserSignup.getText();}
    public String getLoginText(){return loginText.getText();}
}

