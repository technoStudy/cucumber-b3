Feature: Testing data table

  Scenario: simple data table
    Given I have a list of values
      | value1 | value2 | value3 |
      | 1      | 2      | 3      |
      | 4      | 5      | 6      |

  Scenario: List of list scenario
    Given I have a list of lists
      | 1      | 2      | 3      |
      | 4      | 5      | 6      |