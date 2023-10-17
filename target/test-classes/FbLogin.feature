@Login
Feature: Validation of Facebook details
@Smoke
Scenario: Validatie the login credentials data
Given User is on facebook page
When user enters username and password 
Then click login button
@Regression
Scenario Outline: Validate the login date
Given User is on faceBook page
When User enter userName "<userName>" and passWord "<passWord>"
And User click login button
Then user login message is display
Examples:
|userName|passWord|
|Test1|123|
|Test2|456|
|Test3|789|

