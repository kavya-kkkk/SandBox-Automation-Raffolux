Feature: PointStore UI and Functionality
  
  As a user
  I want to visit the points_store page
  So that I can interact with the available features Scenario:

  Scenario: points_store Page Title
    Given I am on the points_store page
    Then I should see the title "Points Store"

  Scenario: Arrow symbol on points_store page
    Given I am on the points_store page
    Then I should see the Arrow symbol

  Scenario: Navigation By clicking the Arrow symbol
    Given I am on the points_store page
    When I click on the Arrow symbol
    Then user should redirect to the raffolux homepage

  @run
  Scenario: Store text on points_store Page
    Given I am on the points_store page
    Then I should see the text "Store"

  @run
  Scenario: Earned text on points_store Page
    Given I am on the points_store page
    Then I should see the text "Earned"

  @run
  Scenario: Navigation By clicking the Earned tab
    Given I am on the points_store page
    When I click on the Earned tab
    Then I should not see the text "LATEST OFFERS"
    Then I should see the text "you have Raffolux points" and the count of points available

  Scenario: Navigation By clicking the Store tab
    Given I am on the points_store page
    When I click on the Store tab
    Then I should see text "LATEST OFFERS"
    Then I should see text "you have Raffolux points" and count of points available

  Scenario: LATEST OFFERS text on points_store Page
    Given I am on the points_store page
    Then I should see the text "LATEST OFFERS"

  Scenario: ALL PRIZES text on points_store Page
    Given I am on the points_store page
    Then I should see the text "ALL PRIZES"

  Scenario: ALL PRIZES text on points_store Page
    Given I am on the points_store page
    Then I should see the text "ALL PRIZES"
