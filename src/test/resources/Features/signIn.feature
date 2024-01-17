Feature: Test Signin Functionality

Scenarios: Check login is successful with valid credentials
Given browser is open
And user is on login page
When user enters username and password
And user clicks on signin button
Then user is navigated to the home page

