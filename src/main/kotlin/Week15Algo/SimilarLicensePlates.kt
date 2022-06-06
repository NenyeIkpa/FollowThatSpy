package Week15Algo

/**
 * Candidate Instructions
When relying on witnesses to remember a license plate, there are some characters that are often easily confused. We want to make sure that we don't allow two people to have a license plate that is visually similar. For example, BOX and B0X.

Your Challenge
Write a function that returns true if the two provided license plates strings are visually similar. For this test, we will only need to consider the 26 English uppercase characters A to Z and the digits 0 to 9.

We won't worry about length (though your inputs will never be longer than 10 characters), and we'll ignore spaces in the comparison, so "A A A" would be considered the same as "A AA"

These characters will be considered visually equivalent

0, O, and Q
1, I, and T
2 and Z
5 and S
8 and B
Examples
Input		               Output
"ABC"	    "DEF"	       false
"AAA"	    "A A A"	       true
"BOX"	    "B0X"	       true
"BIZ"	    "812"	       true
 */

fun similarLicensePlates(plate1: String, plate2: String): Boolean {
var plate1new = ""
var plate2new = ""
    for (i in plate1){
        if (i != ' '){
            plate1new += when (i) {
                '0', 'Q' -> "O"
                '1', 'T' -> "I"
                '2' -> "Z"
                '5' -> "S"
                '8' -> "B"
                else -> i.toString()
            }
        }
    }
    for (i in plate2){
        if (i != ' '){
            plate2new += when (i) {
                '0', 'Q' -> "O"
                '1', 'T' -> "I"
                '2' -> "Z"
                '5' -> "S"
                '8' -> "B"
                else -> i.toString()
            }
        }
    }

    return plate1new == plate2new
}

