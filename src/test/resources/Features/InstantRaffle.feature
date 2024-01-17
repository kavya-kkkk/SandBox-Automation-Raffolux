Feature: Instant_Raffle page UI and Functionality

  Scenario: Instant_Raffle UI and Functionality
    Given I am on the Instant_Raffle page
    Then I should see the Instant_Raffle image
    Then I should see the Instant_Raffle information section
    Then I should see the About the prize section
    Then I should see the how to play image
    Then I should see the Top prizes section
    Then I should see the All prizes section
    Then I should see the About the prize text
    Then I should see about the prize description text

  Scenario: Instant_Raffle information section UI and Functionality
    Given I am on the Instant_Raffle page
    Then I should see the title of the Instant_Raffle
    Then I should see the entry price text
    Then I should see the user icon
    Then I should see the text MAX per person along with count of tickets
    Then I should see the draw date icon
    Then I should see the text Draw date:16th June, 2am under the draw date icon
    Then I should see the ticket icon
    Then I should see the text 49999 total tickets
    Then I should see the progress bar
    Then I should see the percentage bubble along with the percentage text
    Then I should see the minimum no of tickets count under the progress bar
    Then I should see the maximum no of tickets count under the progress bar
    Then I should see the count of tickets left till now
    Then I should see the text see terms for free postal entry*
    Then I should see the select entries dropdown
    Then I should see the Add tickets to cart button
    Then I should see the trust pilot image
    When I click on the select entries dropdown
    Then I should see the dropdown menu list
    When I click on the one of the option from the dropdowm menu list
    Then I should see the number which i have selected from the dropdown menu list on the dropdown
    Then I should see the text Add tickets to cart along with the price of the tickets which i have selected from the dropdown
    When I click on the trust pilot image
    Then user should navigate to the respective trust pilot website page

  Scenario: Top prizes section UI and Functionality
    Given I am on the Instant_Raffle page
    Then I should see the winner cup symbol beside the top prizes text
    Then I should see the text Top prizes
    Then I should see the list of Top instant prize cards
    Then I should be able to count the list of Top prizes cards
    Then I should be able to see the total and available no of instant prizes in the Top prizes section

  Scenario: All prizes section UI and Functionality
    Given I am on the Instant_Raffle page
    Then I should see the text All prizes
    Then I should see the list of All instant prize cards
    Then I should be able to count the list of All prizes cards
    Then I should be able to see the total and available no of instant prizes in the All prizes section
    Then I should see the Search by item or ticket number… search field
    Then I should see the search icon inside the Search by item or ticket number… search field
    Then I should see the text Search by item or ticket number… inside the text field
    Then I should see Value low to high and high to low dropdown
    When I click on the respective dropdown
    Then user should be able to see the the list of options which are Value low to high and value high to low
    When I select value low to high option from the dropdown
    Then I should see the instant prize cards displaying in the increasing order
    When I select value high to low option from the dropdown
    Then I should see the instant prize cards displaying in the decreasing order

    