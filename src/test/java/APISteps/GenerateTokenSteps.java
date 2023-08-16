package APISteps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import utils.APIConstants;

import static io.restassured.RestAssured.given;

public class GenerateTokenSteps {

    String baseURI = APIConstants.BaseURI;
    public static String token;

    @Given("a JWT is generated")
    public void a_jwt_is_generated() {
        RequestSpecification request = given().header("Content-Type", "application/json").
                body("{\n" +
                        "  \"email\": \"batch12team@test.com\",\n" +
                        "  \"password\": \"Test@123\"\n" +
                        "}");

        Response response = request.when().post("/generateToken.php");
        token = "Bearer " + response.jsonPath().getString("token");
        System.out.println(token);

    }
}
