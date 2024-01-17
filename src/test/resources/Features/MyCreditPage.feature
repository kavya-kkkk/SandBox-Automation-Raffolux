Feature: MyCredit page UI and Functionality

  Scenario: MyCredit page UI and Functionality
    Given I am on the MyCredit page
    Then I should see the text 
    Then I should see the list of winners cards displaying
    Then I should be able to count the no of winners cards displayed
    Then I should see the text You’ve reached the end of our winner’s gallery, why not check out our latest raffles?
    Then I should see the Live raffles button
    When I click on the Live raffles button
    Then the user should navigate to the home page
