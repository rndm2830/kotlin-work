// Task 12.1: program that uses a Point object
fun main() {
    // 创建 Point 对象时，直接通过主构造函数传入坐标 (3.0, 4.0)
    val p = Point(3.0, 4.0)

    // 打印 x 和 y 属性
    println("x = ${p.x}")
    println("y = ${p.y}")

    // 测试计算到原点的距离
    println("Distance from origin: ${p.distance()}")
}