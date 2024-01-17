Feature: feature to test SignUp functionality

  Scenario Outline: Sign_Up with valid and invalid credentials
    Given user is on Sign_Up page
    When user enters "<First_Name>", "<Last_Name>", "<Email_Address>", "<Phone_number>", "<Choose_password>", "<Confirm_password>"
    And selects country code from the dropdown
    And select a marketing preference check boxes which are yes or no
    And click on the Create account button
    Then user should be navigated to the home page

    Examples: 
      | First_Name | Last_Name | Email_Address          | Phone_number | Choose_password | Confirm_password |
      | Dharmaa    | veeraa    | virat18888@yopmail.com |   9632950769 | Welcome@123     | Welcome@123      |
