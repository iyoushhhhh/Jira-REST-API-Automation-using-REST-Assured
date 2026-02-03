package JIRA_BugCreation.JIRA_Test;
import java.io.File;

import config.JiraConfig;

import static io.restassured.RestAssured.*;

public class BugAttach {

	public static void attachFile(String issueId, File file) {

        given()
            .pathParam("key", issueId)
            .header("Authorization", JiraConfig.AUTH)
            .header("X-Atlassian-Token", "no-check")
            .multiPart("file", file)
        .when()
            .post("/rest/api/3/issue/{key}/attachments")
        .then()
            .statusCode(200);
    }

}
