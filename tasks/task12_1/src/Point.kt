// Task 12.1: Point class
import kotlin.math.hypot

// 使用紧凑的主构造函数，直接在参数里声明 var 属性
class Point(var x: Double, var y: Double) {

    // 计算当前点到原点 (0, 0) 的距离
    fun distance() = hypot(x, y)

}