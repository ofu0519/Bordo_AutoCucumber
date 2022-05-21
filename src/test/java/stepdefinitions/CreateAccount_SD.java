package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CreateAccountPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CreateAccount_SD {
    CreateAccountPage createAccountPage = new CreateAccountPage();
    Faker faker = new Faker();
    @Given("the homepage is opened")
    public void the_homepage_is_opened() {
        Assert.assertEquals("My Store", Driver.getDriver().getTitle());
    }

    @And("clicks sign in button and enter the email for creating account")
    public void clicks_sign_in_button_and_enter_the_email_for_creating_account() {
        createAccountPage.signin.click();
        BrowserUtilities.waitForPageToLoad(5);
        Assert.assertTrue(createAccountPage.authenticationElement.isDisplayed());
        createAccountPage.email.sendKeys(faker.internet().emailAddress());
        createAccountPage.createAccountButton.click();
    }
    @Then("navigates to account creation page")
    public void navigatesToAccountCreationPage() {
        BrowserUtilities.waitFor(3);
      Assert.assertTrue(createAccountPage.personalInformationElement.isDisplayed());

   }
    @And("fills relevant areas with the valid credentials")
    public void fills_relevant_areas_with_the_valid_credentials() {
    BrowserUtilities.waitFor(2);
    createAccountPage.radioTitle.get(0).click();
    BrowserUtilities.waitFor(1);
    createAccountPage.firstName.sendKeys(ConfigurationReader.getProperty("firstName"));
    BrowserUtilities.waitFor(3);
    createAccountPage.lastName.sendKeys(ConfigurationReader.getProperty("lastName"));
    BrowserUtilities.waitFor(3);
    createAccountPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    BrowserUtilities.waitFor(3);
    createAccountPage.day.click();
    Select selectDay = new Select(createAccountPage.day);
    selectDay.selectByIndex(2);
    BrowserUtilities.waitFor(1);
    createAccountPage.month.click();
    Select selectMonth = new Select(createAccountPage.month);
    selectMonth.selectByIndex(2);
    BrowserUtilities.waitFor(1);
    createAccountPage.year.click();
    Select selectChoose = new Select(createAccountPage.year);
    selectChoose.selectByValue("2004");
    BrowserUtilities.waitFor(1);
    createAccountPage.company.sendKeys(faker.company().name());
    BrowserUtilities.waitFor(2);
    createAccountPage.address.sendKeys(faker.address().fullAddress());
    BrowserUtilities.waitFor(2);
    createAccountPage.address2.sendKeys(faker.address().buildingNumber());
    BrowserUtilities.waitFor(2);
    createAccountPage.city.sendKeys(faker.address().cityName());
    selectChoose  = new Select(createAccountPage.state);
    selectChoose.selectByVisibleText("Colorado");
    BrowserUtilities.waitFor(1);
    createAccountPage.postcode.sendKeys("20000");
    selectChoose.selectByValue("21");
    BrowserUtilities.waitFor(1);
    createAccountPage.homePhone.sendKeys("03588888888");
    BrowserUtilities.waitFor(1);
    createAccountPage.mobilePhone.sendKeys("05003333333");
    BrowserUtilities.waitFor(1);
    createAccountPage.alias.sendKeys("My address");
    BrowserUtilities.waitFor(1);
    createAccountPage.register.click();
    BrowserUtilities.waitFor(1);

    }

    @Then("verifies in homepage that account is created")
    public void verifiesInHomepageThatAccountIsCreated() {
       BrowserUtilities.waitFor(2);
       String actualText = createAccountPage.verifyAccount.getText();
       String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";
       Assert.assertEquals(expectedText,actualText);
       String title= Driver.getDriver().getTitle();
       Assert.assertTrue(title.contains("My account - My Store"));

    }


}
