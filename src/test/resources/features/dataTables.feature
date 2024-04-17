Feature: Data Tables Feature

  Scenario: Data Tables Test
    When I search for String on google
      | amazon | google | ebay |
    Then I should see String on the results
    |amazon|
    Then I close the browser
    Then I fail the test