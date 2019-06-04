Feature: Application Login

@MobileTest
Scenario: Home page default login
Given User is on Sign in page
When User login applictaion with username "Pooja.jain@ymailinator.com" and password "abc123456"
Then dashboard is displayed is "true"

@SmokeTest
Scenario: Home page invalid login
Given User is on Sign in page
When User login applictaion with username "test" and password "abc123456"
Then dashboard is displayed is "false"

@MobileTest
Scenario: MH Home page Sign up
Given User is on Sign in page
When User sign up with following details
| pooja | jain | testuser2562@yopmail.com | 9812345862 | abc123456 |abc123456 |
Then dashboard is displayed is "false"

@SmokeTest
Scenario Outline: Home page invalid login
Given User is on Sign in page
When User login into applictaion with <username> and <password>
Then dashboard is displayed or not

Examples: 
|username |password |
|user1 |pass1|
|Pooja.jain@ymailinator.com |abc123456|
|user2 |pass2|













