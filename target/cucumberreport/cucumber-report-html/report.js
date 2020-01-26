$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/facebook.feature");
formatter.feature({
  "line": 1,
  "name": "FaceBook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "FaceBook login",
  "description": "",
  "id": "facebook-login;facebook-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@1234"
    },
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to facebook page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I login to fb with user \"hello@gmail.com\" and password \"1234\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookLoginPage.OpenBrowser()"
});
formatter.result({
  "duration": 41533131500,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookLoginPage.navigateToFacebookPage()"
});
formatter.result({
  "duration": 84442337000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hello@gmail.com",
      "offset": 25
    },
    {
      "val": "1234",
      "offset": 56
    }
  ],
  "location": "FaceBookLoginPage.loginToFb(String,String)"
});
formatter.result({
  "duration": 12436948600,
  "status": "passed"
});
});