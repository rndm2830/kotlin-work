// Task 15.3: Student class, demonstrating method overriding
// 文件名: Student.kt
class Student(val degree: String) : Person() {
    override fun speak() {
        println("I am a Student, studying $degree")
    }
}