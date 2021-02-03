@group1
Feature: Testing step keywords

  Background:
    Given one thing

  @scenario1
  Scenario: correct usage 1
    And another thing
    And one more thing
    When I do action
    Then I get the result
    But I don't get something else

  @scenario2
  Scenario: correct usage 2
    And one more thing
    When I get the result

  @scenario3
  Scenario: correct usage 3
    And another thing
    Then I get the result
