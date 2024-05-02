Feature: StringCheck

  Scenario Outline: Check if String is Palindrome
    Given I entered sentence <sentenceToTest>
    When I check if is a Palindrome
    Then the output should be <output>
    Examples:
      | sentenceToTest | output  |
      | "refer"    | "true"  |
      | "coin"     | "false" |
      | "space"    | "false" |
      | "racecar"  | "true"  |
      | "was it a car or a cat i saw" | "true" |
