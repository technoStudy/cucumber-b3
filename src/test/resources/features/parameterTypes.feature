Feature: This test will show how to use parameter types in cucumber expressions

  Scenario: Testing parameter types
    Given my age is 30 years old
    Given my age is 10 years old
    Given my age is 1 years old
    When I divide my age by 2.5
    Then I get a random banana split
    Then I get a random apple split
    Then I get a random cucumber split
    Then I also get 'many sweets' and "some vegetables"
    Then I also get "some sweets" and 'much more vegetables'