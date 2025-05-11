Feature: Homepage

  @navigate
  Scenario: Verify Homepage title is displayed
    Given User launches Chrome browser
    When User opens ilcarro  homepage
    Then User verify Homepage title is displayed
    And User quits browser