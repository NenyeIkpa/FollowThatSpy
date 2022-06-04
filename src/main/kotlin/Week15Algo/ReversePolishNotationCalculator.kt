package Week15Algo

/**
 * Candidate Instructions
Your job is to create a calculator which evaluates expressions in Reverse Polish notation.

For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.

Note that for simplicity you may assume that there are always spaces between numbers and operations, e.g. 1 3 + expression is valid, but 1 3+ isn't.

Empty expression should evaluate to 0.

Valid operations are +, -, *, /.

When the input string has been completely traversed, return the top of the evaluation stack. For example, for an input string "1 2 3.5", 3.5 remains on the top of the stack and is therefore the result of the expression.

You may assume that there won't be exceptional situations (like stack underflow or division by zero).

Specification
Challenge.calculate(expression)
Calculates an expression in Reverse Polish notation

Parameters
expression: String - The expression to be evaluated

Return Value
Float - The calculated value from the given expression

Examples
expression	             Return Value
"1 2 3.5"	                3.5
"10000 123 +"	            10123
"5 1 2 + 4 * + 3 -"    	    14
 */


fun calculate(expression: String): Double {

    return 0.0
}
