Feature: PointStore UI and Functionality
  
  As a user
  I want to visit the points_store page
  So that I can interact with the available features Scenario:

  Scenario: Points store page UI and Functionality
    Given I am on the points store page
    Then I should see the points store title
    And I should see the arrow symbol
    And I should see the store tab
    And I should see the earned tab
    And I should see the Latest Offers text
    And I should see the All Prizes text
    And I should see the list of prizes under Latest Offers section
    And I should see the list of prizes under All Prizes section
    And I should see the text you have raffolux points along with raffolux logo and count of points
