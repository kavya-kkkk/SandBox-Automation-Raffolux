Feature: Account_page UI and Functionality

  Scenario: Account_page UI
    Given i am on the Account_page
    Then i should see the text "Personal Information"
    Then i should see the text "User details"
    Then i should see the text "Verification Status"
    Then i should see the text "Verified"
    Then i should see the user profile section
    Then i should see the user details section
    Then i should see the verification status section

  Scenario: User profile section UI
    Given i am on the Account_page
    Then i should see the user profile image
    Then i should see the name of the user
    Then i should see the raffolux logo along with the count of points
    Then i should see the account credit points
    Then i should see the text "personal information" along with the user icon
    Then i should see the personal information section tab selected by default
    Then i should see the text "Payout details" along with the notebook icon
    Then i should see the text "Marketing preferences" along with respective icon
    Then i should see the text "Change password" along with key icon
    Then i should see the text "Logout" along with respective icon

  Scenario: User details section UI
    Given i am on the Account_page
    Then i should see the firstname lable text
    Then i should see the lastname lable text
    Then i should see the Email Address lable text
    Then i should see the Phone number lable text
    Then i should see the firstname text field
    Then i should see the lastname text field
    Then i should see the Email Address text field
    Then i should see the Phone number text field
    Then i should see the country code dropdown
    Then i should see the flag and country code on the respective dropdown
    Then i should see the save changes button

  Scenario: Verification status section UI
    Then i should see the text "Verify your number to redeem your BONUS!"
    Then i should see the respective displayed raffle image
    Then i should see the text "Verify your phone number now to unlock your FREE BONUS!"

  Scenario: User profile section payout details tab UI and Functionality
    Given i am on the Account_page
    When i click on the payout details tab
    Then i should see the text "payout details"
    Then i should see the text "prize delivery address"
    Then i should see the add a new address upload section
    Then i should see the plus icon on the add a new address upload section
    Then i should see the text "add a new address" on the add a new address upload section
    When i click on the add a new address upload section
    Then i should see the add a new address pop-up window
    Then i should see the text "payout method"
    Then i should see the add new payment method upload section
    When i click on the add new payment method upload section
    Then i should see the add new payment method pop-up window

  Scenario: Add new address pop-up UI and Functionality
    Given i am on the Account_page
    When i click on the payout details tab
    When i click on the add a new address upload section
    Then i should see the Full name lable text and respective text field
    Then i should see the postcode lable text and respective text field
    Then i should see the Address Line1 lable text and respective text field
    Then i should see the Address Line2 lable text and respective text field
    Then i should see the Town/City lable text and respective text field
    Then i should see the phone number lable text and respective text field
    Then i should see the popup remove symbol
    When i click on the popup remove symbol
    Then i should see the text "payout details"
    When i enter the valid input to the full name text field
    Then i should be able to see the entered text inside the text field
    When i enter the valid input to the postcode text field
    Then i should be able to see the entered text inside the text field
    When i enter the valid input to the Address Line1 text field
    Then i should be able to see the entered text inside the text field
    When i enter the valid input to the Address Line2 text field
    Then i should be able to see the entered text inside the text field
    When i enter the valid input to the Town/City text field
    Then i should be able to see the entered text inside the text field
    When i enter the valid input to the phone number text field
    Then i should be able to see the entered text inside the text field
    When i click on the save details button after entering input to all the text fields

  Scenario: Add new payment method UI and Functionality
    Given i am on the Account_page
    When i click on the payout details tab
    When i click on the add new payment method upload section
    Then i should see the text "add new payment method"
    Then i should see the bank transfer section
    Then i should see the paypal method
    Then i should see the pop up remove symbol
    When i click on the bank transfer section
    Then i should see the add new bank details pop up window
    
    Scenario: Add new payment method UI and Functionality
    
    
    
