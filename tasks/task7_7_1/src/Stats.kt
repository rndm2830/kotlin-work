// Task 7.7.1: statistics functions
fun computeMedian(data: List<Float>): Float {
    require(data.isNotEmpty()) { "Data list cannot be empty" }
    val sorted = data.sorted()
    val size = sorted.size
    return if (size % 2 != 0) {
        sorted[size / 2]
    } else {
        (sorted[size / 2 - 1] + sorted[size / 2]) / 2.0f
    }
}

fun displayStats(data: List<Float>) {
    if (data.isEmpty()) {
        println("No data available.")
        return
    }

    val min = data.minOrNull()
    val max = data.maxOrNull()
    val mean = data.average()
    val median = computeMedian(data)

    println("Minimum : $min")
    println("Maximum : $max")
    println("Mean    : $mean")
    println("Median  : $median")
}