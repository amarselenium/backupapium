$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/lunch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Login to Amazon"
    }
  ],
  "line": 3,
  "name": "Login Scenario",
  "description": "",
  "id": "login-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@loginTest"
    }
  ]
});
formatter.before({
  "duration": 7808704500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login to Amazon App",
  "description": "",
  "id": "login-scenario;login-to-amazon-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User login to Amazon app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user navigate to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_login_to_Amazon_app()"
});
formatter.result({
  "duration": 1691097800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_enter_username_and_password()"
});
formatter.result({
  "duration": 19059293700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_navigate_to_Home_page()"
});
formatter.result({
  "duration": 8281678300,
  "status": "passed"
});
formatter.after({
  "duration": 873100,
  "status": "passed"
});
});