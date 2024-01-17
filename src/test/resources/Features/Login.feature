Feature: feature to test login functionality

  Scenario Outline: Login with valid and invalid credentials
    Given user is on login page
    When the user enters their username "<username>" and password "<password>"
    And click on the login button
    Then user is navigated to the home page


    Examples: 
      | username                          | password    | 
      | Dharmaveera.Devaputra@rhibhus     | Dharma@81   |
      | Dharmaveera.Devaputra@rhibhus.com | Dharma@81   |
      | Dharmaveera.Devaputra@rhibhus     | Dharma@8103 |
      |                                   |             |
      | 123@gmail.com                     |             |
      |                                   | Dharma@81   |
      | Dharmaveera.Devaputra@rhibhus.com | Dharma@8103 |