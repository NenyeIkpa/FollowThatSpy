/**
 * Your task is to create a function that will take an integer and return the result of the look-and-say function on that integer. This should be a general function that takes as input any positive integer, and returns an integer; inputs are not limited to the sequence which starts with "1".

Conway's Look-and-say sequence goes like this:

Start with a number.
Look at the number, and group consecutive digits together.
For each digit group, say the number of digits, then the digit itself.
Sample inputs and outputs:

1 is read as "one 1" => 11
11 is read as "two 1s" => 21
21 is read as "one 2, then one 1" => 1211
9000 is read as "one 9, then 3 0s" => 1930
222222222222 is read as "twelve 2s" => 122
 */


fun lookSay(number: Int): Int {
    if(number.toString().length == 1) return "1$number".toInt()
    val stringNum = number.toString().toCharArray()
    var result = ""
    var value = stringNum[0]
    var countOccurrence = 1
    for(digit in 1 until stringNum.size){
        if(stringNum[digit-1] == stringNum[digit]){
            countOccurrence++
            if (digit == stringNum.size-1){
                result += "$countOccurrence$value"
            }
        }else {
            result += "$countOccurrence$value"
            countOccurrence = 1
            if (digit == stringNum.size-1){
                result += "$countOccurrence${stringNum[stringNum.lastIndex]}"
            }
        }
        value = stringNum[digit]
    }
    return result.toInt()
}