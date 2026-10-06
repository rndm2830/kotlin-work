// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(input: String, redactWord: String, replaceWord: Char = 'X'): String {
    var replaced = replaceWord.toString().repeat(redactWord.length)
    return input.replace(redactWord, replaced)
}