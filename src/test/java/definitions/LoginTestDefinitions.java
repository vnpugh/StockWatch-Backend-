package definitions;

import com.stockwatch.capstone.CapstoneApplication;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.port;


@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = CapstoneApplication.class)
public class LoginTestDefinitions {


//    private static final String BASE_URL = ;
//
//    @Given("a registered user")
//    public void aRegisteredUser() throws JSONException {
//        RequestSpecification request = RestAssured.given();
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "email100@gmail.com");
//        requestBody.put("password", "password100");
//        request.header("Content-Type", "application/json");
//        response = request.body(requestBody.toString()).post(BASE_URL + port +"/api/users/register");
//    }





















}
