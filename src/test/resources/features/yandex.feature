Feature: Yandex Search

  Scenario: Search for Cucumber in Google
    Given I navigate to Google
    Then I see "Cucumber" results

  Scenario: Search for Gherkin in Google
    Given I navigate to Google
    Then I see "Gherkin" results