package JIRA_BugCreation.JIRA_Test;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import config.JiraConfig;


public class BugTest {


    public static String createBug(String payload) {

        String response =
        		given()
        	    .header("Content-Type", "application/json")
        	    .header("Authorization", JiraConfig.AUTH)
        	    .body(payload)
        	    .log().all()
        	.when()
        	    .post("/rest/api/3/issue")
        	.then()
        	    .log().all()   
        	    .extract().asString();
        System.out.println(response);

        return new JsonPath(response).getString("id");
    }
}
