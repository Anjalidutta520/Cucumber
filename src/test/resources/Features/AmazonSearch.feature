#Author Anjali Dutta

Feature: feature to test Amazon search

  Scenario Outline: Check Amazon is able to search
    Given browser is open
    And user is on amazon search page
    When user enters <data> on search
    And user clicks on search button
    Then user is navigated to correct search options

    Examples:
    | data |
    | Tables |
    | Books  |
    | Chairs |
    | Clothes|
