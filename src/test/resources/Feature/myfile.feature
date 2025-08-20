Feature: Verify login

Scenario: verify login with valid data

Given browser is open
When user enters username and password
And press login button
Then user nevigated to the home screen
