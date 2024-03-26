Feature: Data Tables Feature

  Scenario: Data Tables Test
    When I search for String on google
    |amazon|
    Then I should see String on the results
    |amazon|
    Then I close the browser