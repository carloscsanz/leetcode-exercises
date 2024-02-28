package com.carloscsanz.leetcode.topInterview.removeElement

/**
 * Top Interview 150
 *
 * 27. Remove Element
 */
object Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var idx = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[idx++] = nums[i]
            }
        }

        return idx
    }
}
