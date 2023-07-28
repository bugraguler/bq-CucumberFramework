package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class EmployeeSearchSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }

    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        //LoginPage loginPage=new LoginPage();
        //WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //userNameField.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(loginPage.userNameBox, ConfigReader.getPropertyValue("username"));

        //WebElement passwordField = driver.findElement(By.id("txtPassword"));
        //passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
        sendText(loginPage.passwordBox, ConfigReader.getPropertyValue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        //LoginPage loginPage=new LoginPage();
        //WebElement loginButton = driver.findElement(By.id("btnLogin"));
        click(loginPage.loginBtn);
        //loginButton.click();
        //driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    @When("user navigates to employee list page")
    public void user_navigates_to_employee_list_page() {
        //WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimOption.click();
        click(employeeSearchPage.pimOption);

        //WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        //empListOption.click();
        click(employeeSearchPage.empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        //WebElement searchId = driver.findElement(By.id("empsearch_id"));
        //searchId.sendKeys("63248134");
        sendText(employeeSearchPage.IdField, "63248134");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //WebElement searchButton = driver.findElement(By.id("searchBtn"));
        //searchButton.click();
        click(employeeSearchPage.searchButton);
    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result displayed..");
        //tearDown();
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        //driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        //WebElement searchName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        //searchName.sendKeys("zubair");
        sendText(employeeSearchPage.NameField, "ali");
    }


}
