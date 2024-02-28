package com.carloscsanz.leetcode.topInterview.mergeSortedArray

/**
 * Top Interview 150
 *
 * 88. Merge Sorted Array
 */
object Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var mIndex = m - 1
        var nIndex = n - 1
        var resultIndex = m + n - 1

        while (resultIndex >= 0 && nIndex >= 0) {
            if (mIndex >= 0 && nums1[mIndex] >= nums2[nIndex]) {
                nums1[resultIndex--] = nums1[mIndex--]
            } else {
                nums1[resultIndex--] = nums2[nIndex--]
            }
        }
    }
}

fun main() {
    val example1 = intArrayOf(1, 2, 3, 0, 0, 0)
    Solution.merge(example1, 3, intArrayOf(2, 5, 6), 3)
    println("EXAMPLE 1 - ${example1.toList()}")

    val example2 = intArrayOf(1)
    Solution.merge(example2, 1, intArrayOf(), 0)
    println("EXAMPLE 2 - ${example2.toList()}")

    val example3 = intArrayOf(0)
    Solution.merge(example3, 0, intArrayOf(1), 1)
    println("EXAMPLE 3 - ${example3.toList()}")
}
