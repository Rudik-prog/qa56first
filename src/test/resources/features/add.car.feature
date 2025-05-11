Feature: Add new car

  Scenario: User logs in and adds a new car
    Given User is on the login page
    When User enters valid email "testuser@google.com" and password "Test12345$"
    And User clicks on the Login button
    Then User should be redirected to the home page
    When User navigates to "Let the car work" page
    And User fills in the car form with valid data
      | country       |  Israel          |
      | address       | Haifa            |
      | distance      | 50000            |
      | serial number | IL12345678       |
      | brand         | BMW              |
      | model         | X5               |
      | year          | 2020             |
      | engine        | 2.0              |
      | fuel          | Diesel           |
      | seats         | 5                |
      | class         | C                |
      | price         | 100              |


    And User clicks on the Submit button
    Then Success message should be displayed "Car added"