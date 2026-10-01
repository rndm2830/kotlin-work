// Task 3.5: simple file I/O

import kotlin.io.path.*

fun main() {
    val filePath = Path("test.txt")

    // 1. 第一次写入文件（写入第一段文字）
    filePath.writeText("First line of text.\n")

    // 2. 使用 writeText() 再次写入（验证覆盖写入效果）
    filePath.writeText("Second line replacing the first.\n")

    // 3. 使用 appendText() 追加文字（验证追加效果）
    filePath.appendText("Third line appended to the file.\n")

    // 4. 读取 test.txt 的内容并打印到控制台
    val fileContents = filePath.readText()
    println("--- File Contents ---")
    println(fileContents)
}
