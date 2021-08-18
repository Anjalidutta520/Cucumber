#Author Anjali Dutta

Feature: feature to test Google search

  Scenario Outline: Check google is able to search
    Given browser is open
    And user is on google search page
    When user enters <data> on search
    And user clicks on google search
    Then user is navigated to correct search options

    Examples:
    | data |
    | Automation Step By Step |
    | Cucumber Java           |
    | Selenium Java           |
    | JUnit Java              |
