Feature: Google Search

  Scenario: Search for Cucumber in Google
    Given  I navigate to Google
    When I enter "Cucumber" in search box
    Then I see "Cucumber" results