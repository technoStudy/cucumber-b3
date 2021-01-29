Feature: Google Search

  Scenario: Search for Cucumber in Google
    Given I launch web browser,
    Given I navigate to Google
    When I enter "Cucumber" in search box
    Then I see "Cucumber" results

  Scenario: Search for Gherkin in Google
    Given I navigate to Google
    When I enter "Gherkin" in search box
    Then I see "Gherkin" results