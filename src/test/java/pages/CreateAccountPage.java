package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class CreateAccountPage {

    public CreateAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "a[title='Log in to your customer account']")
    public WebElement signin;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement email;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> radioTitle;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement month;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement year;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameAddress;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameAddress;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='postcode']")
    public WebElement postcode;

    @FindBy(xpath = "//select[@id='id_country']")
    public WebElement country;

    @FindBy(xpath = "//textarea[@id='other']")
    public WebElement addInfo;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement homePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    public WebElement alias;

    @FindBy (xpath = "//span[normalize-space()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[@class='page-heading']")
    public WebElement authenticationElement;


    @FindBy(xpath = "//h3[normalize-space()='Your personal information']")
    public WebElement personalInformationElement;

    @FindBy(xpath = "//p[@class='info-account']")
    public  WebElement verifyAccount;
}
