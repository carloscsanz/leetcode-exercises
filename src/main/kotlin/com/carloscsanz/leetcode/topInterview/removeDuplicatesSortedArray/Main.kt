package com.carloscsanz.leetcode.topInterview.removeDuplicatesSortedArray

fun main() {
    val example1 = intArrayOf(1,1,2)
    val result1 = Solution.removeDuplicates(example1)
    println("EXAMPLE 1 - $result1, nums = ${example1.toList()}")

    val example2 = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val result2 = Solution.removeDuplicates(example2)
    println("EXAMPLE 2 - $result2, nums = ${example2.toList()}")
}
