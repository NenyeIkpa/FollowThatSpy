fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val csvData = "Beth,Charles,Danielle,Adam,Eric\n" +
            "17945,10091,10088,3907,10132\n" +
            "2,12,13,48,11"
 sortCsvColumns(csvData)
}