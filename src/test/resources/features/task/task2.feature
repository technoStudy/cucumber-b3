Feature: Task2 solution

  Scenario Outline:
    Given first number = <number1>
    And second number = <number2>
    Then result should be = <result>

    Examples:
      | number1 | number2 | result |
      | 1       | 4       | 4      |
      | 2       | 10      | 20     |
      | 5       | 4       | 20     |
      | 3       | 4       | 12     |

#  Scenario: first
#    Given first number = 1
#    And second number = 4
#    Then result should be = 4
#
#  Scenario: second
#    Given first number = 2
#    And second number = 10
#    Then result should be = 20
#
#  Scenario: third
#    Given first number = 5
#    And second number = 4
#    Then result should be = 20
#
#  Scenario: forth
#    Given first number = 3
#    And second number = 4
#    Then result should be = 12