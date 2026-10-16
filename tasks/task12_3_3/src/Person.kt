// Task 12.3.2: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    // 次构造函数：通过字符串提供出生日期，并使用 LocalDate.parse 解析后委托给主构造函数
    constructor(name: String, birthStr: String) : this(name, LocalDate.parse(birthStr))

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}