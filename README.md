![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST%20Assured-4CAF50?style=flat)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)
![Jira API](https://img.shields.io/badge/Jira%20REST%20API-0052CC?style=flat&logo=jira&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)

# Jira REST API Automation using REST Assured

Automates **Jira bug creation** and **file attachment** using **Java** and **REST Assured**.  
Built with secure authentication, clean project structure, and GitHub-ready practices.

---

## 🚀 Features
- Create Jira bugs programmatically using REST APIs
- Use dynamic JSON payloads for issue creation
- Extract Jira issue ID from API responses
- Attach files using multipart/form-data
- API token–based authentication
- Secure handling of secrets via environment variables
- HTTP status code validation and error handling

---

## 🛠 Tech Stack
- **Language:** Java  
- **API Automation:** REST Assured  
- **Build Tool:** Maven  
- **Version Control:** Git, GitHub  
- **API:** Jira Cloud REST API  

---

## ▶️ How to Run

Follow the steps below to run the project locally.

---

### 1️⃣ Prerequisites
- Java 8 or above
- Maven installed
- A Jira Cloud account
- Jira API Token generated from Atlassian account settings

---

### 2️⃣ Set Jira Authentication (Environment Variable)

The project uses **environment variables** for secure authentication.  
Do **not** hardcode credentials in the code.

#### 🪟 Windows (Command Prompt)

```text
setx JIRA_AUTH "Basic base64(email:api_token)"
```
Restart your terminal / IDE after running this command.
#### 🍎 macOS / 🐧 Linux (Terminal)
```text
export JIRA_AUTH="Basic base64(email:api_token)"
```

---

###  3️⃣ Prepare Attachment Folder
Create a folder named screenshots in the project root:
```text
screenshots/
```

---

###  4️⃣ Run the Project
Run the following class as a Java Application from your IDE:
```text
CreateBugWithAttachment.java
```

---

## 📂 Project Structure
<details>
<summary>Click to expand</summary>

```text
jira-restassured-automation/
│
├── src/
│   └── main/
│       └── java/
│           ├── config/
│           │   └── JiraConfig.java
│           ├── files/
│           │   └── payload.java
│           └── JIRA_BugCreation/
│               └── JIRA_Test/
│                   ├── BugTest.java
│                   ├── BugAttach.java
│                   └── CreateBugWithAttachment.java
│
├── screenshots/        # Local only (ignored by git)
├── .gitignore
├── pom.xml
└── README.md
```
