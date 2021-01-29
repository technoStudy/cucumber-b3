Feature: Google Search

  Scenario: Search for Cucumber in Google
    Given I navigate to Google
    When I enter "Cucumber" in search box
    Then I see "cucumber" results

  Scenario: Search for Gherkin in Google
    Given I navigate to Google
    When I enter "Gherkin" in search box
    Then I see "gherkin" results