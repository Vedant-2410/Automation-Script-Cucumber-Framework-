Feature: Googlesearch functionality

  Scenario: Verify search functionality for google
    Given given browser is open
    When user enters keyword
    And click search button
    Then user navigate to search result
