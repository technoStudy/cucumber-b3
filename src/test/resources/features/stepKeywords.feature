Feature: Testing step keywords

  Scenario: Random position for keyword
    And some condition
    Given some condition
    And I get the result

    Scenario: correct usage
      Given one thing
      And another thing
      And one more thing
      When I do action
      Then I get the result
      But I don't get something else

  Scenario: correct usage with asterisk
      Given one thing
      * another thing
      * one more thing
      When I do action
      Then I get the result
      But I don't get something else

  Scenario: Everything asterisk
      * one thing
      * another thing
      * one more thing
      * I do action
      * I get the result
      * I don't get something else