#Author Anjali Dutta

@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario Outline: Check login is unsuccessful with invalid credentials

    Given user is on login page for new scenario
    When user enters <username> and <password>
    And clicks on login button for new scenario
    Then user is not navigated to home page

    Examples:
      | username | password  |
      | user1    | password1 |
      | user2    | password2 |