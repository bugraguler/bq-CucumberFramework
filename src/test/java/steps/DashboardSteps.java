package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {
    @Then("user verifies all the dashboard tabs")
    public void user_verifies_all_the_dashboard_tabs(DataTable dataTable) {
        List<String> expectedTabs = dataTable.asList();  //this data is coming from feature file
        List<String> actualTabs = new ArrayList<>();

        for (WebElement allTheElements :dashboardPage.dashboardTabs
             ) {
            actualTabs.add(allTheElements.getText());
        }
        System.out.println(actualTabs);  //coming from my execution
        System.out.println(expectedTabs); //coming from my feature file

        //if assertions is passed it will not give you any information and will execute our code
        //if assertions is failed it will give you an error with comparison
        Assert.assertTrue(expectedTabs.equals(actualTabs));

    }

}
