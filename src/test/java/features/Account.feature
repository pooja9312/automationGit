Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Home page default login
Given User is on Sign in page
When User login applictaion with username "Pooja.jain@ymailinator.com" and password "abc123456"
Then dashboard is displayed is "true"













