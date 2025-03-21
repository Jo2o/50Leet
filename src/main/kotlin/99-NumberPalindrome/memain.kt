package `99-NumberPalindrome`

fun main() {
    println(isPalindrome(202))
}

private fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    if (x == 0) return true
    val str = x.toString()
    val strLen = str.length
    for (i in 0 until strLen/2) {
        if (str[i] != str[strLen - i - 1]) return false
    }
    return true
}