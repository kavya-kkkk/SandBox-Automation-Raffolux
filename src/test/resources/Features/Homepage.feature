Feature: Home page UI and Functionality

  Scenario: 1.Home page UI and Functionality
    Given I am on the home page
    Then I should see the raffolux logo
    Then I should see the login button
    Then I should see the Sign up button
    Then I should see the horizontal banner section
    Then I should see the Sign up bonus card
    Then I should see the Horizontal raffle corosel
    Then I should see the Winners information section
    Then I should see the supported payment options section
    Then I should see the Flash cash section
    Then I should see the Live Cometitions section

  Scenario: 2.Signup bonus card UI and Functionality
    Given I am on the home page
    Then I should see the signup bonus text
    Then I should see the join the uks fastest growing raffle site text
    Then I should see the Claim your VIP sign up bonus when you create an account today text
    Then I should see the Free 20 pounds Cashback text
    Then I should see the Double points text
    Then I should see the sign up button on Signup bonus card
    When I click on the sign up button
    Then user should navigate to the sign up page

  Scenario: 3.horizontal banner section UI and Functionality
    Given I am on the home page
    Then I should see the payment accepted text along with the acceptable cards
    Then I should see the Never played before? Check out our latest text along with the signup offers button
    Then I should see the trust_pilot image

  Scenario: 4.Horizontal raffle corosel UI and Functionality
    Given I am on the home page
    Then I should see the Horizontal raffle corosel
    Then I should see the Mega Jockpot text along with the crown symbol
    Then I should see the title of respective raffle
    Then I should see the entry price of the respective raffle
    Then I should see the ticket sold progress bar
    Then I should see the x no of tickets sold text
    Then I should see the play now button
    When I hover over the raffle on the carosel
    Then I should see the arrow symbols at both left and right side on the raffle
    When I click on the left arrow symbol
    Then I should see the remaining prev raffles
    When I click on the right arrow symbol
    Then I should see the remaining next raffles

  Scenario: 5.Winner information section UI and Functionality
    Given I am on the home page
    Then I should see the winner information section
    Then I should see the won in prizes so far text along with the count of the amount that has been won till now by the users
    Then I should see the over 8000 winners and counting text
    Then I should see the winner cup symbol beside the over 8000 winners and counting text
    Then I should see the Guaranteed winners everyday text
    Then I should see the gift box symbol beside the Guaranteed winners everyday text
    Then I should see the over 500k donated to UK charities text
    Then I should see the charity symbol beside the over 500k donated to UK charities text
    Then I should see the instant prize claims & fast payouts text
    Then I should see the instant prize claims & fast payouts symbol
 
  Scenario: 6.supported payment options section UI and Functionality
    Given I am on the home page
    Then I should see the supported payment card options section
    Then I should see the supported payment options text
    Then I should see the different available card options
    Then I should see the Sign_Up button on supported payment options section
    When I click on the Sign_Up button on supported payment options section
    Then I should navigate to the Sign_Up page on supported payment options section

  Scenario: 7.Live Cometitions section UI and Functionality
    Given I am on the home page
    Then I should see the Live Cometitions text
    Then I should see the count of active raffles box section along with the dot and count of active raffles
    Then I should see the count of ended raffles box section along with the dot and count of ended raffles
    Then I should see the one of the raffle from the list of raffles
    Then I should see the category tablist section
    Then I should see the All category text
    Then I should see the Cash category text
    Then I should see the Electronic category text
    Then I should see the Holiday category text
    Then I should see the Others category text
    When I click on the All category tab
    Then I should see the
    When I click on the All category tab
    Then I should see the
    When I click on the All category tab
    Then I should see the
    When I click on the All category tab
    Then I should see the
    When I click on the All category tab
    Then I should see the
