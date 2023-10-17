Feature: Validation of Facebook details
Scenario: Validatie the login credentials data
Given User is on facebook page
When user enters username and passwords
|Amit|Amith@123|bala3@gmail.com|
|bala|bala@123|bala@gmail.com|
Then click login button