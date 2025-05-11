Feature: Homepage

  @validate
  Scenario: Login with correct data
    Given User launches Chrome browser
    When User opens ilcarro  homepage
    And User clicks on Login link
    And  User enters correct data
    And User click on Yalla button
    Then User verifies Success message is displayed
    And User quits browser


  @wrongPassword
  Scenario Outline: Login with correct email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro  homepage
    And User clicks on Login link
    And  User enters correct email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User click on Yalla button
    Then User verifies Error is displayed
    And User quits browser
    Examples:
      | email                      | password   |
      | rudolfwagner1995@gmail.com | RUDI.!"§$! |
      | rudolfwagner1995@gmail.com | rudi.1250! |
      | rudolfwagner1995@gmail.com | rudi.12501 |
      | rudolfwagner1995@gmail.com | Кгвшб1250! |
