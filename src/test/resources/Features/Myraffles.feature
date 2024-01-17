Feature: My_raffles page UI and Functionality

  Scenario: my_raffles UI and Functionality
    Given I am on the my_raffles page
    Then I should see the my_raffles title
    Then I should see the arrow symbol
    Then I should see the text "MY RAFFLES"
    When I click on the arrow symbol
    Then I should be on the home page after login
    Then I should see the active tab
    Then I should see the ended tab
    When I click on the ended tab
    Then I should see the line under the ended tab
    Then I should see the text You havent entered any raffles yet.
    Then I should see the text click here to see whats on link under the ended tab.
    When I click on the click here to see whats on link under the ended tab.
    Then I should be on the home page after login
    When I click on the active tab
    Then I should see the line under the active tab
    Then I should see the text You are not currently entered into any active raffles.
    Then I should see the text click here to see whats on link under the active tab.
    When I click on the click here to see whats on link under the active tab.
    Then I should be on the home page after__login
