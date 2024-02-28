package com.carloscsanz.leetcode.topInterview.removeElement

/**
 * Top Interview 150
 *
 * 27. Remove Element
 */
object Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var frontIndex = 0
        var backIndex = nums.size - 1
        var count = 0

        while (frontIndex < nums.size) {
            val frontValue = nums[frontIndex]
            val backValue = nums[backIndex]

            if (frontValue == `val`) {
                if (backValue != `val`) {
                    nums[frontIndex++] = nums[backIndex]
                    nums[backIndex--] = `val`
                    count++
                } else {
                    backIndex--
                    count++
                }
            }
        }

        return count
    }
}