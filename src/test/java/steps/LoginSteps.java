package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
        //tearDown();
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        //LoginPage loginPage=new LoginPage();
        //WebElement userNameField = driver.findElement(By.id("txtUsername"));
        sendText(loginPage.userNameBox, "tts12345");
        //WebElement passwordField = driver.findElement(By.id("txtPassword"));
        sendText(loginPage.passwordBox, "Hum@nhrm123");
    }

    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {

        // Leaving it for validation
        //tearDown();
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        //LoginPage loginPage=new LoginPage();
        //WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //userNameField.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(loginPage.userNameBox, "tts12345");
        //WebElement passwordField = driver.findElement(By.id("txtPassword"));
        //passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
        sendText(loginPage.passwordBox, "Hum@nhrm");
    }

    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        // verify the error message
        // tearDown();
    }

}
