$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/RegisterUser.feature");
formatter.feature({
  "name": "Register user on automation exercise",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Logout user positive scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LogoutUser"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "name": "Verify that home page is visible successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on \u0027Signup / Login\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \u0027Login to your account\u0027 is visible on login page",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter email address \u0027\u003cEmail\u003e\u0027 and password \u0027\u003cPassword\u003e\u0027 on login page",
  "keyword": "Then "
});
formatter.step({
  "name": "Click \u0027login\u0027 button on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify that \u0027Logged in as \u003cName\u003e\u0027 is visible on account page",
  "keyword": "And "
});
formatter.step({
  "name": "Click \u0027Logout\u0027 button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \u0027Login to your account\u0027 is visible on login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "Dheeraj",
        "abc@ghj.mm",
        "Test@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logout user positive scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TestFeature"
    },
    {
      "name": "@LogoutUser"
    },
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify that home page is visible successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.verifyThatHomePageIsVisibleSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Signup / Login\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HomePageSteps.clickOnSignupLoginButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \u0027Login to your account\u0027 is visible on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginPageSteps.verifyLoginToYourAccountIsVisibleOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter email address \u0027abc@ghj.mm\u0027 and password \u0027Test@1234\u0027 on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginPageSteps.enterEmailAddressEmailAndPasswordPasswordOnLoginPage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027login\u0027 button on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginPageSteps.clickLoginButtonOnLoginButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \u0027Logged in as Dheeraj\u0027 is visible on account page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AccountHomePageSteps.verifyThatLoggedInAsUsernameIsVisibleOnAccountPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Logout\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AccountHomePageSteps.clickLogoutButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \u0027Login to your account\u0027 is visible on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginPageSteps.verifyLoginToYourAccountIsVisibleOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});