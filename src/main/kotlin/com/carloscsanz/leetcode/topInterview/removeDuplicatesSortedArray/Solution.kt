package com.carloscsanz.leetcode.topInterview.removeDuplicatesSortedArray

/**
 * Top Interview 150
 *
 * 26. Remove Duplicates from Sorted Array
 */
object Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var idx = 1

        for (i in 1 until nums.size) {
            if (nums[i] != nums[i -1]) {
                nums[idx++] = nums[i]
            }
        }

        return idx
    }
}