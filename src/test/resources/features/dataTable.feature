Feature: Testing data table

  Scenario: simple data table
    Given I have a list of values
      | value1 | value2 | value3 |
      | 1      | 2      | 3      |
      | 4      | 5      | 6      |

  Scenario: List scenario
    Given I have a list
      | 1 | 2 | 3 |
      | 4 | 5 | 6 |

  Scenario: List of list scenario
    Given I have a list of lists
      | 1 | 2 | 3 |
      | 4 | 5 | 6 |

  Scenario: Map scenario
    Given I have a map of value
      | field1 | 1 |
      | field2 | 2 |
      | field3 | 3 |
      | field4 | 4 |

  Scenario: List of Maps scenario
    Given I have a list of maps
      | field1 | field2 | field3 | field4 |
      | 11     | 12     | 13     | 14     |
      | 21     | 22     | 23     | 24     |
      | 31     | 32     | 33     | 34     |

  Scenario: List of Objects scenario
    Given I have a list of objects
      | field1 | field2 | field3 | field4 |
      | 11     | 12     | 13     | 14     |
      | 21     | 22     | 23     | 24     |
      | 31     | 32     | 33     | 34     |