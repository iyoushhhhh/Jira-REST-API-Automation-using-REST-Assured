package JIRA_BugCreation.JIRA_Test;

import java.io.File;

import config.JiraConfig;
import files.payload;

public class CreateBugWithAttachment {

    public static void main(String[] args) {

        //Initialize Jira config
        JiraConfig.init();

        //Create Jira bug
        String issueId = BugTest.createBug(payload.createBug());
        System.out.println("Bug created with ID: " + issueId);

        //File from YOUR DEVICE
        File attachment = new File(
            "screenshots/Screenshot (2089).png"
        );

        if (!attachment.exists()) {
            System.err.println("File not found on device!");
            return;
        }

        //Attach file to bug
        BugAttach.attachFile(issueId, attachment);
        System.out.println("File attached successfully.");
    }
}
