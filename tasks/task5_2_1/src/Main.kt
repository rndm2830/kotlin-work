// Task 5.2.1: main program
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: please provide the radius of the circle")
        return
    }

    val radius = args[0].toDoubleOrNull()

    if (radius == null) {
        println("Error: \"${args[0]}\" is not a valid number")
        return
    }

    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Area:      %.4f".format(area))
    println("Perimeter: %.4f".format(perimeter))
}