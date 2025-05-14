package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import setup.DriverManager;
import java.time.Duration;

public class AccountCreationPage {
    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getInstance().getDriver();

    public AccountCreationPage() {
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
        DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    private WebElement title;

    @FindBy(id = "id_gender1")
    private WebElement GenderMr;

    @FindBy(id = "id_gender2")
    private WebElement GenderMrs;

    @FindBy(id = "name")
    private WebElement Name;

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "password")
    private WebElement Password;

    @FindBy(id = "days")
    private WebElement DOBDay;

    @FindBy(id = "months")
    private WebElement DOBMonth;

    @FindBy(id = "years")
    private WebElement DOBYears;

    @FindBy(id = "first_name")
    private WebElement FirstName;

    @FindBy(id = "last_name")
    private WebElement LastName;

    @FindBy(id = "company")
    private WebElement companyName;

    @FindBy(id = "address1")
    private WebElement Address1;

    @FindBy(id = "address2")
    private WebElement Address2;

    @FindBy(id = "country")
    private WebElement CountryDropDown;

    @FindBy(id = "state")
    private WebElement State;

    @FindBy(id = "city")
    private WebElement City;

    @FindBy(id = "zipcode")
    private WebElement Zipcode;

    @FindBy(id = "mobile_number")
    private WebElement MobileNumber;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    private WebElement CreateButton;

    @FindBy(id = "newsletter")
    private WebElement newsLetterCheckbox;

    @FindBy(id = "optin")
    private WebElement optinCheckbox;

    @FindBy(xpath = "//*[@data-qa = 'create-account']")
    private WebElement createAccountButton;

    public String getTitle() {
        return title.getText();
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Mr")) GenderMr.click();
        else if (gender.equalsIgnoreCase("Mrs")) {
            GenderMrs.click();
        }
    }

    public void enterName(String name) {
        Name.clear();
        Name.sendKeys(name);

    }

    public void enterEmail(String email) {
        Email.clear();
        Email.sendKeys(email);
    }

    public void enterPassword(String password) {
        Password.clear();
        Password.sendKeys(password);
    }

    public void selectDOB(String Date_of_birth) {
        String[] DOB = Date_of_birth.split("-");
        Select select = new Select(DOBDay);
        select.selectByValue(DOB[0]);
        select = new Select(DOBMonth);
        select.selectByValue(DOB[1]);
        select = new Select(DOBYears);
        select.selectByValue(DOB[2]);
    }

    public void clickOnNewsLetterCheckbox(String checkbox) {
        js.executeScript("arguments[0].scrollIntoView();", newsLetterCheckbox);
        if (checkbox.equalsIgnoreCase("Sign up for our newsletter!")) {
            if (!newsLetterCheckbox.isSelected()) newsLetterCheckbox.click();
        } else if (checkbox.equalsIgnoreCase("Receive special offers from our partners!"))
            if (!optinCheckbox.isSelected()) optinCheckbox.click();

    }

    public void enterFirstname(String firstName) {
        FirstName.clear();
        FirstName.sendKeys(firstName);
    }

    public void enterLastname(String lastName) {
        LastName.clear();
        LastName.sendKeys(lastName);
    }

    public void enterCompany(String company) {
        companyName.clear();
        companyName.sendKeys(company);
    }

    public void enterAddress1(String addressLine1) {
        Address1.clear();
        Address1.sendKeys(addressLine1);
    }

    public void enterAddress2(String addressLine2) {
        Address2.clear();
        Address2.sendKeys(addressLine2);
    }

    public void selectCountry(String country) {
        js.executeScript("arguments[0].scrollIntoView();", CountryDropDown);
        Select select = new Select(CountryDropDown);
        select.selectByVisibleText(country);
    }

    public void enterState(String state) {
        State.clear();
        State.sendKeys(state);
    }

    public void enterCity(String cityName) {
        City.clear();
        City.sendKeys(cityName);
    }

    public void enterZipcode(String zipcode) {
        Zipcode.clear();
        Zipcode.sendKeys(zipcode);
    }

    public void enterMobileNumber(String mobileNUmber) {
        MobileNumber.clear();
        MobileNumber.sendKeys(mobileNUmber);
    }

    public void clickOnButton(String buttonName) {
        createAccountButton.click();
    }
}
