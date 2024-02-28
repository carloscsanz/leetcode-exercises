package com.carloscsanz.leetcode.topInterview.removeElement

fun main() {
    val example1 = intArrayOf(3, 2, 2, 3)
    val result1 = Solution.removeElement(example1, 3)
    println("EXAMPLE 1 - $result1, nums = ${example1.toList()}")

    val example2 = intArrayOf(0,1,2,2,3,0,4,2)
    val result2 = Solution.removeElement(example2, 2)
    println("EXAMPLE 2 - $result2, nums = ${example2.toList()}")
}
