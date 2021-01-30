Feature: This test will show how to use optional text in cucumber expressions

  Scenario: Testing optional text
    Given I am older by 30 years
    Given I am older by 10 years
    Given I am older by 1 year
    When my birthday is in year 2000
    When my birthday is in 1987