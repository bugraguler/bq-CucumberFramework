package APISteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.APIConstants;
import utils.APIPayloadConstants;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APIWorkFlowSteps {

    RequestSpecification request;
    Response response;
    public static String employee_id;

    @Given("a request is prepared to create an employee")
    public void a_request_is_prepared_to_create_an_employee() {
        request = given().header(APIConstants.HEADER_CONTENT_TYPE, APIConstants.HEADER_CONTENT_TYPE_VALUE).
                header(APIConstants.HEADER_AUTHORIZATION, GenerateTokenSteps.token).
                body(APIPayloadConstants.createEmployeePayload());
    }

    @When("a POST call is made to create an employee")
    public void a_post_call_is_made_to_create_an_employee() {
        response = request.when().post(APIConstants.CRATE_EMPLOYEE_URI);
        response.prettyPrint();

    }

    @Then("the status code for the created employee is {int}")
    public void the_status_code_for_the_created_employee_is(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

    @And("the employee created contains key {string} and value {string}")
    public void theEmployeeCreatedContainsKeyAndValue(String key, String value) {
        response.then().assertThat().body(key, equalTo(value));
    }

    @And("the employee id {string} is stored as a global variable to be used for other calls")
    public void theEmployeeIdIsStoredAsAGlobalVariableToBeUsedForOtherCalls(String empId) {
        employee_id = response.jsonPath().getString(empId);
        System.out.println(employee_id);
    }

    //******************************************************************
    //second call for getting the employee after creating it

    @Given("a request is prepared to get an employee")
    public void aRequestIsPreparedToGetAnEmployee() {
        request = given().header(APIConstants.HEADER_CONTENT_TYPE,APIConstants.HEADER_CONTENT_TYPE_VALUE).
                header(APIConstants.HEADER_AUTHORIZATION,GenerateTokenSteps.token).queryParam("employee_id",employee_id);
    }

    @When("a GET call is made to retrieve the created employee")
    public void aGETCallIsMadeToRetrieveTheCreatedEmployee() {
        response = request.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);
    }

    @Then("the status call for this employee is {int}")
    public void theStatusCallForThisEmployeeIs(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }
}
