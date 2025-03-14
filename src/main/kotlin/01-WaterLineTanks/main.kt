package `01-WaterLineTanks`

/**
 * Move smaller one closer, because bigger wall would not have any effect on area.
 */


fun main() {
    val arr = intArrayOf(2, 8, 10, 1, 5)
    var maxArea = 0
    var l = 0
    var r = arr.size - 1
    while (l < r) {
        maxArea = maxOf(maxArea, minOf(arr[l], arr[r]) * (r - l))
        if (arr[l] < arr[r]) {
            l++
        } else {
            r--
        }
    }
    println(maxArea)
}