// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println("初始列表: $numbers")

    // 1. add(): 在末尾添加元素 10
    numbers.add(10)
    println("add(10) 后: $numbers")

    // 在指定索引 0 位置插入元素 99
    numbers.add(0, 99)
    println("add(0, 99) 后: $numbers")

    // 2. addAll(): 添加另一个集合中的所有元素
    numbers.addAll(listOf(100, 200))
    println("addAll([100, 200]) 后: $numbers")

    // 3. remove(): 删除首次出现的指定值（比如删除第一个 99）
    numbers.remove(99)
    println("remove(99) 后: $numbers")

    // 4. removeAll(): 删除匹配到的所有指定元素
    numbers.removeAll(listOf(3, 6))
    println("removeAll([3, 6]) 后: $numbers")

    // 5. removeAt(): 删除指定索引位置的元素（比如删除索引 0 位置的元素）
    numbers.removeAt(0)
    println("removeAt(0) 后: $numbers")

    // 6. clear(): 清空列表
    numbers.clear()
    println("clear() 后: $numbers")
}