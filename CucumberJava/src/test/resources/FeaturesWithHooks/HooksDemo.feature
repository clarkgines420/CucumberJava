Feature: Check login functionality

@smoke
Scenario:
Given user is on login page
When user enters valid username and password
And clicks on login button
Then user is navigated to the home pages

Scenario:
Given user is on login page
When user enters valid username and password
And clicks on login button
Then user is navigated to the home pages