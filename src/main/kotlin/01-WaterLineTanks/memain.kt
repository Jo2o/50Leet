package org.jo2o.fiftyleet.`01-WaterLineTanks`

fun main() {
    val input = intArrayOf(2, 8, 10, 1, 5)
    val valIdx = createValIdxMap(input)

    for (i in input.indices) {
        val n1 = input[i]
        val area = getAreaWithSameOrHigherAndFurthest(valIdx, n1)
        println("idx: $i, val: ${input[i]} - $area")
    }
}

private fun getAreaWithSameOrHigherAndFurthest(valIdx: Map<Int, Int>, n1: Int): Int {
    var maxDist = 0
    var n2 = 0
    for (k in valIdx.keys) {
        if (k <= n1) {
            continue
        }
        val dist = valIdx[k]!! - valIdx[n1]!!
        if (dist > maxDist) {
            maxDist = dist
            n2 = k
        }
    }
    return if (n2 == 0) 0 else n1 * maxDist
}

private fun createValIdxMap(arr: IntArray): Map<Int, Int> =
    arr.withIndex()
        .associate { it.value to it.index }
        .toSortedMap()