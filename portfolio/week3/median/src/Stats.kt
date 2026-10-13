// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {
    require(data.isNotEmpty()) { "Data list cannot be empty" }
    val sorted = data.sorted()
    val size = sorted.size
    return if (size % 2 != 0) {
        sorted[size / 2]
    } else {
        (sorted[size / 2 - 1] + sorted[size / 2]) / 2.0f
    }
}