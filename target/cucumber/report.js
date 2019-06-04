$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page default login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MobileTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Sign in page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.user_is_on_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login applictaion with username \"Pooja.jain@ymailinator.com\" and password \"abc123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.user_login_applictaion_with_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard is displayed is \"true\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.dashboard_is_displayed_is_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "MH Home page Sign up",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MobileTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Sign in page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.user_is_on_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sign up with following details",
  "rows": [
    {
      "cells": [
        "pooja",
        "jain",
        "testuser2562@yopmail.com",
        "9812345862",
        "abc123456",
        "abc123456"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.user_sign_up_with_following_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard is displayed is \"false\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.dashboard_is_displayed_is_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});