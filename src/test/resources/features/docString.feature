Feature: DocStrings
  Scenario: Simple DocString
    Given a large amount of text
    """
    This is a text
    more text

    event more...
    """
    And a large text with parameter 7
    """
    some text
    """