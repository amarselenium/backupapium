$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Rotateandresolution.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "#Login to Amazon"
    }
  ],
  "line": 4,
  "name": "Login Scenario",
  "description": "",
  "id": "login-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@loginTest"
    }
  ]
});
formatter.before({
  "duration": 8514806000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "change screen resolution and screen rotation",
  "description": "",
  "id": "login-scenario;change-screen-resolution-and-screen-rotation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User login to Amazon app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "rotate the screen",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "reolution changed",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "screen rotated and resolution changed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_login_to_Amazon_app()"
});
formatter.result({
  "duration": 2787210800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 5991600,
  "status": "passed"
});
});