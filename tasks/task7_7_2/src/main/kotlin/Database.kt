// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    // and insert them as keys and values into the map
    // 确保读取前清空现有数据
    this.clear()
    val path = Path(filename)

    // 如果文件存在，逐行读取 CSV 内容
    if (path.exists()) {
        path.forEachLine { line ->
            if (line.isNotBlank()) {
                val parts = line.split(",")
                if (parts.size >= 2) {
                    val name = parts[0].trim()
                    val number = parts[1].trim()
                    this[name] = number
                }
            }
        }
    }
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
}
