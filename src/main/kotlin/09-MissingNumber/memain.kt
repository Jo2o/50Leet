package `09-MissingNumber`

fun main() {
    val input = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20)
    println("Missing number is: ${findMissingNumber(input)}")
}

private fun findMissingNumber(input: IntArray): Int {
    val inputSize = input.size
    val sumWithoutMissingNumber = inputSize * (inputSize + 1) / 2   // Gauss formula: 2s = (n+1) + (n+1) + ... + (n+1)
    val sumWithMissingNumber = input.sum()
    return sumWithoutMissingNumber - sumWithMissingNumber
}