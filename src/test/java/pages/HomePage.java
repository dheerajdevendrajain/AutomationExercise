package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverManager;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    private WebElement signupLoginLink;

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//h2[contains(text(),'Category')]")
    private WebElement categoryHeading;

    @FindBy(css = ".navbar-nav li a[href='/products']")
    private WebElement productsLink;

    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    private WebElement testCasesLink;

    public void clickSignupLogin() {
        signupLoginLink.click();
    }

    public void clickContactUs() {
        contactUsLink.click();
    }

    public void clickProductsLink() {
        productsLink.click();
    }

    public void clickTestCasesLink() {
        testCasesLink.click();
    }

    public String getCategoryHeadingText() {
        return categoryHeading.getText();
    }

    public String homePageName(){return  DriverManager.getInstance().getDriver().getTitle();  }
}
