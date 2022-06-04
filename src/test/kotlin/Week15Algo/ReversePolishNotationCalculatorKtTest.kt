package Week15Algo

import org.junit.Test

import org.junit.Assert.*

class ReversePolishNotationCalculatorKtTest {

        @Test
        fun shouldWorkForAnEmptyString() {
            assertEquals(0.0, calculate(""), 1e-7)
        }

        @Test
        fun shouldParseNumbers() {
            assertEquals(3.0, calculate("1 2 3"), 1e-7)
        }

        @Test
        fun shouldParseFloats() {
            assertEquals(3.5, calculate("1 2 3.5"), 1e-7)
        }

        @Test
        fun shouldSupportAddition() {
            assertEquals(4.0, calculate("1 3 +"), 1e-7)
        }

        @Test
        fun shouldSupportMultiplication() {
            assertEquals(3.0, calculate("1 3 *"), 1e-7)
        }

        @Test
        fun shouldSupportSubtraction() {
            assertEquals(-2.0, calculate("1 3 -"), 1e-7)
        }

        @Test
        fun shouldSupportDivision() {
            assertEquals(2.0, calculate("4 2 /"), 1e-7)
        }

        @Test
        fun shouldWorkWithNumbersLongerThan1Digit() {
            assertEquals(10123.0, calculate("10000 123 +"), 1e-7)
        }

        @Test
        fun shouldWorkWithComplexExpressions() {
            assertEquals(14.0, calculate("5 1 2 + 4 * + 3 -"), 1e-7)
        }

}