Feature: Calculator

    Scenario Outline: Adding two numbers
        Given I entered <num1> as first number
        And I entered <num2> as second number
        When I press add
        Then the result should be <result>
        Examples:
            | num1 | num2 | result |
            | 3    |  20  |    23  |
            | 5    |  4   |    9   |


        Scenario Outline: Multiplying two numbers
                Given I entered <num1> as first number
                And I entered <num2> as second number
                When I press multiply
                Then the result should be <result>
                Examples:
                    | num1 | num2 | result |
                    | 3    |  20  |    60  |
                    | 5    |  2   |    10  |
                    | 3    |  20  |    60  |
                    | 5    |  2   |    10  |