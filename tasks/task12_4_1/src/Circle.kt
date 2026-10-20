// Task 12.4.1: Circle class
import kotlin.math.PI
class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) { "Radius should be positive" }
    }
    fun area(): Double = PI * radius * radius

    fun perimeter(): Double = 2 * PI * radius

    infix fun contains(point: Point): Boolean =
        centre.distanceTo(point) <= radius
}
