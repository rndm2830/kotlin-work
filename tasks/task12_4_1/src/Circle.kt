// Task 12.4.1: Circle class
class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) { "Radius should be positive" }
    }
}
