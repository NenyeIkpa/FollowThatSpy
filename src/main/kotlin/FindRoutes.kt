


/**
 * Task
We are tracking down our rogue agent and she travels from place to place to avoid being tracked. Each of her travels are based on a list of itineraries in an unusual or incorrect order. The task is to determine the complete route she will take.

You are given an array of routes containing her travel itineraries. Convert this into a complete, in-order list of the places she will travel.

Specification
Challenge.findRoutes(routes)
Parameters
routes: Array<Array<String>> - Array of itineraries

Return Value
String - An ordered list or destinations

Constraints
All inputs have at least one valid, complete route

Examples
routes	Return Value
[["USA","BRA"],["JPN","PHL"],["BRA","UAE"],["UAE","JPN"]]	"USA, BRA, UAE, JPN, PHL"
Interface Help
Run against Sample Tests: Click Run Tests above or press ⌘ + '
Running against Final Tests: Click Submit Solution above or press ⌘ + Enter
Challenge Purpose & Goals
This challenge is fairly simple on the surface, but requires a bit of thinking to get to a quality solution.

While brute-force methods work, there are elegant solutions to this challenge that reduce the number of steps needed to calculate the entire route.

Difficulty Estimates
Intermediate Difficulty, 45 Minutes Estimated Time

 */

fun findRoutes(routes: ArrayList<ArrayList<String>>): String {
    val temp= mutableListOf<String>()
    var result = ""
    for(arr in routes){
        for(item in arr){
            temp.add(item)
        }
    }
    for (i in temp.indices){
        val lastIndexOfItem = temp.lastIndexOf(temp[i])
        if (i == lastIndexOfItem)
            result+= if (result == "") "${temp[i]}" else ", ${temp[i]}"
    }
    return result
}


