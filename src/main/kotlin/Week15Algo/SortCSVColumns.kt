import kotlin.reflect.typeOf

/**
 * Task
In this challenge, your task is to sort the columns of a CSV file. The contents of the CSV will be provided to you as a string adhering to the description below.

The columns are separated by commas (,)
The rows are separated by a newline (\n)
The first line contains the names of the columns
A blank space counts as an empty string
Treat every value as a string
The CSV has a dyamic number of rows and columns
Write a method that sorts the columns by the names of the columns alphabetically, and case-insensitive.

Specification
Challenge.sortCsvColumns(csvData)
Takes comma separated values and sorts it alphabetically

Parameters
csvData: String - Unsorted CSV

Return Value
String - Sorted CSV

Example Input
Raw Input:

Beth,Charles,Danielle,Adam,Eric\n
17945,10091,10088,3907,10132\n
2,12,13,48,11

Example Output
Raw output:

Adam,Beth,Charles,Danielle,Eric\n
3907,17945,10091,10088,10132\n
48,2,12,13,11
 */

fun sortCsvColumns(csvData: String): String {
   val c =  csvData.replace("\n", "  ")
    val k = c.split(" ")
    println("c => $c")
    println(csvData)
    println(csvData.length)
    val firstArr= ArrayList<List<String>>()
    val arr = arrayListOf<String>()

    for (i in k.indices) {
        println("k[i] ${k[i]}")
        val q = k[i].split(" ")
        if (k[i].toIntOrNull() != null ) {
            val x = q.map { digit -> digit.toInt() }.toIntArray().sortedArray().toString()
            firstArr.add(listOf(x))
        }else {
            println("q is $q")
            val z = q.sorted()
            firstArr.add(z)

        }
        }

    println("k : $k")
    println("firstArr : $firstArr")
    k.joinToString("")


    return ""
}
