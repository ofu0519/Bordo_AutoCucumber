package stepdefinitions;

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

    @Given("the homepage is opened")
    public void the_homepage_is_opened() {
        Assert.assertEquals("My Store", Driver.getDriver().getTitle());
    }

    @And("clicks sign in button and enter the email for creating account")
    public void clicks_sign_in_button_and_enter_the_email_for_creating_account() {
        createAccountPage.signin.click();
        BrowserUtilities.waitForPageToLoad(5);
        Assert.assertTrue(createAccountPage.authenticationElement.isDisplayed());
        createAccountPage.email.sendKeys(ConfigurationReader.getProperty("email"));
        createAccountPage.createAccountButton.click();
    }
    @Then("navigates to account creation page")
    public void navigatesToAccountCreationPage() {
        BrowserUtilities.waitForPageToLoad(5);
        Assert.assertTrue(createAccountPage.personalInformationElement.isDisplayed());

   }
    @And("fills relevant areas with the valid credentials")
    public void fills_relevant_areas_with_the_valid_credentials() {
    createAccountPage.radioTitle.click();
    BrowserUtilities.waitFor(1);
    createAccountPage.firstName.sendKeys(ConfigurationReader.getProperty("firstName"));
    createAccountPage.lastName.sendKeys(ConfigurationReader.getProperty("lastName"));
    createAccountPage.email.sendKeys(ConfigurationReader.getProperty("email"));
    createAccountPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    createAccountPage.day.click();
    BrowserUtilities.waitFor(1);
    createAccountPage.month.click();
    createAccountPage.year.click();
    createAccountPage.firstNameAddress.sendKeys(ConfigurationReader.getProperty("firstName"));
    createAccountPage.lastNameAddress.sendKeys(ConfigurationReader.getProperty("lastName"));
   // createAccountPage.



    }

    @Then("verifies in homepage that account is created")
    public void verifiesInHomepageThatAccountIsCreated() {
    }


}
