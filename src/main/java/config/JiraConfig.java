package config;

import io.restassured.RestAssured;

public class JiraConfig {

    public static final String BASE_URI = "https://iyoushhhhh.atlassian.net";
    public static final String AUTH = System.getenv("JIRA_AUTH");

    public static void init() {
        RestAssured.baseURI = BASE_URI;
        RestAssured.useRelaxedHTTPSValidation();
    }
}