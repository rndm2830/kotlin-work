// Task 12.4.1: main program
import kotlin.math.PI
fun main() {
    val circle = Circle(Point(0.0, 0.0), 5.0)

    // 2. 演示 area() 和 perimeter()
    println("面积: ${circle.area()}")
    println("周长: ${circle.perimeter()}")

    // 3. 演示 contains()，分别测试圆内、圆上、圆外三种情况
    val inside  = Point(1.0, 1.0)   // 距离 ≈ 1.414，在圆内
    val onEdge  = Point(3.0, 4.0)   // 距离 = 5，恰好在圆上
    val outside = Point(6.0, 0.0)   // 距离 = 6，在圆外

    println("(1,1) 在圆内: ${circle contains inside}")    // true
    println("(3,4) 在圆内: ${circle contains onEdge}")    // true（边界）
    println("(6,0) 在圆内: ${circle contains outside}")   // false

    // 4. 验证负半径会被阻止
    try {
        Circle(Point(0.0, 0.0), -1.0)
        println("不应该到达这里")
    } catch (e: IllegalArgumentException) {
        println("已阻止负半径: ${e.message}")
    }
}
