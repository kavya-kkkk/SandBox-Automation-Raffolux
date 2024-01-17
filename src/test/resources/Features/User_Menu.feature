Feature: User_Menu section UI and Functionality

  Scenario: User Menu section UI and Functionality
    Given i am on the User Menu section
    Then i should see the User Menu section remove symbol
    Then i should see the text "Hi," name of the user
    Then i should see the text you have tickets in "count of raffles" active raffles
    Then i should see the text "My points"
    Then i should see the text "you have points" along with the raffolux logo and count of points
    Then i should see the text "Use your Raffolux points to redeem prizes in the Store"
    When i click on the link "Store" from the "Use your Raffolux points to redeem prizes in the Store"
    Then i should navigate to the points store page

  Scenario: Menu section UI and Functionality
    Then i should see the text "Menu"
    Then i should see the My raffles side bar link
    Then i should see the ticket icon on the My raffles side bar link
    Then i should see the notification count on the my raffles side bar link
    Then i should see the My Credit side bar link
    Then i should see the My Credit icon on the My Credit side bar link
    Then i should see the Credit amount
    Then i should see the Store side bar link
    Then i should see the New text on the Store side bar link
    Then i should see the bag icon on the Store side bar link
    Then i should see the Winners side bar link
    Then i should see the winner cup icon the Winners side bar link
    Then i should see the Refer_a_Friend side bar link
    Then i should see the Gift icon on the Refer_a_Friend side bar link
    Then i should see the Promotions side bar link
    Then i should see the Promotions icon on the Promotions side bar link
    Then i should see the Charity side bar link
    Then i should see the Charity icon on the Promotions side bar link
    Then i should see the Logout side bar link
    Then i should see the Logout icon on the Logout side bar link

  Scenario: Menu section Functionality
    When i click on the My raffles side bar link
    Then i should navigate to the my raffles page
    When i click on the My Credit side bar link
    Then i should navigate to the My Credit page
    When i click on the Store side bar link
    Then i should navigate to the Store page
    When i click on the Winners side bar link
    Then i should navigate to the Winners page
    When i click on the Refer a Friend side bar link
    Then i should navigate to the Refer a Friend page
    When i click on the Promotions side bar link
    Then i should navigate to the Promotions page
    When i click on the Charity side bar link
    Then i should navigate to the Charity page
    When i click on the Logout side bar link
    Then i should navigate to the index page

  Scenario: Account Settings section UI and Functionality
    Then i should see the text Account Settings
    Then i should see the Personal info side bar link
    Then i should see the user icon on the Personal info side bar link
    Then i should see the Light/Dark side bar link
    Then i should see the half moon icon on the Light/Dark side bar link
    Then i should see the Light/Dark toggle theme on the Light/Dark side bar link
    Then i should see the half moon icon on the Light/Dark toggle
    Then i should see the sun icon on the Light/Dark toggle

  Scenario: Account Settings section Functionality
    When i click on the personal info side bar link
    Then i should navigate to the account Settings page
    When i click on the Light/Dark side bar link
    Then i should see the changes on the respective web page

  Scenario: Site information section UI and Functionality
    Then i should see the text Site information
    Then i should see the Help & FAQs side bar link
    Then i should see the Help & FAQs icon on the Help & FAQs side bar link

  Scenario: Site information section Functionality
    When i click on the Help & FAQs side bar link
    Then i should navigate to the Help page
    Then i should see the Terms link
    Then i should see the Privacy link
    Then i should see the Help link
    Then i should see the Responsible Play link
    Then i should see the Facebook icon
    Then i should see the Twitter icon
    Then i should see the Terms link
    Then i should see the Terms link
