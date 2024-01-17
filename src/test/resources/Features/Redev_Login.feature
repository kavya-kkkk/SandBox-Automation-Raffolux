Feature: feature to test redev_login functionality

  Scenario Outline: Login with valid and invalid credentials
    Given user is on login page
    When user enters "<username>" and "<password>"
    And click on the login button
    Then user is navigated to the home page

    Examples: 
      | username                          | password    |
      | Dharmaveera.Devaputra@rhibhus.com | Dharma@8103 |
      | Dharmaveera.Devaputra@rhibhus     | Dharma@81   |
      | Dharmaveera.Devaputra@rhibhus.com | Dharma@81   |
      | Dharmaveera.Devaputra@rhibhus     | Dharma@8103 |
      |                                   |             |
      | 123@gmail.com                     |             |
      |                                   | Dharma@81   |
