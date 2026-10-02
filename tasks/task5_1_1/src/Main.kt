// Task 5.1.1: main program
fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: please provide two words to compare")
        return
    }

    val first = args[0]
    val second = args[1]

    val result = anagrams(first, second)

    if (result) {
        println("\"$first\" and \"$second\" are anagrams")
    } else {
        println("\"$first\" and \"$second\" are NOT anagrams")
    }
}