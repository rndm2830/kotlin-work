// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: Please provide start, max, and increment temperatures as numbers.")
        return
    }

    val startTemp = args[0].toDoubleOrNull()
    val maxTemp = args[1].toDoubleOrNull()
    val increment = args[2].toDoubleOrNull()

    if (startTemp == null || maxTemp == null || increment == null || increment <= 0) {
        println("Error: Invalid numerical inputs or non-positive increment.")
        return
    }
    println("%10s %10s".format("Celsius", "Fahrenheit"))
    println("-".repeat(22))

    var celsius = startTemp
    while (celsius <= maxTemp) {
        val fahrenheit = celsius * 9 / 5 + 32
        println("%10.1f %10.1f".format(celsius, fahrenheit))
        celsius += increment
    }
}
